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
public class Factura extends Pie{
    
    private int fac_id;
    private int fac_enc_id;
    private int fac_cue_id; 
    private int fac_pie_id; 
    private Date fac_fecha;
    private String fac_estado;
    private double fac_subtotal;

    public Factura() {
    }

    public Factura(int fac_id, int fac_enc_id, int fac_cue_id, int fac_pie_id, Date fac_fecha, String fac_estado, double fac_subtotal) {
        this.fac_id = fac_id;
        this.fac_enc_id = fac_enc_id;
        this.fac_cue_id = fac_cue_id;
        this.fac_pie_id = fac_pie_id;
        this.fac_fecha = fac_fecha;
        this.fac_estado = fac_estado;
        this.fac_subtotal = fac_subtotal;
    }

    public int getFac_id() {
        return fac_id;
    }

    public void setFac_id(int fac_id) {
        this.fac_id = fac_id;
    }

    public int getFac_enc_id() {
        return fac_enc_id;
    }

    public void setFac_enc_id(int fac_enc_id) {
        this.fac_enc_id = fac_enc_id;
    }

    public int getFac_cue_id() {
        return fac_cue_id;
    }

    public void setFac_cue_id(int fac_cue_id) {
        this.fac_cue_id = fac_cue_id;
    }

    public int getFac_pie_id() {
        return fac_pie_id;
    }

    public void setFac_pie_id(int fac_pie_id) {
        this.fac_pie_id = fac_pie_id;
    }

    public Date getFac_fecha() {
        return fac_fecha;
    }

    public void setFac_fecha(Date fac_fecha) {
        this.fac_fecha = fac_fecha;
    }

    public String getFac_estado() {
        return fac_estado;
    }

    public void setFac_estado(String fac_estado) {
        this.fac_estado = fac_estado;
    }

    public double getFac_subtotal() {
        return fac_subtotal;
    }

    public void setFac_subtotal(double fac_subtotal) {
        this.fac_subtotal = fac_subtotal;
    }

  
}
