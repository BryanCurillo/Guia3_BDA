/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Danie
 */
public class ModeloCuerpo extends Cuerpo {

    ModeloConexion mc = new ModeloConexion();

    public boolean setCuerpo() {
        String sql = "INSERT INTO Cuerpo(cue_descripcion, cue_cantidad, cue_prod_id)  "
                + "  values ('" + getCue_descripcion() + "'," + getCue_cantidad() + "," + getCue_prod_id() + ")";
        return mc.accion(sql);
    }

    public int ObtenerId() {
        int cant = 0;

        String sql = "select max(cue_id)from cuerpo";
        ResultSet rs = mc.consulta(sql);

        try {
            while (rs.next()) {
                cant = rs.getInt(1);
            }
        } catch (SQLException e) {
            Logger.getLogger(modelPersona.class.getName()).log(Level.SEVERE, null, e);
        }
        System.out.println("cueID= " + cant);

        return cant;

    }
}
