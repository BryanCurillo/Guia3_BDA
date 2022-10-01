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
public class Producto {
    
    private int prod_id;
    private String prod_nombre;
    private int prod_stock;
    private Date prod_fec_cad;
    private double prod_precio;
    private String prod_descripcion;
    private int prod_prov_id;

    public int getProd_id() {
        return prod_id;
    }

    public void setProd_id(int prod_id) {
        this.prod_id = prod_id;
    }

    public String getProd_nombre() {
        return prod_nombre;
    }

    public void setProd_nombre(String prod_nombre) {
        this.prod_nombre = prod_nombre;
    }

    public int getProd_stock() {
        return prod_stock;
    }

    public void setProd_stock(int prod_stock) {
        this.prod_stock = prod_stock;
    }

    public Date getProd_fec_cad() {
        return prod_fec_cad;
    }

    public void setProd_fec_cad(Date prod_fec_cad) {
        this.prod_fec_cad = prod_fec_cad;
    }

    public double getProd_precio() {
        return prod_precio;
    }

    public void setProd_precio(double prod_precio) {
        this.prod_precio = prod_precio;
    }

    public String getProd_descripcion() {
        return prod_descripcion;
    }

    public void setProd_descripcion(String prod_descripcion) {
        this.prod_descripcion = prod_descripcion;
    }

    public int getProd_prov_id() {
        return prod_prov_id;
    }

    public void setProd_prov_id(int prod_prov_id) {
        this.prod_prov_id = prod_prov_id;
    }
    
    
    
}


