/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Danie
 */
public class ModeloFactura extends Factura {

    ModeloConexion mc = new ModeloConexion();

    public boolean setFactura() {
        String sql = "INSERT INTO Factura(fac_enc_id, fac_cue_id, fac_pie_id, fac_fecha, fac_estado)  "
                + "  values(" + getFac_enc_id() + "," + getFac_cue_id() + "," + getFac_pie_id() + ",'" + getFac_fecha() + "','" + getFac_estado() + "')";

        return mc.accion(sql);
    }

    public List<Factura> getFactura() {
        List<Factura> listaFacturas = new ArrayList<>();
        String sql = "select f.fac_id,f.fac_fecha,f.fac_estado,c.cue_cantidad,c.cue_descripcion,pro.pro_precio ,(c.cue_cantidad*pro.pro_precio)as subtotal,  "
                + "((c.cue_cantidad*pro.pro_precio)*0.12) as iva, ((c.cue_cantidad*pro.pro_precio)+((c.cue_cantidad*pro.pro_precio)*0.12)) AS TOTAL  "
                + "  from factura f join cuerpo c on(c.cue_id= f.fac_cue_id)  "
                + "  join encabezado e on(e.enc_id= f.fac_enc_id)  "
                + "   join producto pro on(pro.pro_id=c.cue_prod_id)  order by f.fac_id";
        ResultSet rs = mc.consulta(sql);
        try {
            while (rs.next()) {
                Factura miFac = new Factura();

                miFac.setFac_id(rs.getInt(1));
                miFac.setFac_fecha(rs.getString(2));
                miFac.setFac_estado(rs.getString(3));

                miFac.setCue_cantidad(rs.getInt(4));
                miFac.setCue_descripcion(rs.getString(5));
                miFac.setProd_precio(rs.getDouble(6));
                miFac.setFac_subtotal(rs.getDouble(7));
                miFac.setFac_IVA(rs.getDouble(8));
                miFac.setFac_TOTAL(rs.getDouble(9));

                listaFacturas.add(miFac);
            }
        } catch (SQLException e) {
            Logger.getLogger(ModelProveedor.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(ModelProveedor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaFacturas;
    }

    public List<Factura> generarFactura(int idFac) {

        List<Factura> listaFacturas = new ArrayList<>();
        String sql = "select f.fac_id,f.fac_fecha,f.fac_estado,c.cue_cantidad,c.cue_descripcion,pro.pro_precio ,(c.cue_cantidad*pro.pro_precio)as subtotal, "
                + "((c.cue_cantidad*pro.pro_precio)*0.12) as iva, ((c.cue_cantidad*pro.pro_precio)+((c.cue_cantidad*pro.pro_precio)*0.12)) AS TOTAL "
                + "from factura f join cuerpo c on(c.cue_id= f.fac_cue_id) "
                + "join encabezado e on(e.enc_id= f.fac_enc_id) "
                + "join producto pro on(pro.pro_id=c.cue_prod_id) "
                + "where f.fac_id= " + idFac
                + "order by f.fac_id";
        ResultSet rs = mc.consulta(sql);
        try {
            while (rs.next()) {
                Factura miFac = new Factura();

                miFac.setFac_id(rs.getInt(1));
                miFac.setFac_fecha(rs.getString(2));
                miFac.setFac_estado(rs.getString(3));

                miFac.setCue_cantidad(rs.getInt(4));
                miFac.setCue_descripcion(rs.getString(5));
                miFac.setProd_precio(rs.getDouble(6));
                miFac.setFac_subtotal(rs.getDouble(7));
                miFac.setFac_IVA(rs.getDouble(8));
                miFac.setFac_TOTAL(rs.getDouble(9));

                listaFacturas.add(miFac);
            }
            System.out.println("SIZE=" + idFac);
        } catch (SQLException e) {
            Logger.getLogger(ModelProveedor.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(ModelProveedor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaFacturas;
    }

    public int ObtenerId() {
        int cant = 0;

        String sql = "select max(fac_id)from factura";
        ResultSet rs = mc.consulta(sql);

        try {
            while (rs.next()) {
                cant = rs.getInt(1);
            }
        } catch (SQLException e) {
            Logger.getLogger(modelPersona.class.getName()).log(Level.SEVERE, null, e);
        }
        if (cant == 0) {
            System.out.println("NO VALIO");
        } else {
            System.out.println("si valio xd");
        }
        return cant;

    }

    public boolean executeFac(int idFac) {
        try {
            //EN EL CASO DE TENER SALIDA
//            ? = call FACTURA_FINAL(?)   la primera es de salida
            CallableStatement cstmt = mc.getCon().prepareCall("call FACTURA_FINAL(?)");
            //variable de entrada
            cstmt.setInt(1, idFac);

            //variable de salida
//            cstmt.registerOutParameter(1, OracleType.NUMBER);
            System.out.println("CANCELADA");
            JOptionPane.showMessageDialog(null, "Factura cancelada");

            return cstmt.execute();

        } catch (SQLException ex) {
            if (ex.getErrorCode() == 20002) {
                JOptionPane.showMessageDialog(null, "La factura ya se encuentra cancelada", "Estado de Pago", 0);
            } else {
                Logger.getLogger(ModeloConexion.class.getName()).log(Level.SEVERE, null, ex);
            }
            return false;
        }
    }
}
