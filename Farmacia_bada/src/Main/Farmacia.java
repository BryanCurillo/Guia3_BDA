/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Controller.controllerMenu;
import Vista.Menu;

/**
 *
 * @author carlos
 */
public class Farmacia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Menu Menu = new Menu();
        controllerMenu controllerL = new controllerMenu(Menu);
        controllerL.iniciaControl();
    }

}
