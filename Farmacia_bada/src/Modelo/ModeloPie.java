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
public class ModeloPie extends Pie {

    ModeloConexion mc = new ModeloConexion();

    public boolean setPie() {
        String sql = "INSERT INTO Pie(pie_subtotal, pie_iva, pie_total)  "
                + "  values ("+getPie_subtotal()+","+getPie_iva()+","+getPie_total()+")";

        return mc.accion(sql);
    }

    public int ObtenerId() {
        int cant = 0;

        String sql = "select max(pie_id)from pie";
        ResultSet rs = mc.consulta(sql);

        try {
            while (rs.next()) {
                cant = rs.getInt(1);
            }
        } catch (SQLException e) {
            Logger.getLogger(modelPersona.class.getName()).log(Level.SEVERE, null, e);
        }
        
        System.out.println("pieID= " + cant);
        return cant;

    }
}
