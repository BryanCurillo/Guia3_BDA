/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Controller.ControllerRegistroCliente;
import Modelo.ModelCliente;
import Vista.VistaRegistrarCli;
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
      ControllerRegistroCliente controllerC = new ControllerRegistroCliente(vista, modelC);
      controllerC.iniciarControl();

       
    }
    
}
