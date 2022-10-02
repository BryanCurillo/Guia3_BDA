/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Modelo.Cliente;
import Modelo.ModelProducto;
import Modelo.ModelProveedor;
import Modelo.Proveedor;
import Modelo.validaciones;
import Vista.VistaRegistraProducto;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Danie
 */
public class ControllerRegistroProductos {

    private VistaRegistraProducto vrp;
    private ModelProducto mc;
    boolean banvista = false;
    boolean banventa = false;
    DefaultTableModel estructuraTabla;
    private ModelProveedor mp;
    int i = 0;
    validaciones mivalidacion = new validaciones();
    SimpleDateFormat formatofecha = new SimpleDateFormat("dd/MM/yyyy");

    public ControllerRegistroProductos(VistaRegistraProducto vrp, ModelProducto mc, ModelProveedor mp) {
        this.vrp = vrp;
        this.mc = mc;
        this.mp = mp;
        banventa = true;
        banvista = false;
        vrp.setVisible(true);

    }

    public ControllerRegistroProductos() {

    }

    public void iniciarControl() {
        vrp.getBtnregistrar().addActionListener(l -> registrarProducto());
        vrp.getBtcancelar().addActionListener(l -> vrp.dispose());
        vrp.getBtnseleccionar().addActionListener(l -> abrirDlgCli());
        vrp.getBtnseleccionardlg().addActionListener(l -> llenarDatosCli());

    }

    public void registrarProducto() {

        if (validar()) {
            String nombre = vrp.getTxtnombre().getText(),
                    descripcion = vrp.getTxtdescripcion().getText();
            double precio = mivalidacion.validarDouble(vrp.getTxtprecio1().getText());
            int cantidad = (int) vrp.getTxtcantidad().getValue();

            Date fechaCad = vrp.getTxtfecha().getDate();
            long d = fechaCad.getTime(); //guardamos en un long el tiempo
            java.sql.Date fechaCaducidad = new java.sql.Date(d);// parseamos al formato del sql  

            int proveedor = Integer.parseInt(vrp.getTxtprovID().getText());

            ModelProducto producto = new ModelProducto();

            producto.setPro_nombre(nombre);
            producto.setPro_descripcion(descripcion);
            producto.setProd_precio(precio);
            producto.setProd_stock(cantidad);
            producto.setProd_fec_cadStr(formatofecha.format(fechaCad));
            producto.setProd_prov_id(proveedor);
            int response = JOptionPane.showConfirmDialog(vrp, "¿Agregar cliente?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
//            ModelProducto pro = new ModelProducto();

            if (response == JOptionPane.YES_OPTION) {
                if (producto.setProducto()) {

                    JOptionPane.showMessageDialog(vrp, "Producto agregado/a correctamente");
                    //                    vrp.dispose();
                    limpiarCampos();
                } else {
                    JOptionPane.showMessageDialog(vrp, "No se pudo agregar al Producto");
                }

            }
        } else {
            System.out.println("hola");
        }

    }

    public void cargarDatosDlgProv(int opc) {

        vrp.getTabladlg().setRowHeight(25);
        estructuraTabla = (DefaultTableModel) vrp.getTabladlg().getModel();
        estructuraTabla.setRowCount(0);

        List<Proveedor> listaproveedor;

//        String busqueda = vistaFac.getTxtbuscardlgAnimal().getText().toLowerCase().trim();
        listaproveedor = mp.getProveedor();

        i = 0;
        listaproveedor.stream().sorted((x, y)
                -> x.getP_nombre().compareToIgnoreCase(y.getP_nombre())).forEach(cli -> {
            estructuraTabla.addRow(new Object[listaproveedor.size()]);
            vrp.getTabladlg().setValueAt(cli.getProv_id(), i, 0);
            vrp.getTabladlg().setValueAt(cli.getP_cedula(), i, 1);
            vrp.getTabladlg().setValueAt(cli.getP_nombre() + " " + cli.getP_apellido(), i, 2);
            vrp.getTabladlg().setValueAt(cli.getP_telefono(), i, 3);
            vrp.getTabladlg().setValueAt(cli.getProv_nombre(), i, 4);
            vrp.getTabladlg().setValueAt(cli.getP_correo(), i, 5);

            i++;
        });

    }

    public void llenarDatosCli() {
        if (vrp.getTabladlg().getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(vrp.getTabladlg(), "No ha seleccionado ningun cliente");
        } else {

//            vistaRegDieta.getTxtidAlimentoNB().setVisible(false);
//            vistaRegDieta.getTxtidAnimalNB().setVisible(false);
//            vistaRegDieta.getTxtidDietaNB().setVisible(false);
            int fila = vrp.getTabladlg().getSelectedRow();
            vrp.getTxtprovID().setText(vrp.getTabladlg().getValueAt(fila, 0).toString());
            vrp.getTxtprovCedula().setText(vrp.getTabladlg().getValueAt(fila, 1).toString());
            vrp.getTxtprovnombre().setText(vrp.getTabladlg().getValueAt(fila, 2).toString());
            vrp.getTxtprovtelefono().setText(vrp.getTabladlg().getValueAt(fila, 3).toString());
            vrp.getTxtprovempresa().setText(vrp.getTabladlg().getValueAt(fila, 4).toString());
            vrp.getTxtprovcorreo().setText(vrp.getTabladlg().getValueAt(fila, 5).toString());

            vrp.getDlgCliente().dispose();
//            vistaRegDieta.getTxtbuscardlgAnimal().setText("");
        }
    }

    public void abrirDlgCli() {
        vrp.getDlgCliente().setLocationRelativeTo(vrp);
        vrp.getDlgCliente().setVisible(true);
        cargarDatosDlgProv(1);
    }

    public boolean validar() {
        boolean ban = true;
        validaciones mivalidacion = new validaciones();

        if (!vrp.getTxtprecio1().getText().isEmpty()) {
            if (mivalidacion.validarDouble(vrp.getTxtprecio1().getText()) == 0) {
                JOptionPane.showMessageDialog(vrp, "Precio invalido");
                ban = false;
            }
        } else {
            JOptionPane.showMessageDialog(vrp, "Ingrese el precio");
            ban = false;
        }

        return ban;

    }

    public void limpiarCampos() {
        vrp.getTxtnombre().setText("");
        vrp.getTxtdescripcion().setText("");
        vrp.getTxtprecio1().setText("");
        vrp.getTxtcantidad().setValue(0);
        vrp.getTxtfecha().setDate(null);
        vrp.getTxtprovCedula().setText("");
        vrp.getTxtprovnombre().setText("");
        vrp.getTxtprovtelefono().setText("");
        vrp.getTxtprovempresa().setText("");
        vrp.getTxtprovcorreo().setText("");

    }
}
