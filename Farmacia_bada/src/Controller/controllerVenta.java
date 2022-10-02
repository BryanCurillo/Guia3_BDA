/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;

import Modelo.ModeloConexion;
import Vista.vista_factura;
import Modelo.Cliente;
import Modelo.ModelCliente;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bryan
 */
public class controllerVenta {

    private vista_factura vistaFac;

    private ModelCliente modelCliente;

    SimpleDateFormat formatofecha = new SimpleDateFormat("dd-MM-yyyy");
    DefaultTableModel estructuraTabla;
    int i = 0;

    public controllerVenta() {
    }

    public controllerVenta(vista_factura vistaFac, ModelCliente modelCliente) {
        this.vistaFac = vistaFac;
        this.modelCliente = modelCliente;
        vistaFac.setVisible(true);
    }
    
    public void iniciarControl(){
       vistaFac.getBtnBuscarCliente().addActionListener(l->abrirDlgCli());
       vistaFac.getBtnseleccionardlg().addActionListener(l->llenarDatosCli());
    }

    public void cargarDatosDlgCli(int opc) {

        vistaFac.getTabladlg().setRowHeight(25);
        estructuraTabla = (DefaultTableModel) vistaFac.getTabladlg().getModel();
        estructuraTabla.setRowCount(0);

        List<Cliente> listaCliente;

//        String busqueda = vistaFac.getTxtbuscardlgAnimal().getText().toLowerCase().trim();
        listaCliente = modelCliente.getClientes();

        i = 0;
        listaCliente.stream().sorted((x, y)
                -> x.getP_nombre().compareToIgnoreCase(y.getP_nombre())).forEach(cli -> {
            estructuraTabla.addRow(new Object[listaCliente.size()]);
            vistaFac.getTabladlg().setValueAt(cli.getCli_id(), i, 0);
            vistaFac.getTabladlg().setValueAt(cli.getP_cedula(), i, 1);
            vistaFac.getTabladlg().setValueAt(cli.getP_nombre(), i, 2);
            vistaFac.getTabladlg().setValueAt(cli.getP_apellido(), i, 3);
            vistaFac.getTabladlg().setValueAt(cli.getP_telefono(), i, 4);
            vistaFac.getTabladlg().setValueAt(cli.getP_correo(), i, 5);
            vistaFac.getTabladlg().setValueAt(cli.getP_direccion(), i, 6);
            i++;
        });

    }

    public void llenarDatosCli() {
        if (vistaFac.getTabladlg().getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(vistaFac.getTabladlg(), "No ha seleccionado ningun cliente");
        } else {
            
//            vistaRegDieta.getTxtidAlimentoNB().setVisible(false);
//            vistaRegDieta.getTxtidAnimalNB().setVisible(false);
//            vistaRegDieta.getTxtidDietaNB().setVisible(false);

            int fila = vistaFac.getTabladlg().getSelectedRow();
            vistaFac.getTxtCliId().setText(vistaFac.getTabladlg().getValueAt(fila, 0).toString());
            vistaFac.getTxtCliCedula().setText(vistaFac.getTabladlg().getValueAt(fila, 1).toString());
            vistaFac.getTxtCliNombre().setText(vistaFac.getTabladlg().getValueAt(fila, 2).toString()+" "+vistaFac.getTabladlg().getValueAt(fila, 3).toString());
            vistaFac.getTxtCliTelefono().setText(vistaFac.getTabladlg().getValueAt(fila, 4).toString());
            vistaFac.getTxtCliCorreo().setText(vistaFac.getTabladlg().getValueAt(fila, 5).toString());
            vistaFac.getTxtCliDireccion().setText(vistaFac.getTabladlg().getValueAt(fila, 6).toString());

            vistaFac.getDlgCliente().dispose();
//            vistaRegDieta.getTxtbuscardlgAnimal().setText("");
        }
    }

    public void abrirDlgCli() {
        vistaFac.getDlgCliente().setLocationRelativeTo(vistaFac);
        vistaFac.getDlgCliente().setVisible(true);
        cargarDatosDlgCli(1);
    }

}
