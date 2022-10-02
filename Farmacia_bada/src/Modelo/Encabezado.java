/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author Danie
 */
public class Encabezado extends Cuerpo{

    private int enc_id;
    private String enc_fecha;
    private String enc_estadofactura;
    private int enc_cli_id;
    private int enc_numfac;

    public Encabezado() {
    }

    public Encabezado(int enc_id, String enc_fecha, String enc_estadofactura, int enc_cli_id, int enc_numfac) {
        this.enc_id = enc_id;
        this.enc_fecha = enc_fecha;
        this.enc_estadofactura = enc_estadofactura;
        this.enc_cli_id = enc_cli_id;
        this.enc_numfac = enc_numfac;
    }

    public int getEnc_id() {
        return enc_id;
    }

    public void setEnc_id(int enc_id) {
        this.enc_id = enc_id;
    }

    public String getEnc_fecha() {
        return enc_fecha;
    }

    public void setEnc_fecha(String enc_fecha) {
        this.enc_fecha = enc_fecha;
    }

    public String getEnc_estadofactura() {
        return enc_estadofactura;
    }

    public void setEnc_estadofactura(String enc_estadofactura) {
        this.enc_estadofactura = enc_estadofactura;
    }

    public int getEnc_cli_id() {
        return enc_cli_id;
    }

    public void setEnc_cli_id(int enc_cli_id) {
        this.enc_cli_id = enc_cli_id;
    }

    public int getEnc_numfac() {
        return enc_numfac;
    }

    public void setEnc_numfac(int enc_numfac) {
        this.enc_numfac = enc_numfac;
    }

   
}
