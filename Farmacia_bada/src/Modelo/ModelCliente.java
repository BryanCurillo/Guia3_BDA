/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ALEJO
 */
public class ModelCliente extends Cliente {

    ModeloConexion mc = new ModeloConexion();

    public List<Cliente> getClientes() {
        List<Cliente> listaClientes = new ArrayList<>();
        String sql = "select * from cliente c join persona p on (c.cli_per_id=p.p_id)  "
                + "  join tipo_cliente tc on (c.cli_tipo_id= tc.tc_id)";
        ResultSet rs = mc.consulta(sql);
        try {
            while (rs.next()) {
                Cliente c = new Cliente();
                c.setCli_id(rs.getInt(1));
                c.setCli_per_id(rs.getInt(2));
                c.setCli_tipo_id(rs.getInt(3));
                c.setP_id(rs.getInt(4));
                c.setP_cedula(rs.getString(5));
                c.setP_nombre(rs.getString(6));
                c.setP_apellido(rs.getString(7));
                c.setP_correo(rs.getString(8));
                c.setP_direccion(rs.getString(9));
                c.setP_telefono(rs.getString(10));
                c.setTp_id(rs.getInt(11));
                c.setTp_nombre(rs.getString(12));
                System.out.println("cedula= "+c.getP_cedula());
                listaClientes.add(c);
            }
        } catch (SQLException e) {
            Logger.getLogger(ModelCliente.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(ModelCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaClientes;
    }
    
       public boolean setClientes() {
        String sql = "INSERT INTO Cliente(cli_per_id,cli_tipo_id)  "
                + "  VALUES ('" + getCli_per_id()+ "', '" + getCli_tipo_id()+"')";
           System.out.println(getCli_per_id());      
        return mc.accion(sql);
        

    }
        public boolean comprobarDuplicado(String cedula) {
        int cant = 0;
        boolean ban = true;

        String sql = "select count(*) from persona where p_cedula= '" + cedula + "'";
        ResultSet rs = mc.consulta(sql);
        try {
            while (rs.next()) {
                cant = rs.getInt(1);
            }
        } catch (SQLException e) {
            Logger.getLogger(ModelCliente.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            if (cant!=0) {
                ban=false;
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(ModelCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ban;
    }

//    public List<Cliente> getClientesFac(String cedula) {
//        List<Cliente> listaClientes = new ArrayList<>();
//        String sql = "select * from cliente c "
//                + "join persona p on(p.per_cedula=c.cli_cedula) "
//                + "where c.cli_estado=true "
//                + "and "
//                + "c.cli_cedula ='" + cedula + "' ";
//        ResultSet rs = mc.consulta(sql);
//        try {
//            while (rs.next()) {
//                Cliente c = new Cliente();
//                c.setCli_id(rs.getInt(1));
//                c.setCli_direccion(rs.getString(2));
//                c.setCli_cedula(rs.getString(3));
//                c.setCli_estado(rs.getBoolean(4));
//                c.setCedula(rs.getString(5));
//                c.setNombre(rs.getString(6));
//                c.setApellido(rs.getString(7));
//                c.setFechaRegistro(rs.getDate(8));
//                c.setCorreo(rs.getString(9));
//                c.setTelefono(rs.getString(10));
//
//                listaClientes.add(c);
//            }
//        } catch (SQLException e) {
//            Logger.getLogger(modelEmpleado.class.getName()).log(Level.SEVERE, null, e);
//        }
//        try {
//            rs.close();
//        } catch (SQLException ex) {
//            Logger.getLogger(modelEmpleado.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return listaClientes;
//    }

//    public boolean setCliente() {
//        String sql = "INSERT INTO cliente(cli_direccion,  cli_cedula,cli_estado)"
//                + "VALUES ('" + getCli_direccion() + "', '" + getCli_cedula() + "', " + isCli_estado() + ")";
//        return mc.accion(sql);//EJECUTAMOS EN INSERT
//    }
//
//    public boolean updateCliente() {
//        String sql;
//        System.out.println(getCli_cedula());
//        sql = "UPDATE cliente "
//                + "	SET cli_direccion='" + getCli_direccion() + "', cli_cedula='" + getCli_cedula() + "', cli_estado=" + isCli_estado()
//                + "	WHERE cli_cedula = '" + getCli_cedula() + "'";
//        return mc.accion(sql);
//    }

//    public boolean deleteCliente(String cedula) {
//        String sql;
//        sql = "UPDATE cliente SET cli_estado=false "
//                + "WHERE cli_cedula='" + cedula + "'";
//        System.out.println(sql);
//        return mc.accion(sql);
//    }

//    public List<Cliente> busquedaincremental(String busqueda) {
//        List<Cliente> listaClientes = new ArrayList<>();
//        String sql = "select * from cliente c "
//                + "join persona p on(p.per_cedula=c.cli_cedula) "
//                + "where c.cli_estado=true "
//                + "and "
//                + "(p.per_cedula like '%" + busqueda + "%' "
//                + "or lower(p.per_nombre) like '%" + busqueda + "%' "
//                + "or lower(p.per_apellido) like '%" + busqueda + "%' "
//                + "or p.per_telefono like '%" + busqueda + "%' "
//                + "or lower(c.cli_direccion) like '%" + busqueda + "%' "
//                + "OR to_char(p.per_fecha_registro,'DD-MM-YYYY') LIKE  '%" + busqueda + "%'  ) ";
//
//        ResultSet rs = mc.consulta(sql);
//        try {
//            while (rs.next()) {
//                Cliente c = new Cliente();
//                c.setCli_id(rs.getInt(1));
//                c.setCli_direccion(rs.getString(2));
//                c.setCli_cedula(rs.getString(3));
//                c.setCli_estado(rs.getBoolean(4));
//                c.setCedula(rs.getString(5));
//                c.setNombre(rs.getString(6));
//                c.setApellido(rs.getString(7));
//                c.setFechaRegistro(rs.getDate(8));
//                c.setCorreo(rs.getString(9));
//                c.setTelefono(rs.getString(10));
//
//                listaClientes.add(c);
//            }
//        } catch (SQLException e) {
//            Logger.getLogger(modelEmpleado.class.getName()).log(Level.SEVERE, null, e);
//        }
//        try {
//            rs.close();
//        } catch (SQLException ex) {
//            Logger.getLogger(modelEmpleado.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return listaClientes;
//    }
}
