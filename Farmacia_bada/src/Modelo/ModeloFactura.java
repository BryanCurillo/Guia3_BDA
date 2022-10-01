/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Danie
 */
public class ModeloFactura extends Factura{
    
        ModeloConexion mpgc = new ModeloConexion();

    public boolean setFactura() {
        String sql = "INSERT INTO Factura(fac_enc_id, fac_cue_id, fac_pie_id, fac_fecha, fac_estado)  "
                + "  VALUES ('" + getFac_enc_id()+ "', " + getFac_cue_id()+ ")" + getFac_pie_id()+ ")"+ getFac_fecha()+ ")"+ getFac_estado()+ ")";

        return mpgc.accion(sql);
    
}
    
}
