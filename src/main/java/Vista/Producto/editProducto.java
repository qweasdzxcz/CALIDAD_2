package Vista.Producto;

import Vista.Principal;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;
import Controlador.Controlador_Producto;

public class editProducto extends javax.swing.JDialog {

    public editProducto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_descrip = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        btn_actualizar = new javax.swing.JButton();
        error_nombre = new javax.swing.JLabel();
        cbx_categoria = new javax.swing.JComboBox<>();
        error_categoria = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cbx_estado = new javax.swing.JComboBox<>();
        error_estado = new javax.swing.JLabel();
        lbl_id = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 153, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("EDITAR PRODUCTO");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 260, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 60));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Descripcion");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 150, 30));

        txt_nombre.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 200, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Nombre ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 150, 30));

        txt_descrip.setBackground(new java.awt.Color(255, 255, 255));
        txt_descrip.setColumns(17);
        txt_descrip.setLineWrap(true);
        txt_descrip.setRows(5);
        txt_descrip.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txt_descrip);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Categoria");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 150, 30));

        btn_actualizar.setBackground(new java.awt.Color(0, 0, 0));
        btn_actualizar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_actualizar.setForeground(new java.awt.Color(255, 153, 102));
        btn_actualizar.setText("Actualizar");
        btn_actualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btn_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 200, 50));

        error_nombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        error_nombre.setForeground(new java.awt.Color(255, 51, 51));
        error_nombre.setText("Error");
        jPanel1.add(error_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 200, -1));

        cbx_categoria.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(cbx_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 200, 30));

        error_categoria.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        error_categoria.setForeground(new java.awt.Color(255, 51, 51));
        error_categoria.setText("Error");
        jPanel1.add(error_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 200, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Estado");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 150, 30));

        cbx_estado.setBackground(new java.awt.Color(255, 255, 255));
        cbx_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        cbx_estado.setSelectedIndex(-1);
        jPanel1.add(cbx_estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 200, 30));

        error_estado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        error_estado.setForeground(new java.awt.Color(255, 51, 51));
        error_estado.setText("Error");
        jPanel1.add(error_estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 200, -1));

        lbl_id.setForeground(new java.awt.Color(255, 255, 255));
        lbl_id.setText("lbl_id");
        jPanel1.add(lbl_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(editProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                editProducto dialog = new editProducto(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                Principal p = new Principal();
                formProducto formProducto = new formProducto(new javax.swing.JFrame(), true);
                Controlador_Producto cp = new Controlador_Producto(p, formProducto, dialog);
               // cp.ocultarErrores();
                //cp.llenarCategoria();
                //dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_actualizar;
    public static javax.swing.JComboBox<Object> cbx_categoria;
    public static javax.swing.JComboBox<String> cbx_estado;
    public static javax.swing.JLabel error_categoria;
    public static javax.swing.JLabel error_estado;
    public static javax.swing.JLabel error_nombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel lbl_id;
    public static javax.swing.JTextArea txt_descrip;
    public static javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables

    public void soloNumeros(JTextField txt, int tamMax, KeyEvent evt) {
        char validar = evt.getKeyChar();

        if (validar < '0' || validar > '9') {
            evt.consume();
        }
        if (Character.isDigit(validar)) {
            if (txt.getText().length() >= tamMax) {
                evt.consume();
            }
        }
    }
}
