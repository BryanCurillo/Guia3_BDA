/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Modelo.ModelCliente;
import Modelo.ModelProveedor;
import Modelo.modelPersona;
import Modelo.validaciones;
import Vista.VistaRegistrarProveedor;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Danie
 */
public class ControllerRegistroProveedor {

    private Vista.VistaRegistrarProveedor vrp;
    private ModelProveedor mpr;
    boolean banvista = false;
    boolean banventa = false;

    public ControllerRegistroProveedor() {
    }

    public ControllerRegistroProveedor(VistaRegistrarProveedor vrp, ModelProveedor mpr) {
        this.vrp = vrp;
        this.mpr = mpr;
        banventa = true;
        banvista = false;
        vrp.setVisible(true);

    }

    public void iniciarControl() {
        vrp.getBtregistrar().addActionListener(l -> registrarProveedor());
        vrp.getBtcancelar().addActionListener(l -> vrp.dispose());
    }

    public void registrarProveedor() {

        if (validar()) {
            String cedula = vrp.getTxt_cedula().getText(),
                    nombre = vrp.getTxtnombre().getText(),
                    apellido = vrp.getTxtapellido().getText(),
                    correo = vrp.getTxtcorreo().getText(),
                    telefono = vrp.getTxttelefono().getText(),
                    direccion = vrp.getTxtdireccion().getText(),
                    empresa = vrp.getTxtempresa().getText();

            Date fechaRegistro = java.sql.Date.valueOf(LocalDate.now());

            modelPersona Persona = new modelPersona();
            Persona.setP_cedula(cedula);
            Persona.setP_nombre(nombre);
            Persona.setP_apellido(apellido);
            Persona.setP_correo(correo);
            Persona.setP_telefono(telefono);
            Persona.setP_direccion(direccion);

            int response = JOptionPane.showConfirmDialog(vrp, "¿Agregar cliente?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            System.out.println("PERSONA ID == " + Persona.ObtenerId());
            ModelProveedor prov = new ModelProveedor();

            if (response == JOptionPane.YES_OPTION) {
                if (Persona.comprobarDuplicado(cedula)) {
                    if (Persona.setPersona()) {

                        prov.setProv_nombre(empresa);
                        prov.setProv_per_id(Persona.ObtenerId());
                        System.out.println("Si ingreso");
                        prov.setClientes();

                        JOptionPane.showMessageDialog(vrp, "Cliente agregado/a correctamente");
//                        vrc.dispose();
                        limpiarCampos();

                    } else {
                        JOptionPane.showMessageDialog(vrp, "No se pudo agregar al cliente");
                    }
                } else {
                    JOptionPane.showMessageDialog(vrp, "El cliente ya se encuentra registrado");
                }

            }
        } else {
            System.out.println("hola");
        }

    }

    public boolean validar() {
        boolean ban = true;
        validaciones mivalidacion = new validaciones();
        //DNI
//        if (!vrc.getTxt_cedula().getText().isEmpty()) {
//            if (!mivalidacion.validarCedula(vrc.getTxt_cedula().getText())) {
//                JOptionPane.showMessageDialog(vrc, "Cedula invalida");
//                ban = false;
//            }
//        } else {
//            JOptionPane.showMessageDialog(vrc, "Ingrese la cedula");
//            ban = false;
//        }
        //NOMBRE
//        if (!vrc.getTxtnombre().getText().isEmpty()) {
//            if (!mivalidacion.validarNombApeEspacios(vrc.getTxtnombre().getText())) {
//                JOptionPane.showMessageDialog(vrc, "Nombre invalido");
//                ban = false;
//            }
//        } else {
//            JOptionPane.showMessageDialog(vrc, "Ingrese el nombre");
//            ban = false;
//        }
//        //APELLIDO
//        if (!vrc.getTxtapellido().getText().isEmpty()) {
//            if (!mivalidacion.validarNombApeEspacios(vrc.getTxtapellido().getText())) {
//                JOptionPane.showMessageDialog(vrc, "Apellido invalida");
//                ban = false;
//            }
//        } else {
//            JOptionPane.showMessageDialog(vrc, "Ingrese el Apellido");
//            ban = false;
//        }
//        //TELEFONO
//        if (!vrc.getTxttelefono().getText().isEmpty()) {
//            if (!mivalidacion.validarTelefono(vrc.getTxttelefono().getText())) {
//                JOptionPane.showMessageDialog(vrc, "Telefono invalido");
//                ban = false;
//            }
//        } else {
//            JOptionPane.showMessageDialog(vrc, "Ingrese el numero de telefono");
//            ban = false;
//        }
//        //CORREO
//        if (!vrc.getTxtcorreo().getText().isEmpty()) {
//            if (!mivalidacion.validarCorreo(vrc.getTxtcorreo().getText())) {
//                JOptionPane.showMessageDialog(vrc, "Correo invalido");
//                ban = false;
//            }
//        } else {
//            JOptionPane.showMessageDialog(vrc, "Ingrese un correo electronico");
//            ban = false;
//        }
//        //DIRECCION
//        if (!vrc.getTxtdireccion().getText().isEmpty()) {
//            if (!mivalidacion.validarDireccion(vrc.getTxtdireccion().getText())) {
//                JOptionPane.showMessageDialog(vrc, "Direccion invalida");
//                ban = false;
//            }
//        } else {
//            JOptionPane.showMessageDialog(vrc, "Ingrese una direccion valida");
//            ban = false;
//        }

        return ban;
    }

    public void limpiarCampos() {
        vrp.getTxt_cedula().setText("");
        vrp.getTxtnombre().setText("");
        vrp.getTxtapellido().setText("");
        vrp.getTxtcorreo().setText("");
        vrp.getTxtdireccion().setText("");
        vrp.getTxttelefono().setText("");
        vrp.getTxtempresa().setText("");
    }

}
