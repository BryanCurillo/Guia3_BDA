/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Controller.ControllerRegistroCliente;
import Controller.controllerVenta;
import Modelo.ModelCliente;
import Modelo.ModelProveedor;
import Modelo.ModelProducto;
import Vista.VistaRegistraProducto;
import Controller.ControllerRegistroProductos;
import Vista.VistaRegistrarCli;
import Vista.vista_factura;
import Vista.vista_factura;

/**
 *
 * @author carlos
 */
public class Farmacia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ModelCliente modelC = new ModelCliente();
        VistaRegistrarCli vista = new VistaRegistrarCli();
//        ControllerRegistroCliente controllerC = new ControllerRegistroCliente(vista, modelC);
//        controllerC.iniciarControl();

        vista_factura vistaFac = new vista_factura();
        
        ModelProducto ModelP = new ModelProducto();
        ModelProveedor ModeloPro = new ModelProveedor();
        VistaRegistraProducto vistaP = new VistaRegistraProducto();
        ControllerRegistroProductos ControllerP = new ControllerRegistroProductos(vistaP, ModelP, ModeloPro);
        ControllerP.iniciarControl();

        
        
//        controllerVenta controllerV = new controllerVenta(vistaFac, modelC);
//        controllerV.iniciarControl();

    }

}
