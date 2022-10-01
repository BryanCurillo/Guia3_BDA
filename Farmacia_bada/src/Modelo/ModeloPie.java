/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Danie
 */
public class ModeloPie extends Pie{

    ModeloConexion mpgc = new ModeloConexion();

    public boolean setPie() {
        String sql = "INSERT INTO Pie(pie_subtotal, pie_iva, pie_total)  "
                + "  VALUES ('" + getPie_subtotal()+ "', " + getPie_subtotal()+ ")" + getPie_total()+ ")";

        return false;
    }
}
