/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;


import Modelo.Cliente;
import Modelo.Factura;
import Modelo.Producto;
import Vista.vista_factura;
import Modelo.ModelCliente;
import Modelo.ModelProducto;
import Modelo.ModeloFactura;
import Modelo.ModeloEncabezado;
import Modelo.ModeloCuerpo;
import Modelo.ModeloPie;

import java.time.LocalDate;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bryan
 */
public class controllerVenta {

    private vista_factura vistaFac;

    private ModelCliente modelCliente;
    private ModelProducto modelProducto;
    private ModeloFactura modelFactura;

    SimpleDateFormat formatofecha = new SimpleDateFormat("dd-MM-yyyy");
    DefaultTableModel estructuraTabla;
    int i = 0;

    public controllerVenta() {
    }

    public controllerVenta(vista_factura vistaFac, ModelCliente modelCliente, ModelProducto modelProducto, ModeloFactura modelFactura) {
        this.vistaFac = vistaFac;
        this.modelCliente = modelCliente;
        this.modelProducto = modelProducto;
        this.modelFactura = modelFactura;
        vistaFac.getTxtNoFac().setText(String.valueOf((modelFactura.ObtenerId() + 1)));
        vistaFac.setVisible(true);
    }

    public void iniciarControl() {
        vistaFac.getBtnBuscarCliente().addActionListener(l -> abrirDlgCli());
        vistaFac.getBtnBuscarProd().addActionListener(l -> abrirDlgProd());
        vistaFac.getBtnseleccionardlg().addActionListener(l -> llenarDatosCli());
        vistaFac.getBtnseleccionardlgProd().addActionListener(l -> llenarDatosProd());
        vistaFac.getBtnGenerarFactura().addActionListener(l -> registrarFac());
        vistaFac.getBtnProcesarPago().addActionListener(l -> procesarPago());
    }

    public void registrarFac() {

//        if (validar()) {
        //ENCABEZADO
//        int enc_id = 0,
        int enc_cli_id = Integer.parseInt(vistaFac.getTxtCliId().getText()),
                enc_numfac = Integer.parseInt(vistaFac.getTxtNoFac().getText());
        Date fechaFac = java.sql.Date.valueOf(LocalDate.now());
        String enc_fecha = formatofecha.format(fechaFac),
                enc_estado = "Pendiente";

        ModeloEncabezado enca = new ModeloEncabezado();
        enca.setEnc_fecha(enc_fecha);
        enca.setEnc_estadofactura(enc_estado);
        enca.setEnc_cli_id(enc_cli_id);
        enca.setEnc_numfac(enc_numfac);

        //CUERPO
//        int cue_id = 0,
        int cue_cantidad = (int) vistaFac.getSpiCantidad().getValue(),
                cue_prod_id = Integer.parseInt(vistaFac.getTxtProdCodigo().getText());
        String cue_descripcion = vistaFac.getTxtDescripcion().getText();

        ModeloCuerpo cuerpo = new ModeloCuerpo();
        cuerpo.setCue_descripcion(cue_descripcion);
        cuerpo.setCue_cantidad(cue_cantidad);
        cuerpo.setCue_prod_id(cue_prod_id);

        //PIE
//        int pie_id = 0;
        double pie_subtotal = 0,
                pie_iva = 0,
                pie_total = 0;

        ModeloPie pie = new ModeloPie();
        pie.setPie_subtotal(pie_subtotal);
        pie.setPie_iva(pie_iva);
        pie.setPie_total(pie_total);

        int response = JOptionPane.showConfirmDialog(vistaFac, "¿Generar Factura?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
//            ModelProducto pro = new ModelProducto();
        if (response == JOptionPane.YES_OPTION) {

            if (enca.setEncabezado() && cuerpo.setCuerpo() && pie.setPie()) {
                //FACTURA
//        int fac_id = 0,
                int fac_enca_id = enca.ObtenerId(),
                        fac_cue_id = cuerpo.ObtenerId(),
                        fac_pie_id = pie.ObtenerId();

                String fac_fecha = formatofecha.format(fechaFac),
                        fac_estado = "Pendiante";

                ModeloFactura fac = new ModeloFactura();
                fac.setFac_enc_id(fac_enca_id);
                fac.setFac_cue_id(fac_cue_id);
                fac.setFac_pie_id(fac_pie_id);
                fac.setFac_fecha(fac_fecha);
                fac.setFac_estado(fac_estado);

                if (fac.setFactura()) {
                    generarFac();
                    JOptionPane.showMessageDialog(vistaFac, "Factura generada correctamente");
//                    vrp.dispose();
                } else {
                    JOptionPane.showMessageDialog(vistaFac, "No se pudo generar la factura");
                }
            } else {
                System.out.println("NO SE PUDO INSERTAR");
            }
        }

    }

    public void generarFac() {
        List<Factura> listaFac;
//        String busqueda = vistaFac.getTxtbuscardlgAnimal().getText().toLowerCase().trim();
        listaFac = modelFactura.generarFactura(modelFactura.ObtenerId());

        i = 0;
        listaFac.stream().forEach(fac -> {
            vistaFac.getTxtSUBTOTAL().setText(String.valueOf(fac.getFac_subtotal()));
            vistaFac.getTxtIVA().setText(String.valueOf(fac.getFac_IVA()));
            vistaFac.getTxtTOTAL().setText(String.valueOf(fac.getFac_TOTAL()));
        });
    }

    public void procesarPago(){
        modelFactura.executeFac(modelFactura.ObtenerId());

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
            vistaFac.getTxtCliNombre().setText(vistaFac.getTabladlg().getValueAt(fila, 2).toString() + " " + vistaFac.getTabladlg().getValueAt(fila, 3).toString());
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

    public void cargarDatosDlgProd(int opc) {

        vistaFac.getTabladlgProd().setRowHeight(25);
        estructuraTabla = (DefaultTableModel) vistaFac.getTabladlgProd().getModel();
        estructuraTabla.setRowCount(0);

        List<Producto> listaProducto;

//        String busqueda = vistaFac.getTxtbuscardlgAnimal().getText().toLowerCase().trim();
        listaProducto = modelProducto.getProducto();

        i = 0;
        listaProducto.stream().sorted((x, y)
                -> x.getPro_nombre().compareToIgnoreCase(y.getPro_nombre())).forEach(cli -> {
            estructuraTabla.addRow(new Object[listaProducto.size()]);
            vistaFac.getTabladlgProd().setValueAt(cli.getPro_id(), i, 0);
            vistaFac.getTabladlgProd().setValueAt(cli.getPro_nombre(), i, 1);
            vistaFac.getTabladlgProd().setValueAt(cli.getPro_descripcion(), i, 2);
            vistaFac.getTabladlgProd().setValueAt(cli.getProd_precio(), i, 3);
            vistaFac.getTabladlgProd().setValueAt(cli.getProd_stock(), i, 4);
            vistaFac.getTabladlgProd().setValueAt(cli.getProd_fec_cad(), i, 5);
            i++;
        });

    }

    public void llenarDatosProd() {
        if (vistaFac.getTabladlgProd().getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(vistaFac.getTabladlgProd(), "No ha seleccionado ningun cliente");
        } else {

//            vistaRegDieta.getTxtidAlimentoNB().setVisible(false);
//            vistaRegDieta.getTxtidAnimalNB().setVisible(false);
//            vistaRegDieta.getTxtidDietaNB().setVisible(false);
            int fila = vistaFac.getTabladlgProd().getSelectedRow();
            vistaFac.getTxtProdCodigo().setText(vistaFac.getTabladlgProd().getValueAt(fila, 0).toString());
            vistaFac.getTxtProdNombre().setText(vistaFac.getTabladlgProd().getValueAt(fila, 1).toString());
            vistaFac.getTxtDescripcion().setText(vistaFac.getTabladlgProd().getValueAt(fila, 2).toString());
            vistaFac.getTxtProdPrecio().setText(vistaFac.getTabladlgProd().getValueAt(fila, 3).toString());

            vistaFac.getDlgProducto().dispose();
//            vistaRegDieta.getTxtbuscardlgAnimal().setText("");
        }
    }

    public void abrirDlgProd() {
        vistaFac.getDlgProducto().setLocationRelativeTo(vistaFac);
        vistaFac.getDlgProducto().setVisible(true);
        cargarDatosDlgProd(1);
    }

}
