/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Danie
 */
public class Cuerpo extends Producto{
    
    private int cue_id ;
    private int cue_prod_id;
    private String cue_descripcion;
    private int cue_cantidad;

    public Cuerpo() {
    }

    public Cuerpo(int cue_id, int cue_prod_id, String cue_descripcion, int cue_cantidad) {
        this.cue_id = cue_id;
        this.cue_prod_id = cue_prod_id;
        this.cue_descripcion = cue_descripcion;
        this.cue_cantidad = cue_cantidad;
    }

    public int getCue_id() {
        return cue_id;
    }

    public void setCue_id(int cue_id) {
        this.cue_id = cue_id;
    }

    public int getCue_prod_id() {
        return cue_prod_id;
    }

    public void setCue_prod_id(int cue_prod_id) {
        this.cue_prod_id = cue_prod_id;
    }

    public String getCue_descripcion() {
        return cue_descripcion;
    }

    public void setCue_descripcion(String cue_descripcion) {
        this.cue_descripcion = cue_descripcion;
    }

    public int getCue_cantidad() {
        return cue_cantidad;
    }

    public void setCue_cantidad(int cue_cantidad) {
        this.cue_cantidad = cue_cantidad;
    }

  
}
