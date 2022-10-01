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
public class Empleado extends Persona{
    
    private int emp_id;
    private int emp_per_id;
    private String emp_horario;
    private double emp_sueldo;

    public Empleado(int emp_id, int emp_per_id, String emp_horario, double emp_sueldo, int p_id, String p_cedula, String p_nombre, String p_apellido, Date p_fechanac, String p_telefono, String p_direccion, String p_correo) {
        super(p_id, p_cedula, p_nombre, p_apellido, p_fechanac, p_telefono, p_direccion, p_correo);
        this.emp_id = emp_id;
        this.emp_per_id = emp_per_id;
        this.emp_horario = emp_horario;
        this.emp_sueldo = emp_sueldo;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public int getEmp_per_id() {
        return emp_per_id;
    }

    public void setEmp_per_id(int emp_per_id) {
        this.emp_per_id = emp_per_id;
    }

    public String getEmp_horario() {
        return emp_horario;
    }

    public void setEmp_horario(String emp_horario) {
        this.emp_horario = emp_horario;
    }

    public double getEmp_sueldo() {
        return emp_sueldo;
    }

    public void setEmp_sueldo(double emp_sueldo) {
        this.emp_sueldo = emp_sueldo;
    }
    
    
}
