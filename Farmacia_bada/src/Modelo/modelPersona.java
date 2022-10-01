/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bryan
 */
public class modelPersona extends Persona {

    ModeloConexion mc = new ModeloConexion();

    public modelPersona() {
    }


    public boolean setPersona() {
        String sql = "insert into PERSONA (p_cedula, p_nombre, p_apellido,p_correo,p_direccion,p_telefono) "
                + "values('"+getP_cedula()+"','"+getP_apellido()+"','"+getP_nombre()+"','"+getP_correo()+"','"+getP_direccion()+"','"+getP_telefono()+"')";
        System.out.println("persona");
        return mc.accion(sql);//EJECUTAMOS EN INSERT
    }

    public boolean comprobarDuplicado(String cedula) {
        int cant = 0;
        boolean ban = true;

        String sql = "select count(*) from persona where per_cedula= '" + cedula + "'";
        ResultSet rs = mc.consulta(sql);
        try {
            while (rs.next()) {
                cant = rs.getInt(1);
            }
        } catch (SQLException e) {
            Logger.getLogger(modelPersona.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            if (cant!=0) {
                ban=false;
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(modelPersona.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ban;
    }
}
