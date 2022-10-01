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

public class Persona {
    
    private int    p_id;
    private String p_cedula;
    private String p_nombre;
    private String p_apellido;
    private Date   p_fechanac;
    private String p_telefono;
    private String p_direccion;
    private String p_correo;        

    public Persona() {
        
    }
    
    public Persona(int p_id, String p_cedula, String p_nombre, String p_apellido, Date p_fechanac, String p_telefono, String p_direccion, String p_correo) {
        this.p_id = p_id;
        this.p_cedula = p_cedula;
        this.p_nombre = p_nombre;
        this.p_apellido = p_apellido;
        this.p_fechanac = p_fechanac;
        this.p_telefono = p_telefono;
        this.p_direccion = p_direccion;
        this.p_correo = p_correo;
    }
   
    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

    public String getP_cedula() {
        return p_cedula;
    }

    public void setP_cedula(String p_cedula) {
        this.p_cedula = p_cedula;
    }

    public String getP_nombre() {
        return p_nombre;
    }

    public void setP_nombre(String p_nombre) {
        this.p_nombre = p_nombre;
    }

    public String getP_apellido() {
        return p_apellido;
    }

    public void setP_apellido(String p_apellido) {
        this.p_apellido = p_apellido;
    }

    public Date getP_fechanac() {
        return p_fechanac;
    }

    public void setP_fechanac(Date p_fechanac) {
        this.p_fechanac = p_fechanac;
    }

    public String getP_telefono() {
        return p_telefono;
    }

    public void setP_telefono(String p_telefono) {
        this.p_telefono = p_telefono;
    }

    public String getP_direccion() {
        return p_direccion;
    }

    public void setP_direccion(String p_direccion) {
        this.p_direccion = p_direccion;
    }

    public String getP_correo() {
        return p_correo;
    }

    public void setP_correo(String p_correo) {
        this.p_correo = p_correo;
    }

}
