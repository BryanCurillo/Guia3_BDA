/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Modelo.Factura;
import Modelo.ModeloFactura;
import Vista.VistaverFacturas;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Danie
 */
public class ControllerVerFacturas {
    
    private VistaverFacturas vistafac;
    private ModeloFactura modelofac;
    int i = 0;
    DefaultTableModel estructuraTabla;

    public ControllerVerFacturas() {
    }

    public ControllerVerFacturas(VistaverFacturas vistafac, ModeloFactura modelofac) {
        this.vistafac = vistafac;
        this.modelofac = modelofac;
        vistafac.setVisible(true);
        cargarDatos(1);
    
    }

    public void inicialControl() {

    }
    
        public void cargarDatos(int opc) {
        vistafac.getjTable1().setRowHeight(50);
        estructuraTabla = (DefaultTableModel) vistafac.getjTable1().getModel();
        estructuraTabla.setRowCount(0);

        List<Factura> listaAli;
            listaAli = modelofac.getFactura();

        i = 0;

        listaAli.stream().sorted((x, y)
                -> x.getPro_nombre().compareToIgnoreCase(y.getPro_nombre())).forEach(emp -> {
            estructuraTabla.addRow(new Object[7]);
            vistafac.getjTable1().setValueAt(emp.getFac_id(), i, 0);
            vistafac.getjTable1().setValueAt(emp.getFac_fecha(), i, 1);
            vistafac.getjTable1().setValueAt(emp.getFac_estado(), i, 2);
            vistafac.getjTable1().setValueAt(emp.getCue_cantidad(), i, 3);
            vistafac.getjTable1().setValueAt(emp.getCue_descripcion(), i, 4);
            vistafac.getjTable1().setValueAt(emp.getProd_precio(), i, 5);
            vistafac.getjTable1().setValueAt(emp.getFac_subtotal(), i, 6);
            i++;
        });

    }
}
