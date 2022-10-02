/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Danie
 */
public class ModelProveedor extends Proveedor {

    ModeloConexion mpgc = new ModeloConexion();

    public boolean setClientes() {
        String sql = "INSERT INTO proveedor(prov_per_id,prov_nombre)  "
                + "  VALUES ('" + getProv_per_id()+ "', '" + getProv_nombre()+ "')";
        System.out.println(getProv_per_id());
        return mpgc.accion(sql);

    }

    public List<Proveedor> getProveedor() {
        List<Proveedor> listaProveedores = new ArrayList<>();
        String sql = "SELECT * from proveedor prov join persona per on (prov.prov_per_id = per.p_id)";
        ResultSet rs = mpgc.consulta(sql);
        try {
            while (rs.next()) {
                Proveedor miprov = new Proveedor();

                miprov.setProv_id(rs.getInt(1));
                miprov.setProv_per_id(rs.getInt(2));
                miprov.setProv_nombre(rs.getString(3));

                miprov.setP_id(rs.getInt(4));
                miprov.setP_cedula(rs.getString(5));
                miprov.setP_nombre(rs.getString(6));
                miprov.setP_apellido(rs.getString(7));
                miprov.setP_correo(rs.getString(8));
                miprov.setP_direccion(rs.getString(9));
                miprov.setP_telefono(rs.getString(10));

                listaProveedores.add(miprov);
            }
        } catch (SQLException e) {
            Logger.getLogger(ModelProveedor.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(ModelProveedor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaProveedores;
    }
}
