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
public class Proveedor extends Persona{
    
    private int prov_id;
    private int prov_per_id;
    private String prov_nombre;

    public Proveedor() {
    }

    public Proveedor(int prov_id, int prov_per_id, String prov_nombre) {
        this.prov_id = prov_id;
        this.prov_per_id = prov_per_id;
        this.prov_nombre = prov_nombre;
    }

    public int getProv_id() {
        return prov_id;
    }

    public void setProv_id(int prov_id) {
        this.prov_id = prov_id;
    }

    public int getProv_per_id() {
        return prov_per_id;
    }

    public void setProv_per_id(int prov_per_id) {
        this.prov_per_id = prov_per_id;
    }

    public String getProv_nombre() {
        return prov_nombre;
    }

    public void setProv_nombre(String prov_nombre) {
        this.prov_nombre = prov_nombre;
    }
    
    
    
}
