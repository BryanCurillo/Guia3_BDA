/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Danie
 */
public class Pie extends Cuerpo{
    
    private int pie_id;
    private double pie_subtotal;
    private double pie_iva;
    private double pie_total;

    public Pie() {
    }

    public Pie(int pie_id, double pie_subtotal, double pie_iva, double pie_total) {
        this.pie_id = pie_id;
        this.pie_subtotal = pie_subtotal;
        this.pie_iva = pie_iva;
        this.pie_total = pie_total;
    }

    public int getPie_id() {
        return pie_id;
    }

    public void setPie_id(int pie_id) {
        this.pie_id = pie_id;
    }

    public double getPie_subtotal() {
        return pie_subtotal;
    }

    public void setPie_subtotal(double pie_subtotal) {
        this.pie_subtotal = pie_subtotal;
    }

    public double getPie_iva() {
        return pie_iva;
    }

    public void setPie_iva(double pie_iva) {
        this.pie_iva = pie_iva;
    }

    public double getPie_total() {
        return pie_total;
    }

    public void setPie_total(double pie_total) {
        this.pie_total = pie_total;
    }

  
}
