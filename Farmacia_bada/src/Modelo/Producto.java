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
    
    private int pro_id;
    private String pro_nombre;
    private String pro_descripcion;
    private double prod_precio;
    private int prod_stock;
    private Date prod_fec_cad;
    private String prod_fec_cadStr;
    private int prod_prov_id;

    public Producto() {
    }

    public Producto(int pro_id, String pro_nombre, String pro_descripcion, double prod_precio, int prod_stock, Date prod_fec_cad, String prod_fec_cadStr, int prod_prov_id) {
        this.pro_id = pro_id;
        this.pro_nombre = pro_nombre;
        this.pro_descripcion = pro_descripcion;
        this.prod_precio = prod_precio;
        this.prod_stock = prod_stock;
        this.prod_fec_cad = prod_fec_cad;
        this.prod_fec_cadStr = prod_fec_cadStr;
        this.prod_prov_id = prod_prov_id;
    }



    public int getPro_id() {
        return pro_id;
    }

    public void setPro_id(int pro_id) {
        this.pro_id = pro_id;
    }

    public String getPro_nombre() {
        return pro_nombre;
    }

    public void setPro_nombre(String pro_nombre) {
        this.pro_nombre = pro_nombre;
    }

    public String getPro_descripcion() {
        return pro_descripcion;
    }

    public void setPro_descripcion(String pro_descripcion) {
        this.pro_descripcion = pro_descripcion;
    }

    public double getProd_precio() {
        return prod_precio;
    }

    public void setProd_precio(double prod_precio) {
        this.prod_precio = prod_precio;
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

    public int getProd_prov_id() {
        return prod_prov_id;
    }

    public void setProd_prov_id(int prod_prov_id) {
        this.prod_prov_id = prod_prov_id;
    }

    public String getProd_fec_cadStr() {
        return prod_fec_cadStr;
    }

    public void setProd_fec_cadStr(String prod_fec_cadStr) {
        this.prod_fec_cadStr = prod_fec_cadStr;
    }

   
    
}


