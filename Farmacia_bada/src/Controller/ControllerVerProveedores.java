/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Modelo.ModelProducto;
import Modelo.ModelProveedor;
import Modelo.Producto;
import Modelo.Proveedor;
import Vista.VistaVerProductos;
import Vista.VistaVerProveedores;
import Modelo.ModelProveedor;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Danie
 */
public class ControllerVerProveedores {

    private VistaVerProveedores vistaprov;
    private ModelProveedor modeloprov;
    int i = 0;
    DefaultTableModel estructuraTabla;

    public ControllerVerProveedores() {
    }

    public ControllerVerProveedores(VistaVerProveedores vistaprov, ModelProveedor modeloprov) {
        this.vistaprov = vistaprov;
        this.modeloprov = modeloprov;
        vistaprov.setVisible(true);
        
    }

    public void inicialControl() {
cargarDatosDlgProv(1);
    }

   
    public void cargarDatosDlgProv(int opc) {

        vistaprov.getTabladlg().setRowHeight(25);
        estructuraTabla = (DefaultTableModel) vistaprov.getTabladlg().getModel();
        estructuraTabla.setRowCount(0);

        List<Proveedor> listaproveedor;

//        String busqueda = vistaFac.getTxtbuscardlgAnimal().getText().toLowerCase().trim();
        listaproveedor = modeloprov.getProveedor();

        i = 0;
        listaproveedor.stream().sorted((x, y)
                
                -> x.getP_nombre().compareToIgnoreCase(y.getP_nombre())).forEach(cli -> {
            estructuraTabla.addRow(new Object[listaproveedor.size()]);
            vistaprov.getTabladlg().setValueAt(cli.getProv_id(), i, 0);
            vistaprov.getTabladlg().setValueAt(cli.getP_cedula(), i, 1);
            vistaprov.getTabladlg().setValueAt(cli.getP_nombre() + " " + cli.getP_apellido(), i, 2);
            vistaprov.getTabladlg().setValueAt(cli.getP_telefono(), i, 3);
            vistaprov.getTabladlg().setValueAt(cli.getProv_nombre(), i, 4);
            vistaprov.getTabladlg().setValueAt(cli.getP_correo(), i, 5);

            i++;
        });

    }

}
