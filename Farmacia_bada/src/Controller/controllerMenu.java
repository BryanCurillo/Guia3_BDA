/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Vista.VistaRegistrarCli;
import Modelo.ModelCliente;
import Vista.VistaRegistraProducto;
import Modelo.ModelProducto;
import Vista.VistaRegistrarProveedor;
import Modelo.ModelProveedor;
import Vista.VistaVerProveedores;
import Modelo.ModelProveedor;
import Modelo.ModelProducto;
import Modelo.Producto;
import Vista.VistaVerProductos;
import Modelo.ModelCliente;
import Modelo.ModelProducto;
import Modelo.ModeloFactura;
import Vista.vista_factura;


import Vista.Menu;

/**
 *
 * @author Bryan
 */
public class controllerMenu {

    private Menu vista;

    public controllerMenu() {
    }

    public controllerMenu(Menu vista) {
        this.vista = vista;
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
        vista.setTitle("FARMACIA");
    }

    public void iniciaControl() {
        vista.getBtnRegistroCliente().addActionListener(l -> registroEmpleado());
        vista.getBtnRegistroProducto().addActionListener(l->registroProducto());
        vista.getBtnRegistroProveedor().addActionListener(l->registroProveedor());
        vista.getBtnVistaFACTURACION().addActionListener(l->facturacion());
        vista.getBtnVistaProducto().addActionListener(l->VistaProducto());
        vista.getBtnVistaProveedor().addActionListener(l->VistaProv());
        
//
//        ////BOTONES

    }

    //////////////////////////////////////////////////////////////////////////////////////
    //EMPLEADOS
    public void registroEmpleado() {
//        vista.getjDPprincipal().removeAll();
        //Instancio las clases del modelo y la vista
        ModelCliente modeloCli = new ModelCliente();
        VistaRegistrarCli vistaRegistroCli = new VistaRegistrarCli();

        //Agragar vista al desktop pane
        ControllerRegistroCliente controlCli = new ControllerRegistroCliente(vistaRegistroCli, modeloCli);
        controlCli.iniciarControl();
    }

    public void registroProducto() {
//        vista.getjDPprincipal().removeAll();
        //Instancio las clases del modelo y la vista
        ModelProducto modeloCli = new ModelProducto();
        ModelProveedor modelProv = new ModelProveedor();
        VistaRegistraProducto vistaRegistroProd = new VistaRegistraProducto();
        //Agragar vista al desktop pane
        ControllerRegistroProductos controlProd = new ControllerRegistroProductos(vistaRegistroProd, modeloCli, modelProv);
        controlProd.iniciarControl();
    }

    public void registroProveedor() {
//        vista.getjDPprincipal().removeAll();
        //Instancio las clases del modelo y la vista
        ModelProveedor modeloProv = new ModelProveedor();
        VistaRegistrarProveedor vistaRegistroProv = new VistaRegistrarProveedor();

        //Agragar vista al desktop pane
        ControllerRegistroProveedor controlCli = new ControllerRegistroProveedor(vistaRegistroProv, modeloProv);
        controlCli.iniciarControl();
    }

    public void VistaProv() {
//        vista.getjDPprincipal().removeAll();
        //Instancio las clases del modelo y la vista
        ModelProveedor modeloProv = new ModelProveedor();
        VistaVerProveedores vistaRegistroProv = new VistaVerProveedores();

        //Agragar vista al desktop pane
        ControllerVerProveedores controlCli = new ControllerVerProveedores(vistaRegistroProv, modeloProv);
        controlCli.inicialControl();
    }

    public void VistaProducto() {
//        vista.getjDPprincipal().removeAll();
        //Instancio las clases del modelo y la vista
        ModelProducto modeloProv = new ModelProducto();
        VistaVerProductos vistaVistaProd = new VistaVerProductos();

        //Agragar vista al desktop pane
        ControllerVerProducto controlVProd = new ControllerVerProducto(vistaVistaProd, modeloProv);
        controlVProd.inicialControl();
    }

    public void facturacion() {
        //Instancio las clases del modelo y la vista
        ModelCliente modeloCli = new ModelCliente();
        ModelProducto modelProd = new ModelProducto();
        ModeloFactura modelFac = new ModeloFactura();
        vista_factura vistaFac = new vista_factura();

        //Agragar vista al desktop pane
        controllerVenta controlVenta = new controllerVenta(vistaFac, modeloCli, modelProd, modelFac);
        controlVenta.iniciarControl();
    }
}
