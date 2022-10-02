/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Modelo.ModelCliente;
import Modelo.Persona;
import Modelo.modelPersona;
import Modelo.validaciones;
import Vista.VistaRegistrarCli;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Danie
 */
public class ControllerRegistroCliente {

    private VistaRegistrarCli vrc;
    private ModelCliente mc;
    boolean banvista = false;
    boolean banventa = false;

    public ControllerRegistroCliente() {
    }

    public ControllerRegistroCliente(VistaRegistrarCli vrc, ModelCliente mc) {
        this.vrc = vrc;
        this.mc = mc;
        banventa = true;
        banvista = false;
        vrc.setVisible(true);
    }

    public void iniciarControl() {
        vrc.getBtregistrar().addActionListener(l -> registrarCliente());
        vrc.getBtcancelar().addActionListener(l -> vrc.dispose());
    }

    public void registrarCliente() {

        if (validar()) {
            String cedula = vrc.getTxt_cedula().getText(),
                    nombre = vrc.getTxtnombre().getText(),
                    apellido = vrc.getTxtapellido().getText(),
                    correo = vrc.getTxtcorreo().getText(),
                    telefono = vrc.getTxttelefono().getText(),
                    direccion = vrc.getTxtdireccion().getText();
            int tipocli = vrc.getCmb_tipo().getSelectedIndex();

            Date fechaRegistro = java.sql.Date.valueOf(LocalDate.now());

            modelPersona Persona = new modelPersona();
            Persona.setP_cedula(cedula);
            Persona.setP_nombre(nombre);
            Persona.setP_apellido(apellido);
            Persona.setP_correo(correo);
            Persona.setP_telefono(telefono);
            Persona.setP_direccion(direccion);

            int response = JOptionPane.showConfirmDialog(vrc, "¿Agregar cliente?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            System.out.println("PERSONA ID == " + Persona.ObtenerId());
            ModelCliente Cli = new ModelCliente();

            if (response == JOptionPane.YES_OPTION) {
                if (Persona.comprobarDuplicado(cedula)) {
                    if (Persona.setPersona()) {

                        Cli.setCli_tipo_id(tipocli);
                        Cli.setCli_per_id(Persona.ObtenerId());
                        System.out.println("Si ingreso");
                        Cli.setClientes();

                        JOptionPane.showMessageDialog(vrc, "Cliente agregado/a correctamente");
//                        vrc.dispose();
                        limpiarCampos();

                    } else {
                        JOptionPane.showMessageDialog(vrc, "No se pudo agregar al cliente");
                    }
                } else {
                    JOptionPane.showMessageDialog(vrc, "El cliente ya se encuentra registrado");
                }

            }
        } else {
            System.out.println("hola");
        }

    }

    public void limpiarCampos() {
        vrc.getTxt_cedula().setText("");
        vrc.getTxtnombre().setText("");
        vrc.getTxtapellido().setText("");
        vrc.getTxtcorreo().setText("");
        vrc.getTxtdireccion().setText("");
        vrc.getTxttelefono().setText("");
        vrc.getCmb_tipo().setSelectedIndex(0);
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
}
