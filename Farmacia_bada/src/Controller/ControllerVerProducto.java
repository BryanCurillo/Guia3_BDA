/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Modelo.ModelProducto;
import Modelo.Producto;
import Vista.VistaVerProductos;
import java.awt.Image;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Danie
 */
public class ControllerVerProducto {

    private VistaVerProductos vistapro;
    private ModelProducto modelopro;
    int i = 0;
    DefaultTableModel estructuraTabla;

    public ControllerVerProducto() {
    }

    public ControllerVerProducto(VistaVerProductos vistapro, ModelProducto modelopro) {
        this.vistapro = vistapro;
        this.modelopro = modelopro;
        vistapro.setVisible(true);
        cargarDatos(1);
    }
    
        public void inicialControl() {

    }

    public void cargarDatos(int opc) {
        vistapro.getjTable1().setRowHeight(50);
        estructuraTabla = (DefaultTableModel) vistapro.getjTable1().getModel();
        estructuraTabla.setRowCount(0);

        List<Producto> listaAli;
            listaAli = modelopro.getProducto();

        i = 0;

        listaAli.stream().sorted((x, y)
                -> x.getPro_nombre().compareToIgnoreCase(y.getPro_nombre())).forEach(emp -> {
            estructuraTabla.addRow(new Object[7]);
            vistapro.getjTable1().setValueAt(emp.getPro_id(), i, 0);
            vistapro.getjTable1().setValueAt(emp.getPro_nombre(), i, 1);
            vistapro.getjTable1().setValueAt(emp.getPro_descripcion(), i, 2);
            vistapro.getjTable1().setValueAt(emp.getProd_precio(), i, 3);
            vistapro.getjTable1().setValueAt(emp.getProd_stock(), i, 4);
            vistapro.getjTable1().setValueAt(emp.getProd_fec_cad(), i, 5);
            vistapro.getjTable1().setValueAt(emp.getProd_prov_id(), i, 6);
            i++;
        });

    }

}
