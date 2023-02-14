package Vista.Entrada;

import Vista.Ventas.*;
import Modelo.Producto;
import Modelo.ProductoDAO;
import Vista.Principal;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class BusquedaProductoEntrada extends javax.swing.JDialog {

//    Principal p = new Principal();
//
//        Controlador_NuevaVenta cnv = new Controlador_NuevaVenta(p, this);
    String filtro = "id_producto";
    DefaultTableModel tablaBuscar = new DefaultTableModel();
    ProductoDAO proDAO = new ProductoDAO();

    public BusquedaProductoEntrada(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        tablaDatos();
        //cnv.listarProducto(busquedaProductoTabla);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PopBusquedaProducto = new javax.swing.JPopupMenu();
        btn_agregarEntrada = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        busquedaProductoTablaEntrada = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txt_valor = new javax.swing.JTextField();

        btn_agregarEntrada.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btn_agregarEntrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add_30px.png"))); // NOI18N
        btn_agregarEntrada.setText("Agregar");
        PopBusquedaProducto.add(btn_agregarEntrada);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        busquedaProductoTablaEntrada.setBackground(new java.awt.Color(255, 255, 255));
        busquedaProductoTablaEntrada.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        busquedaProductoTablaEntrada.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "DESCRIPCION", "CATEGORIA", "STOCK"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        busquedaProductoTablaEntrada.setComponentPopupMenu(PopBusquedaProducto);
        busquedaProductoTablaEntrada.setRowHeight(25);
        busquedaProductoTablaEntrada.setShowHorizontalLines(true);
        busquedaProductoTablaEntrada.getTableHeader().setResizingAllowed(false);
        busquedaProductoTablaEntrada.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(busquedaProductoTablaEntrada);
        if (busquedaProductoTablaEntrada.getColumnModel().getColumnCount() > 0) {
            busquedaProductoTablaEntrada.getColumnModel().getColumn(0).setResizable(false);
            busquedaProductoTablaEntrada.getColumnModel().getColumn(0).setPreferredWidth(20);
            busquedaProductoTablaEntrada.getColumnModel().getColumn(1).setResizable(false);
            busquedaProductoTablaEntrada.getColumnModel().getColumn(2).setResizable(false);
            busquedaProductoTablaEntrada.getColumnModel().getColumn(3).setResizable(false);
            busquedaProductoTablaEntrada.getColumnModel().getColumn(4).setResizable(false);
            busquedaProductoTablaEntrada.getColumnModel().getColumn(4).setPreferredWidth(20);
        }

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 660, -1));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Buscar Productos");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 210, 20));

        txt_valor.setBackground(new java.awt.Color(255, 255, 255));
        txt_valor.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txt_valor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_valorKeyTyped(evt);
            }
        });
        jPanel1.add(txt_valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 260, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_valorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_valorKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            // getToolkit().beep();
            evt.consume();
            // JOptionPane.showMessageDialog(null, "INGRESE SOLO LETRAS");           
        }
        limpiarTablaBuscar();
        tablaDatos();
    }//GEN-LAST:event_txt_valorKeyTyped

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
            java.util.logging.Logger.getLogger(BusquedaProductoEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BusquedaProductoEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BusquedaProductoEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BusquedaProductoEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BusquedaProductoEntrada dialog = new BusquedaProductoEntrada(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });

                Principal p = new Principal();
               
                

                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu PopBusquedaProducto;
    public javax.swing.JMenuItem btn_agregarEntrada;
    public static javax.swing.JTable busquedaProductoTablaEntrada;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    public static javax.swing.JTextField txt_valor;
    // End of variables declaration//GEN-END:variables

    //TABLA BUSCAR
    public void tablaDatos() {
        String valor = txt_valor.getText();
        filtro = "nombre";
        List<Producto> listaProd = proDAO.listarProductoBusqueda(filtro, valor);
        //System.out.println("filtro : " + filtro + "\n" + "valor : " + a);
        tablaBuscar = (DefaultTableModel) busquedaProductoTablaEntrada.getModel();

        Object[] obj = new Object[5];
        for (int i = 0; i < listaProd.size(); i++) {
            obj[0] = listaProd.get(i).getId();
            obj[1] = listaProd.get(i).getNombre();
            obj[2] = listaProd.get(i).getDescripcion();
            obj[3] = listaProd.get(i).getNomCategoria();
            obj[4] = listaProd.get(i).getCantidad();

            tablaBuscar.addRow(obj);
        }
        busquedaProductoTablaEntrada.setModel(tablaBuscar);
    }

    public void limpiarTablaBuscar() {
        for (int i = 0; i < tablaBuscar.getRowCount(); i++) {
            tablaBuscar.removeRow(i);
            i = i - 1;
        }
    }

}
