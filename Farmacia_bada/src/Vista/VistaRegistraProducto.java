/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar;

/**
 *
 * @author Danie
 */
public class VistaRegistraProducto extends javax.swing.JFrame {

    /**
     * Creates new form VistaRegistraProducto
     */
    public VistaRegistraProducto() {
        initComponents();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DlgCliente = new javax.swing.JDialog();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabladlg = new javax.swing.JTable();
        jToolBar2 = new javax.swing.JToolBar();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        jLabel17 = new javax.swing.JLabel();
        txtbuscardlg = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        btnseleccionardlg = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        jPanel5 = new javax.swing.JPanel();
        lbltitulo1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnseleccionar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtdescripcion = new javax.swing.JTextArea();
        txtprovnombre = new javax.swing.JTextField();
        txtfecha = new com.toedter.calendar.JDateChooser();
        btnregistrar = new javax.swing.JButton();
        Btcancelar = new javax.swing.JButton();
        txtcantidad = new javax.swing.JSpinner();
        lbl_prv = new javax.swing.JLabel();
        txtprecio1 = new javax.swing.JTextField();
        txtprovCedula = new javax.swing.JTextField();
        txtprovtelefono = new javax.swing.JTextField();
        txtprovempresa = new javax.swing.JTextField();
        txtprovcorreo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        DlgCliente.setSize(new java.awt.Dimension(545, 310));
        DlgCliente.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabladlg.setBackground(new java.awt.Color(255, 253, 227));
        tabladlg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Cedula", "Nombre", "Telefono", "Empresa", "Correo"
            }
        ));
        jScrollPane3.setViewportView(tabladlg);

        DlgCliente.getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 670, 200));

        jToolBar2.setBackground(new java.awt.Color(238, 227, 203));
        jToolBar2.setBorder(null);
        jToolBar2.setFloatable(false);
        jToolBar2.add(jSeparator4);

        jLabel17.setBackground(new java.awt.Color(238, 227, 203));
        jLabel17.setFont(new java.awt.Font("MS Gothic", 1, 14)); // NOI18N
        jLabel17.setText("BUSCAR:  ");
        jToolBar2.add(jLabel17);

        txtbuscardlg.setBackground(new java.awt.Color(255, 253, 227));
        jToolBar2.add(txtbuscardlg);
        jToolBar2.add(jSeparator5);

        btnseleccionardlg.setBackground(new java.awt.Color(238, 227, 203));
        btnseleccionardlg.setFont(new java.awt.Font("MS Gothic", 1, 14)); // NOI18N
        btnseleccionardlg.setText("SELECCIONAR");
        btnseleccionardlg.setBorder(null);
        btnseleccionardlg.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnseleccionardlg.setOpaque(true);
        jToolBar2.add(btnseleccionardlg);
        jToolBar2.add(jSeparator6);

        DlgCliente.getContentPane().add(jToolBar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 510, -1));

        jPanel5.setBackground(new java.awt.Color(238, 227, 203));

        lbltitulo1.setFont(new java.awt.Font("MS Gothic", 1, 24)); // NOI18N
        lbltitulo1.setText("SELECCIÓN DE PROVEEDOR");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(lbltitulo1)
                .addContainerGap(261, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lbltitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(291, Short.MAX_VALUE))
        );

        DlgCliente.getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 340));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("REGISTRAR PRODUCTO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 22, -1, -1));

        jLabel2.setText("Nombre del Producto");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 127, -1, -1));

        jLabel3.setText("Descripcion");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 164, 79, -1));

        jLabel4.setText("Correo:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 290, 40, -1));

        jLabel5.setText("Cantidad");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 57, -1));

        jLabel6.setText("Fecha de Caducidad");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 120, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Proveedor");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 110, 100, -1));

        btnseleccionar.setText("jButton1");
        getContentPane().add(btnseleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 120, -1, -1));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, 75, 21));
        getContentPane().add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 124, 214, -1));

        txtdescripcion.setColumns(20);
        txtdescripcion.setRows(5);
        jScrollPane1.setViewportView(txtdescripcion);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 164, -1, 103));
        getContentPane().add(txtprovnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 200, 160, -1));
        getContentPane().add(txtfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 350, 150, -1));

        btnregistrar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnregistrar.setText("Registrar");
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnregistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, -1, -1));

        Btcancelar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Btcancelar.setText("Cancelar");
        getContentPane().add(Btcancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 440, -1, -1));
        getContentPane().add(txtcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 320, 150, -1));
        getContentPane().add(lbl_prv, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, -1, -1));
        getContentPane().add(txtprecio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 210, -1));
        getContentPane().add(txtprovCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 170, 160, -1));
        getContentPane().add(txtprovtelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 230, 160, -1));
        getContentPane().add(txtprovempresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 260, 160, -1));
        getContentPane().add(txtprovcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 290, 160, -1));

        jLabel9.setText("Precio");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 37, -1));

        jLabel10.setText("Cedula:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(667, 170, 40, -1));

        jLabel11.setText("Nombre:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 200, 50, -1));

        jLabel12.setText("Telefono:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 230, 50, -1));

        jLabel13.setText("Empresa:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 260, 50, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed

    }//GEN-LAST:event_btnregistrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaRegistraProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaRegistraProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaRegistraProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaRegistraProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaRegistraProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btcancelar;
    private javax.swing.JDialog DlgCliente;
    private javax.swing.JButton btnregistrar;
    private javax.swing.JButton btnseleccionar;
    private javax.swing.JButton btnseleccionardlg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JLabel lbl_prv;
    private javax.swing.JLabel lbltitulo1;
    private javax.swing.JTable tabladlg;
    private javax.swing.JTextField txtbuscardlg;
    private javax.swing.JSpinner txtcantidad;
    private javax.swing.JTextArea txtdescripcion;
    private com.toedter.calendar.JDateChooser txtfecha;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtprecio1;
    private javax.swing.JTextField txtprovCedula;
    private javax.swing.JTextField txtprovcorreo;
    private javax.swing.JTextField txtprovempresa;
    private javax.swing.JTextField txtprovnombre;
    private javax.swing.JTextField txtprovtelefono;
    // End of variables declaration//GEN-END:variables

    public JButton getBtcancelar() {
        return Btcancelar;
    }

    public void setBtcancelar(JButton Btcancelar) {
        this.Btcancelar = Btcancelar;
    }

    public JDialog getDlgCliente() {
        return DlgCliente;
    }

    public void setDlgCliente(JDialog DlgCliente) {
        this.DlgCliente = DlgCliente;
    }

    public JButton getBtnregistrar() {
        return btnregistrar;
    }

    public void setBtnregistrar(JButton btnregistrar) {
        this.btnregistrar = btnregistrar;
    }

    public JButton getBtnseleccionar() {
        return btnseleccionar;
    }

    public void setBtnseleccionar(JButton btnseleccionar) {
        this.btnseleccionar = btnseleccionar;
    }

    public JButton getBtnseleccionardlg() {
        return btnseleccionardlg;
    }

    public void setBtnseleccionardlg(JButton btnseleccionardlg) {
        this.btnseleccionardlg = btnseleccionardlg;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel10() {
        return jLabel10;
    }

    public void setjLabel10(JLabel jLabel10) {
        this.jLabel10 = jLabel10;
    }

    public JLabel getjLabel11() {
        return jLabel11;
    }

    public void setjLabel11(JLabel jLabel11) {
        this.jLabel11 = jLabel11;
    }

    public JLabel getjLabel12() {
        return jLabel12;
    }

    public void setjLabel12(JLabel jLabel12) {
        this.jLabel12 = jLabel12;
    }

    public JLabel getjLabel13() {
        return jLabel13;
    }

    public void setjLabel13(JLabel jLabel13) {
        this.jLabel13 = jLabel13;
    }

    public JLabel getjLabel17() {
        return jLabel17;
    }

    public void setjLabel17(JLabel jLabel17) {
        this.jLabel17 = jLabel17;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public JLabel getjLabel5() {
        return jLabel5;
    }

    public void setjLabel5(JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    public JLabel getjLabel6() {
        return jLabel6;
    }

    public void setjLabel6(JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    public JLabel getjLabel7() {
        return jLabel7;
    }

    public void setjLabel7(JLabel jLabel7) {
        this.jLabel7 = jLabel7;
    }

    public JLabel getjLabel8() {
        return jLabel8;
    }

    public void setjLabel8(JLabel jLabel8) {
        this.jLabel8 = jLabel8;
    }

    public JLabel getjLabel9() {
        return jLabel9;
    }

    public void setjLabel9(JLabel jLabel9) {
        this.jLabel9 = jLabel9;
    }

    public JPanel getjPanel5() {
        return jPanel5;
    }

    public void setjPanel5(JPanel jPanel5) {
        this.jPanel5 = jPanel5;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JScrollPane getjScrollPane3() {
        return jScrollPane3;
    }

    public void setjScrollPane3(JScrollPane jScrollPane3) {
        this.jScrollPane3 = jScrollPane3;
    }

    public JToolBar.Separator getjSeparator4() {
        return jSeparator4;
    }

    public void setjSeparator4(JToolBar.Separator jSeparator4) {
        this.jSeparator4 = jSeparator4;
    }

    public JToolBar.Separator getjSeparator5() {
        return jSeparator5;
    }

    public void setjSeparator5(JToolBar.Separator jSeparator5) {
        this.jSeparator5 = jSeparator5;
    }

    public JToolBar.Separator getjSeparator6() {
        return jSeparator6;
    }

    public void setjSeparator6(JToolBar.Separator jSeparator6) {
        this.jSeparator6 = jSeparator6;
    }

    public JToolBar getjToolBar2() {
        return jToolBar2;
    }

    public void setjToolBar2(JToolBar jToolBar2) {
        this.jToolBar2 = jToolBar2;
    }

    public JLabel getLbltitulo1() {
        return lbltitulo1;
    }

    public void setLbltitulo1(JLabel lbltitulo1) {
        this.lbltitulo1 = lbltitulo1;
    }

    public JTable getTabladlg() {
        return tabladlg;
    }

    public void setTabladlg(JTable tabladlg) {
        this.tabladlg = tabladlg;
    }

    public JTextField getTxtbuscardlg() {
        return txtbuscardlg;
    }

    public void setTxtbuscardlg(JTextField txtbuscardlg) {
        this.txtbuscardlg = txtbuscardlg;
    }

    public JSpinner getTxtcantidad() {
        return txtcantidad;
    }

    public void setTxtcantidad(JSpinner txtcantidad) {
        this.txtcantidad = txtcantidad;
    }

    public JTextArea getTxtdescripcion() {
        return txtdescripcion;
    }

    public void setTxtdescripcion(JTextArea txtdescripcion) {
        this.txtdescripcion = txtdescripcion;
    }

    public JDateChooser getTxtfecha() {
        return txtfecha;
    }

    public void setTxtfecha(JDateChooser txtfecha) {
        this.txtfecha = txtfecha;
    }

    public JTextField getTxtnombre() {
        return txtnombre;
    }

    public void setTxtnombre(JTextField txtnombre) {
        this.txtnombre = txtnombre;
    }

    public JTextField getTxtprecio1() {
        return txtprecio1;
    }

    public void setTxtprecio1(JTextField txtprecio1) {
        this.txtprecio1 = txtprecio1;
    }


    public JTextField getTxtprovCedula() {
        return txtprovCedula;
    }

    public void setTxtprovCedula(JTextField txtprovCedula) {
        this.txtprovCedula = txtprovCedula;
    }

    public JLabel getTxtprovID() {
        return lbl_prv;
    }

    public void setTxtprovID(JLabel txtprovID) {
        this.lbl_prv = txtprovID;
    }

    public JTextField getTxtprovcorreo() {
        return txtprovcorreo;
    }

    public void setTxtprovcorreo(JTextField txtprovcorreo) {
        this.txtprovcorreo = txtprovcorreo;
    }

    public JTextField getTxtprovempresa() {
        return txtprovempresa;
    }

    public void setTxtprovempresa(JTextField txtprovempresa) {
        this.txtprovempresa = txtprovempresa;
    }

    public JTextField getTxtprovnombre() {
        return txtprovnombre;
    }

    public void setTxtprovnombre(JTextField txtprovnombre) {
        this.txtprovnombre = txtprovnombre;
    }

    public JTextField getTxtprovtelefono() {
        return txtprovtelefono;
    }

    public void setTxtprovtelefono(JTextField txtprovtelefono) {
        this.txtprovtelefono = txtprovtelefono;
    }



}
