/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Danie
 */
public class ModelProducto extends Producto{
    
        ModeloConexion mpgc = new ModeloConexion();

    public boolean setCuerpo() {
        String sql = "INSERT INTO Producto(pro_nombre,pro_descripcion,pro_precio,pro_stock,pro_fechacaducidad,pro_prov_id)  "
                + "  VALUES ('" + getPro_nombre()+ "', " + getPro_descripcion()+ ")" + getProd_precio()+ ")"+ getProd_stock()+ ")"+ getProd_fec_cad()+ ")"+ getProd_prov_id()+ ")";
        return false;

    }
    
}
