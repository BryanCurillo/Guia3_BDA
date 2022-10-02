/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Danie
 */
public class ModeloConexion {

    private final String DRIVER = "oracle.jdbc.driver.OracleDriver";
    private final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
    private final String USER = "bryanGuia3";
    private final String PASWORD = "1234";

    private Connection con;

    public ModeloConexion() {
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL, USER, PASWORD);
            System.out.println("conexion exitosa");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("error: " + ex.getLocalizedMessage());
            Logger.getLogger(ModeloConexion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ResultSet consulta(String sql) {
        try {
            Statement st = con.createStatement();
            return st.executeQuery(sql);

        } catch (SQLException ex) {
            Logger.getLogger(ModeloConexion.class
                    .getName()).log(Level.SEVERE, null, ex);
            return null;

        }
    }

    public boolean accion(String sql) {
        //INSERT-UPDATE-DELETE

        boolean correcto;

        try {
            Statement at = con.createStatement();
            at.execute(sql);
            at.close();//Cierro la conexion
            correcto = true;

        } catch (SQLException e) {
            if (e.getErrorCode() == 20001) {
                JOptionPane.showMessageDialog(null, "El producto se encuentra caducado", "Alerta de caducidad", 0);
            } else {

                Logger.getLogger(ModeloConexion.class
                        .getName()).log(Level.SEVERE, null, e);
            }
            correcto = false;
        }
        return correcto;
    }

}
