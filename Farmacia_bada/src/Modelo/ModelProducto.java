/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

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

}
