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
public class ModelProducto extends Producto {

    ModeloConexion mc = new ModeloConexion();

    public boolean setProducto() {
        System.out.println("PRODUCTOFECHA="+getProd_fec_cadStr());
        String sql = "insert into PRODUCTO (pro_nombre,pro_descripcion,pro_precio,pro_stock,pro_fechacaducidad,pro_prov_id)  "
                + "  values ('" + getPro_nombre() + "','" + getPro_descripcion() + "'," + getProd_precio() + "," + getProd_stock() + ",'" + getProd_fec_cadStr()+ "'," + getProd_prov_id() + ")";
        return mc.accion(sql);
    }
    
        public List<Producto> getProducto() {
        List<Producto> listaProductos = new ArrayList<>();
        String sql = "select * from producto";
        ResultSet rs = mc.consulta(sql);
        try {
            while (rs.next()) {
                Producto miprod = new Producto();

                miprod.setPro_id(rs.getInt(1));
                miprod.setPro_nombre(rs.getString(2));
                miprod.setPro_descripcion(rs.getString(3));
                miprod.setProd_precio(rs.getDouble(4));
                miprod.setProd_stock(rs.getInt(5));
                miprod.setProd_fec_cad(rs.getDate(6));
                miprod.setProd_prov_id(rs.getInt(7));

                listaProductos.add(miprod);
            }
        } catch (SQLException e) {
            Logger.getLogger(ModelProveedor.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(ModelProveedor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaProductos;
    }

}
