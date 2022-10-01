/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Danie
 */
public class ModeloCuerpo extends Cuerpo {

    ModeloConexion mpgc = new ModeloConexion();

    public boolean setCuerpo() {
        String sql = "INSERT INTO Cuerpo(cue_descripcion, cue_cantidad, cue_prod_id)  "
                + "  VALUES ('" + getCue_descripcion() + "', " + getCue_cantidad() + ")" + getCue_prod_id() + ")";
        return false;

    }
}
