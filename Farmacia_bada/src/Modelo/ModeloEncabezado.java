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
public class ModeloEncabezado extends Encabezado {

    ModeloConexion mc = new ModeloConexion();

    public boolean setEncabezado() {
        String sql = "INSERT INTO Encabezado(enc_fecha, enc_estadofactura, enc_cli_id, enc_numfac)  "
                + "  values ('"+getEnc_fecha()+"','"+getEnc_estadofactura()+"',"+getEnc_cli_id()+","+getEnc_numfac()+")";
         return mc.accion(sql);
    }

    public int ObtenerId() {
        int cant = 0;

        String sql = "select max(enc_id)from encabezado";
        ResultSet rs = mc.consulta(sql);

        try {
            while (rs.next()) {
                cant = rs.getInt(1);
            }
        } catch (SQLException e) {
            Logger.getLogger(modelPersona.class.getName()).log(Level.SEVERE, null, e);
        }
        System.out.println("encaID= " + cant);
        return cant;

    }
}
