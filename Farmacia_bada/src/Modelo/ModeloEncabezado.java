/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Danie
 */
public class ModeloEncabezado extends Encabezado {
    
    ModeloConexion mpgc = new ModeloConexion();
    
        public boolean setEncabezado() {
        String sql = "INSERT INTO Encabezado(enc_fecha, enc_estadofactura, enc_cli_id, enc_numfac)  "
                + "  VALUES ('" + getEnc_fecha()+ "', " + getEnc_estadofactura()+ ")" + getEnc_cli_id()+ ")"+ getEnc_numfac()+ ")";
        return false;
        
    }
}
       
