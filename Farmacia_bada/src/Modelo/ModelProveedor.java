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
public class ModelProveedor extends Persona {
    
        ModeloConexion mpgc = new ModeloConexion();

  
       public List<Proveedor> getProveedor() {
        List<Proveedor> listaProveedores = new ArrayList<>();
        String sql = "SELECT * FROM proveedor";
        ResultSet rs = mpgc.consulta(sql);
        try {
            while (rs.next()) {
                Proveedor miprov = new Proveedor();
                
                miprov.setProv_id(rs.getInt(1));
                miprov.setProv_nombre(rs.getString(2));
                miprov.setProv_per_id(rs.getInt(3));
                System.out.println(miprov.getProv_nombre());
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
