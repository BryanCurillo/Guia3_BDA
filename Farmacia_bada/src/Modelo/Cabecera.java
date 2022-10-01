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
public class Cabecera {
    
    private int cab_id;
    private int cab_cli_id;
    private Date cab_fechacom;
    private String cab_estado;
    private int cab_emp_id;
    private int cab_prov_id;

    public int getCab_id() {
        return cab_id;
    }

    public void setCab_id(int cab_id) {
        this.cab_id = cab_id;
    }

    public int getCab_cli_id() {
        return cab_cli_id;
    }

    public void setCab_cli_id(int cab_cli_id) {
        this.cab_cli_id = cab_cli_id;
    }

    public Date getCab_fechacom() {
        return cab_fechacom;
    }

    public void setCab_fechacom(Date cab_fechacom) {
        this.cab_fechacom = cab_fechacom;
    }

    public String getCab_estado() {
        return cab_estado;
    }

    public void setCab_estado(String cab_estado) {
        this.cab_estado = cab_estado;
    }

    public int getCab_emp_id() {
        return cab_emp_id;
    }

    public void setCab_emp_id(int cab_emp_id) {
        this.cab_emp_id = cab_emp_id;
    }

    public int getCab_prov_id() {
        return cab_prov_id;
    }

    public void setCab_prov_id(int cab_prov_id) {
        this.cab_prov_id = cab_prov_id;
    }
    
    
        
}
