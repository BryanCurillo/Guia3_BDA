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

    public modelPersona(int p_id, String p_cedula, String p_nombre, String p_apellido, Date p_fechanac, String p_telefono, String p_direccion, String p_correo) {
        super(p_id, p_cedula, p_nombre, p_apellido, p_fechanac, p_telefono, p_direccion, p_correo);
    }

    public boolean setPersona() {
        String sql = "insert into PERSONA (p_cedula, p_nombre, p_apellido,p_correo,p_direccion,p_telefono) "
                + "values('" + getP_cedula() + "','" + getP_apellido() + "','" + getP_nombre() + "','" + getP_correo() + "','" + getP_direccion() + "','" + getP_telefono() + "')";
        System.out.println();

        return mc.accion(sql);//EJECUTAMOS EN INSERT
    }

    public boolean comprobarDuplicado(String cedula) {
        int cant = 0;
        boolean ban = true;

        String sql = "select count(*) from persona where p_cedula= '" + cedula + "'";
        ResultSet rs = mc.consulta(sql);
        try {
            while (rs.next()) {
                cant = rs.getInt(1);
            }
        } catch (SQLException e) {
            Logger.getLogger(modelPersona.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            if (cant != 0) {
                ban = false;
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(modelPersona.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ban;
    }

    public int ObtenerId() {
        int cant = 0;

        String sql = "select max(p_id)from persona";
        ResultSet rs = mc.consulta(sql);

        try {
            while (rs.next()) {
                cant = rs.getInt(1);
            }
        } catch (SQLException e) {
            Logger.getLogger(modelPersona.class.getName()).log(Level.SEVERE, null, e);
        }
        if (cant == 0) {
            System.out.println("NO VALIO");
        } else {
            System.out.println("si valio xd");
        }
        return cant;

    }
}
