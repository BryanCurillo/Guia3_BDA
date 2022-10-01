/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Danie
 */
public class Tipo_cliente {
    
    private int tp_id;
    private String tp_nombre;

    public Tipo_cliente(int tp_id, String tp_nombre) {
        this.tp_id = tp_id;
        this.tp_nombre = tp_nombre;
    }

    public int getTp_id() {
        return tp_id;
    }

    public void setTp_id(int tp_id) {
        this.tp_id = tp_id;
    }

    public String getTp_nombre() {
        return tp_nombre;
    }

    public void setTp_nombre(String tp_nombre) {
        this.tp_nombre = tp_nombre;
    }
    
    
    
}
