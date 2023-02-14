package Vista;

import Controlador.Controlador_Categoria;

import Controlador.Controlador_Login;

import Controlador.Controlador_Producto;
import Controlador.Controlador_Entrada;
import Vista.Usuario.formUsuario;
import Controlador.Controlador_Usuario;
import Vista.Entrada.BusquedaProductoEntrada;


import Vista.Producto.formProducto;
import Vista.Usuario.editUsuario;
import Vista.Producto.formProducto;
import Vista.Producto.editProducto;

import Vista.Ventas.BusquedaProducto;
import java.awt.event.KeyEvent;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
//        formUsuario f = new formUsuario(new javax.swing.JFrame(), true);
//        Controlador_Usuario cu = new Controlador_Usuario(this, f);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popUsuario = new javax.swing.JPopupMenu();
        btn_editarUsuario = new javax.swing.JMenuItem();
        btn_eliminarUsuario = new javax.swing.JMenuItem();
        popCategoria = new javax.swing.JPopupMenu();
        btn_editarCategoria = new javax.swing.JMenuItem();
        popProducto = new javax.swing.JPopupMenu();
        btn_editarProducto = new javax.swing.JMenuItem();
        popNuevaVenta = new javax.swing.JPopupMenu();
        btn_eliminarPedido = new javax.swing.JMenuItem();
        popCliente = new javax.swing.JPopupMenu();
        btn_editarCliente = new javax.swing.JMenuItem();
        btn_eliminarCliente = new javax.swing.JMenuItem();
        popDetalle = new javax.swing.JPopupMenu();
        btn_verDetalles = new javax.swing.JMenuItem();
        panel_fondo = new javax.swing.JPanel();
        panel_zzz = new javax.swing.JPanel();
        barraEmpresa = new javax.swing.JPanel();
        lbl_nombreEmpresa = new javax.swing.JLabel();
        lbl_idUsuario = new javax.swing.JLabel();
        lbl_datos = new javax.swing.JLabel();
        panel_menu = new javax.swing.JPanel();
        btn_cerrarSesion = new javax.swing.JButton();
        btn_usuarios = new javax.swing.JButton();
        btn_productos = new javax.swing.JButton();
        btn_categorias = new javax.swing.JButton();
        btn_ventas = new javax.swing.JButton();
        btn_entradas = new javax.swing.JButton();
        tabed = new javax.swing.JTabbedPane();
        panel_productos = new javax.swing.JPanel();
        btn_nuevoProducto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        productoTabla = new javax.swing.JTable();
        BusquedaDeProductoPorNOmbre = new javax.swing.JLabel();
        txt_buscarProducto = new javax.swing.JTextField();
        panel_entradas = new javax.swing.JPanel();
        txt_cantidadEntrada = new javax.swing.JTextField();
        btn_buscarProductoEntrada = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        nuevaEntradaTabla = new javax.swing.JTable();
        Nombre1 = new javax.swing.JLabel();
        btn_generarEntrada = new javax.swing.JButton();
        lbl_nombreEntrada = new javax.swing.JLabel();
        Cantidad1 = new javax.swing.JLabel();
        btn_agregarTablaEntrada = new javax.swing.JButton();
        lbl_stockEntrada = new javax.swing.JLabel();
        lbl_idProductoEntrada = new javax.swing.JLabel();
        lbl_idCliente1 = new javax.swing.JLabel();
        Stock1 = new javax.swing.JLabel();
        panel_ventas = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        ventasTabla = new javax.swing.JTable();
        RegistroDeVentas = new javax.swing.JLabel();
        panel_nuevasVentas = new javax.swing.JPanel();
        txt_cantidad = new javax.swing.JTextField();
        btn_buscarProducto = new javax.swing.JButton();
        Cliente = new javax.swing.JLabel();
        lbl_precio = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        nuevaVentaTabla = new javax.swing.JTable();
        Nombre = new javax.swing.JLabel();
        btn_generarVenta = new javax.swing.JButton();
        btn_buscarCliente = new javax.swing.JButton();
        Total = new javax.swing.JLabel();
        lbl_total = new javax.swing.JLabel();
        lbl_nombre = new javax.swing.JLabel();
        Cantidad = new javax.swing.JLabel();
        lbl_cliente = new javax.swing.JLabel();
        btn_agregarTabla = new javax.swing.JButton();
        lbl_stock = new javax.swing.JLabel();
        Precio = new javax.swing.JLabel();
        lbl_idProducto = new javax.swing.JLabel();
        lbl_idCliente = new javax.swing.JLabel();
        Stock = new javax.swing.JLabel();
        panel_usuarios = new javax.swing.JPanel();
        btn_nuevoUsuario = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        usuarioTabla = new javax.swing.JTable();
        BusquedaPorApellidoPaterno = new javax.swing.JLabel();
        txt_buscarUsuario = new javax.swing.JTextField();
        panel_categorias = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        categoriaTabla = new javax.swing.JTable();
        panel_cat = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_nombreCat = new javax.swing.JTextField();
        error_estadoCat = new javax.swing.JLabel();
        error_nombreCat = new javax.swing.JLabel();
        cbx_estadoCat = new javax.swing.JComboBox<>();
        btn_actualizarCategoria = new javax.swing.JButton();
        btn_registrarCategoria = new javax.swing.JButton();
        lbl_idCategoria = new javax.swing.JLabel();
        panel_clientes = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        clienteTabla = new javax.swing.JTable();
        btn_nuevoCliente = new javax.swing.JButton();
        txt_buscarCliente = new javax.swing.JTextField();
        BusquedaApellidoPaternoCLiente = new javax.swing.JLabel();

        popUsuario.setBorder(null);

        btn_editarUsuario.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        btn_editarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit_30px.png"))); // NOI18N
        btn_editarUsuario.setText("Editar");
        btn_editarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        popUsuario.add(btn_editarUsuario);

        btn_eliminarUsuario.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        btn_eliminarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete_30px.png"))); // NOI18N
        btn_eliminarUsuario.setText("Eliminar");
        btn_eliminarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_eliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarUsuarioActionPerformed(evt);
            }
        });
        popUsuario.add(btn_eliminarUsuario);

        btn_editarCategoria.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        btn_editarCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit_30px.png"))); // NOI18N
        btn_editarCategoria.setText("Editar");
        popCategoria.add(btn_editarCategoria);

        btn_editarProducto.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_editarProducto.setText("Editar");
        popProducto.add(btn_editarProducto);

        btn_eliminarPedido.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        btn_eliminarPedido.setText("Eliminar");
        popNuevaVenta.add(btn_eliminarPedido);

        btn_editarCliente.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        btn_editarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit_30px.png"))); // NOI18N
        btn_editarCliente.setText("Editar");
        popCliente.add(btn_editarCliente);

        btn_eliminarCliente.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        btn_eliminarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete_30px.png"))); // NOI18N
        btn_eliminarCliente.setText("Eliminar");
        popCliente.add(btn_eliminarCliente);

        btn_verDetalles.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        btn_verDetalles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/view_details_30px.png"))); // NOI18N
        btn_verDetalles.setText("Ver Detalles");
        btn_verDetalles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        popDetalle.add(btn_verDetalles);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panel_fondo.setBackground(new java.awt.Color(255, 255, 255));
        panel_fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_zzz.setBackground(new java.awt.Color(255, 255, 255));
        panel_zzz.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panel_fondo.add(panel_zzz, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 660, 1020, 40));

        barraEmpresa.setBackground(new java.awt.Color(254, 242, 220));
        barraEmpresa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_nombreEmpresa.setFont(new java.awt.Font("Elephant", 0, 24)); // NOI18N
        lbl_nombreEmpresa.setForeground(new java.awt.Color(255, 102, 51));
        lbl_nombreEmpresa.setText("Chosita Burguer");
        barraEmpresa.add(lbl_nombreEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 210, 50));

        lbl_idUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_idUsuario.setForeground(new java.awt.Color(254, 242, 220));
        lbl_idUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_idUsuario.setText("7");
        barraEmpresa.add(lbl_idUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, 40, 30));

        lbl_datos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_datos.setForeground(new java.awt.Color(51, 51, 51));
        lbl_datos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        barraEmpresa.add(lbl_datos, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, 280, 30));

        panel_fondo.add(barraEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 50));

        panel_menu.setBackground(new java.awt.Color(255, 153, 102));
        panel_menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_cerrarSesion.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_cerrarSesion.setText("Cerrar Sesion");
        btn_cerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_menu.add(btn_cerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, 160, 40));

        btn_usuarios.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_usuarios.setText("Usuarios");
        btn_usuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_menu.add(btn_usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 160, 40));

        btn_productos.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_productos.setText("Productos");
        btn_productos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_menu.add(btn_productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 160, 40));

        btn_categorias.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_categorias.setText("Categorias");
        btn_categorias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_menu.add(btn_categorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 160, 40));

        btn_ventas.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_ventas.setText("Salidas");
        btn_ventas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_menu.add(btn_ventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 160, 40));

        btn_entradas.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_entradas.setText("Entradas");
        btn_entradas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_menu.add(btn_entradas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 160, 40));

        panel_fondo.add(panel_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 180, 650));

        tabed.setBackground(new java.awt.Color(255, 255, 255));
        tabed.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        panel_productos.setBackground(new java.awt.Color(255, 255, 255));
        panel_productos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_nuevoProducto.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_nuevoProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add_40px.png"))); // NOI18N
        btn_nuevoProducto.setText("Nuevo Producto");
        panel_productos.add(btn_nuevoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 40, 230, 50));

        productoTabla.setBackground(new java.awt.Color(255, 255, 255));
        productoTabla.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        productoTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "DESCRIPCION", "CATEGORIA", "STOCK", "ESTADO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        productoTabla.setComponentPopupMenu(popProducto);
        productoTabla.setRowHeight(30);
        productoTabla.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        productoTabla.setShowHorizontalLines(true);
        productoTabla.getTableHeader().setResizingAllowed(false);
        productoTabla.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(productoTabla);
        if (productoTabla.getColumnModel().getColumnCount() > 0) {
            productoTabla.getColumnModel().getColumn(0).setResizable(false);
            productoTabla.getColumnModel().getColumn(0).setPreferredWidth(30);
            productoTabla.getColumnModel().getColumn(1).setResizable(false);
            productoTabla.getColumnModel().getColumn(2).setResizable(false);
            productoTabla.getColumnModel().getColumn(3).setResizable(false);
            productoTabla.getColumnModel().getColumn(4).setResizable(false);
            productoTabla.getColumnModel().getColumn(5).setResizable(false);
        }

        panel_productos.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 960, 460));

        BusquedaDeProductoPorNOmbre.setBackground(new java.awt.Color(255, 255, 255));
        BusquedaDeProductoPorNOmbre.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BusquedaDeProductoPorNOmbre.setForeground(new java.awt.Color(0, 0, 0));
        BusquedaDeProductoPorNOmbre.setText("Busqueda de producto por nombre");
        panel_productos.add(BusquedaDeProductoPorNOmbre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        txt_buscarProducto.setBackground(new java.awt.Color(255, 255, 255));
        txt_buscarProducto.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txt_buscarProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_buscarProductoKeyTyped(evt);
            }
        });
        panel_productos.add(txt_buscarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 300, 30));

        tabed.addTab("tab2", panel_productos);

        panel_entradas.setBackground(new java.awt.Color(255, 255, 255));
        panel_entradas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_entradas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_cantidadEntrada.setBackground(new java.awt.Color(255, 255, 255));
        txt_cantidadEntrada.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_cantidadEntrada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cantidadEntradaKeyTyped(evt);
            }
        });
        panel_entradas.add(txt_cantidadEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, 80, 30));

        btn_buscarProductoEntrada.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_buscarProductoEntrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search_40px.png"))); // NOI18N
        btn_buscarProductoEntrada.setText("Producto");
        btn_buscarProductoEntrada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_entradas.add(btn_buscarProductoEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 150, 50));

        nuevaEntradaTabla.setBackground(new java.awt.Color(255, 255, 255));
        nuevaEntradaTabla.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        nuevaEntradaTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "ITEM", "NOMBRE", "CANTIDAD"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        nuevaEntradaTabla.setRowHeight(30);
        nuevaEntradaTabla.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        nuevaEntradaTabla.setShowHorizontalLines(true);
        nuevaEntradaTabla.getTableHeader().setResizingAllowed(false);
        nuevaEntradaTabla.getTableHeader().setReorderingAllowed(false);
        jScrollPane7.setViewportView(nuevaEntradaTabla);
        if (nuevaEntradaTabla.getColumnModel().getColumnCount() > 0) {
            nuevaEntradaTabla.getColumnModel().getColumn(0).setMinWidth(0);
            nuevaEntradaTabla.getColumnModel().getColumn(0).setPreferredWidth(0);
            nuevaEntradaTabla.getColumnModel().getColumn(0).setMaxWidth(0);
            nuevaEntradaTabla.getColumnModel().getColumn(1).setResizable(false);
            nuevaEntradaTabla.getColumnModel().getColumn(1).setPreferredWidth(0);
            nuevaEntradaTabla.getColumnModel().getColumn(2).setResizable(false);
            nuevaEntradaTabla.getColumnModel().getColumn(2).setPreferredWidth(200);
            nuevaEntradaTabla.getColumnModel().getColumn(3).setResizable(false);
            nuevaEntradaTabla.getColumnModel().getColumn(3).setPreferredWidth(50);
        }

        panel_entradas.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 960, -1));

        Nombre1.setBackground(new java.awt.Color(0, 0, 0));
        Nombre1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Nombre1.setForeground(new java.awt.Color(0, 0, 0));
        Nombre1.setText("Nombre");
        panel_entradas.add(Nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 90, 20));

        btn_generarEntrada.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_generarEntrada.setText("Generar Venta");
        btn_generarEntrada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_entradas.add(btn_generarEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 560, 210, 50));

        lbl_nombreEntrada.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        panel_entradas.add(lbl_nombreEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 260, 30));

        Cantidad1.setBackground(new java.awt.Color(0, 0, 0));
        Cantidad1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Cantidad1.setForeground(new java.awt.Color(0, 0, 0));
        Cantidad1.setText("Cantidad");
        panel_entradas.add(Cantidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 50, 80, 20));

        btn_agregarTablaEntrada.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btn_agregarTablaEntrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buy_40px.png"))); // NOI18N
        btn_agregarTablaEntrada.setText("Añadir");
        btn_agregarTablaEntrada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_entradas.add(btn_agregarTablaEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 50, 130, 50));

        lbl_stockEntrada.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        panel_entradas.add(lbl_stockEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 70, 80, 30));

        lbl_idProductoEntrada.setForeground(new java.awt.Color(255, 255, 255));
        panel_entradas.add(lbl_idProductoEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 50, 20));

        lbl_idCliente1.setForeground(new java.awt.Color(255, 255, 255));
        panel_entradas.add(lbl_idCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 50, 20));

        Stock1.setBackground(new java.awt.Color(0, 0, 0));
        Stock1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Stock1.setForeground(new java.awt.Color(0, 0, 0));
        Stock1.setText("Stock");
        panel_entradas.add(Stock1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 50, 80, 20));

        tabed.addTab("tab4", panel_entradas);

        panel_ventas.setBackground(new java.awt.Color(255, 255, 255));
        panel_ventas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ventasTabla.setBackground(new java.awt.Color(255, 255, 255));
        ventasTabla.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        ventasTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "USUARIO", "CLIENTE", "MONTO", "FECHA VENTA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ventasTabla.setComponentPopupMenu(popDetalle);
        ventasTabla.setRowHeight(30);
        ventasTabla.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        ventasTabla.setShowHorizontalLines(true);
        ventasTabla.getTableHeader().setResizingAllowed(false);
        ventasTabla.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(ventasTabla);
        if (ventasTabla.getColumnModel().getColumnCount() > 0) {
            ventasTabla.getColumnModel().getColumn(0).setResizable(false);
            ventasTabla.getColumnModel().getColumn(0).setPreferredWidth(30);
            ventasTabla.getColumnModel().getColumn(1).setResizable(false);
            ventasTabla.getColumnModel().getColumn(1).setPreferredWidth(80);
            ventasTabla.getColumnModel().getColumn(2).setResizable(false);
            ventasTabla.getColumnModel().getColumn(2).setPreferredWidth(250);
            ventasTabla.getColumnModel().getColumn(3).setResizable(false);
            ventasTabla.getColumnModel().getColumn(3).setPreferredWidth(50);
            ventasTabla.getColumnModel().getColumn(4).setResizable(false);
        }

        panel_ventas.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 930, 510));

        RegistroDeVentas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        RegistroDeVentas.setForeground(new java.awt.Color(0, 0, 0));
        RegistroDeVentas.setText("Registro de Ventas");
        panel_ventas.add(RegistroDeVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 280, 30));

        tabed.addTab("tab6", panel_ventas);

        panel_nuevasVentas.setBackground(new java.awt.Color(255, 255, 255));
        panel_nuevasVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_nuevasVentas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_cantidad.setBackground(new java.awt.Color(255, 255, 255));
        txt_cantidad.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        panel_nuevasVentas.add(txt_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, 80, 30));

        btn_buscarProducto.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_buscarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search_40px.png"))); // NOI18N
        btn_buscarProducto.setText("Producto");
        btn_buscarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_nuevasVentas.add(btn_buscarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 150, 50));

        Cliente.setBackground(new java.awt.Color(0, 0, 0));
        Cliente.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Cliente.setForeground(new java.awt.Color(0, 0, 0));
        Cliente.setText("Cliente");
        panel_nuevasVentas.add(Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 560, 90, 20));

        lbl_precio.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        panel_nuevasVentas.add(lbl_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, 80, 30));

        nuevaVentaTabla.setBackground(new java.awt.Color(255, 255, 255));
        nuevaVentaTabla.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        nuevaVentaTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "ITEM", "NOMBRE", "PRECIO UNIT.", "CANTIDAD", "SUB TOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        nuevaVentaTabla.setRowHeight(30);
        nuevaVentaTabla.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        nuevaVentaTabla.setShowHorizontalLines(true);
        nuevaVentaTabla.getTableHeader().setResizingAllowed(false);
        nuevaVentaTabla.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(nuevaVentaTabla);
        if (nuevaVentaTabla.getColumnModel().getColumnCount() > 0) {
            nuevaVentaTabla.getColumnModel().getColumn(0).setMinWidth(0);
            nuevaVentaTabla.getColumnModel().getColumn(0).setPreferredWidth(0);
            nuevaVentaTabla.getColumnModel().getColumn(0).setMaxWidth(0);
            nuevaVentaTabla.getColumnModel().getColumn(1).setResizable(false);
            nuevaVentaTabla.getColumnModel().getColumn(1).setPreferredWidth(0);
            nuevaVentaTabla.getColumnModel().getColumn(2).setResizable(false);
            nuevaVentaTabla.getColumnModel().getColumn(2).setPreferredWidth(200);
            nuevaVentaTabla.getColumnModel().getColumn(3).setResizable(false);
            nuevaVentaTabla.getColumnModel().getColumn(3).setPreferredWidth(50);
            nuevaVentaTabla.getColumnModel().getColumn(4).setResizable(false);
            nuevaVentaTabla.getColumnModel().getColumn(4).setPreferredWidth(50);
            nuevaVentaTabla.getColumnModel().getColumn(5).setResizable(false);
            nuevaVentaTabla.getColumnModel().getColumn(5).setPreferredWidth(50);
        }

        panel_nuevasVentas.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 960, -1));

        Nombre.setBackground(new java.awt.Color(0, 0, 0));
        Nombre.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Nombre.setForeground(new java.awt.Color(0, 0, 0));
        Nombre.setText("Nombre");
        panel_nuevasVentas.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 90, 20));

        btn_generarVenta.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_generarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cash_register_40px.png"))); // NOI18N
        btn_generarVenta.setText("Generar Venta");
        btn_generarVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_nuevasVentas.add(btn_generarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 560, 210, 50));

        btn_buscarCliente.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_buscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search_40px.png"))); // NOI18N
        btn_buscarCliente.setText("Cliente");
        btn_buscarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_nuevasVentas.add(btn_buscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 150, 50));

        Total.setBackground(new java.awt.Color(0, 0, 0));
        Total.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        Total.setForeground(new java.awt.Color(0, 0, 0));
        Total.setText("Total :");
        panel_nuevasVentas.add(Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 570, 80, 30));

        lbl_total.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lbl_total.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panel_nuevasVentas.add(lbl_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 570, 140, 30));

        lbl_nombre.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        panel_nuevasVentas.add(lbl_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 260, 30));

        Cantidad.setBackground(new java.awt.Color(0, 0, 0));
        Cantidad.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Cantidad.setForeground(new java.awt.Color(0, 0, 0));
        Cantidad.setText("Cantidad");
        panel_nuevasVentas.add(Cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 50, 80, 20));

        lbl_cliente.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        panel_nuevasVentas.add(lbl_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 580, 260, 30));

        btn_agregarTabla.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btn_agregarTabla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buy_40px.png"))); // NOI18N
        btn_agregarTabla.setText("Añadir");
        btn_agregarTabla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel_nuevasVentas.add(btn_agregarTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 50, 130, 50));

        lbl_stock.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        panel_nuevasVentas.add(lbl_stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 70, 80, 30));

        Precio.setBackground(new java.awt.Color(0, 0, 0));
        Precio.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Precio.setForeground(new java.awt.Color(0, 0, 0));
        Precio.setText("Precio");
        panel_nuevasVentas.add(Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 80, 20));

        lbl_idProducto.setForeground(new java.awt.Color(255, 255, 255));
        panel_nuevasVentas.add(lbl_idProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 50, 20));

        lbl_idCliente.setForeground(new java.awt.Color(255, 255, 255));
        panel_nuevasVentas.add(lbl_idCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 50, 20));

        Stock.setBackground(new java.awt.Color(0, 0, 0));
        Stock.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Stock.setForeground(new java.awt.Color(0, 0, 0));
        Stock.setText("Stock");
        panel_nuevasVentas.add(Stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 50, 80, 20));

        tabed.addTab("tab4", panel_nuevasVentas);

        panel_usuarios.setBackground(new java.awt.Color(255, 255, 255));
        panel_usuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_nuevoUsuario.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_nuevoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add_40px.png"))); // NOI18N
        btn_nuevoUsuario.setText("Nuevo Usuario");
        panel_usuarios.add(btn_nuevoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 50, 230, 50));

        usuarioTabla.setBackground(new java.awt.Color(255, 255, 255));
        usuarioTabla.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        usuarioTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "APELLIDO P.", "APELLIDO M.", "DNI", "CELULAR", "USUARIO", "ROL", "ESTADO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        usuarioTabla.setComponentPopupMenu(popUsuario);
        usuarioTabla.setRowHeight(30);
        usuarioTabla.setSelectionBackground(new java.awt.Color(255, 153, 102));
        usuarioTabla.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        usuarioTabla.setShowGrid(false);
        usuarioTabla.setShowHorizontalLines(true);
        usuarioTabla.getTableHeader().setResizingAllowed(false);
        usuarioTabla.getTableHeader().setReorderingAllowed(false);
        usuarioTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usuarioTablaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(usuarioTabla);
        if (usuarioTabla.getColumnModel().getColumnCount() > 0) {
            usuarioTabla.getColumnModel().getColumn(0).setResizable(false);
            usuarioTabla.getColumnModel().getColumn(0).setPreferredWidth(30);
            usuarioTabla.getColumnModel().getColumn(1).setResizable(false);
            usuarioTabla.getColumnModel().getColumn(2).setResizable(false);
            usuarioTabla.getColumnModel().getColumn(3).setResizable(false);
            usuarioTabla.getColumnModel().getColumn(4).setResizable(false);
            usuarioTabla.getColumnModel().getColumn(4).setPreferredWidth(50);
            usuarioTabla.getColumnModel().getColumn(5).setResizable(false);
            usuarioTabla.getColumnModel().getColumn(5).setPreferredWidth(50);
            usuarioTabla.getColumnModel().getColumn(6).setResizable(false);
            usuarioTabla.getColumnModel().getColumn(7).setResizable(false);
            usuarioTabla.getColumnModel().getColumn(7).setPreferredWidth(65);
            usuarioTabla.getColumnModel().getColumn(8).setResizable(false);
            usuarioTabla.getColumnModel().getColumn(8).setPreferredWidth(20);
        }

        panel_usuarios.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 960, 460));

        BusquedaPorApellidoPaterno.setBackground(new java.awt.Color(255, 255, 255));
        BusquedaPorApellidoPaterno.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BusquedaPorApellidoPaterno.setForeground(new java.awt.Color(0, 0, 0));
        BusquedaPorApellidoPaterno.setText("Busqueda por Apellido Paterno");
        panel_usuarios.add(BusquedaPorApellidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        txt_buscarUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txt_buscarUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_buscarUsuarioKeyTyped(evt);
            }
        });
        panel_usuarios.add(txt_buscarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 270, 30));

        tabed.addTab("tab1", panel_usuarios);

        panel_categorias.setBackground(new java.awt.Color(255, 255, 255));

        categoriaTabla.setBackground(new java.awt.Color(255, 255, 255));
        categoriaTabla.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        categoriaTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "ESTADO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        categoriaTabla.setComponentPopupMenu(popCategoria);
        categoriaTabla.setRowHeight(30);
        categoriaTabla.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        categoriaTabla.setShowHorizontalLines(true);
        categoriaTabla.getTableHeader().setResizingAllowed(false);
        categoriaTabla.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(categoriaTabla);
        if (categoriaTabla.getColumnModel().getColumnCount() > 0) {
            categoriaTabla.getColumnModel().getColumn(0).setResizable(false);
            categoriaTabla.getColumnModel().getColumn(1).setResizable(false);
            categoriaTabla.getColumnModel().getColumn(2).setResizable(false);
        }

        panel_cat.setBackground(new java.awt.Color(255, 255, 255));
        panel_cat.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panel_cat.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Estado");
        panel_cat.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 80, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Nombre ");
        panel_cat.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 80, 30));

        jPanel4.setBackground(new java.awt.Color(255, 153, 51));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NUEVA CATEGORIA");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, 40));

        panel_cat.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 60));

        txt_nombreCat.setBackground(new java.awt.Color(255, 255, 255));
        txt_nombreCat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreCatKeyTyped(evt);
            }
        });
        panel_cat.add(txt_nombreCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 170, 30));

        error_estadoCat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        error_estadoCat.setForeground(new java.awt.Color(255, 51, 51));
        error_estadoCat.setText("Error");
        panel_cat.add(error_estadoCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 170, -1));

        error_nombreCat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        error_nombreCat.setForeground(new java.awt.Color(255, 51, 51));
        error_nombreCat.setText("Error");
        panel_cat.add(error_nombreCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 170, 20));

        cbx_estadoCat.setBackground(new java.awt.Color(255, 255, 255));
        cbx_estadoCat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        cbx_estadoCat.setSelectedIndex(-1);
        panel_cat.add(cbx_estadoCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 170, 30));

        btn_actualizarCategoria.setBackground(new java.awt.Color(0, 0, 0));
        btn_actualizarCategoria.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_actualizarCategoria.setForeground(new java.awt.Color(255, 153, 102));
        btn_actualizarCategoria.setText("Actualizar");
        btn_actualizarCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_actualizarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarCategoriaActionPerformed(evt);
            }
        });
        panel_cat.add(btn_actualizarCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 100, 40));

        btn_registrarCategoria.setBackground(new java.awt.Color(0, 0, 0));
        btn_registrarCategoria.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_registrarCategoria.setForeground(new java.awt.Color(255, 153, 102));
        btn_registrarCategoria.setText("Registrar");
        btn_registrarCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_registrarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarCategoriaActionPerformed(evt);
            }
        });
        panel_cat.add(btn_registrarCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 100, 40));

        lbl_idCategoria.setForeground(new java.awt.Color(255, 255, 255));
        panel_cat.add(lbl_idCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 50, 30));

        javax.swing.GroupLayout panel_categoriasLayout = new javax.swing.GroupLayout(panel_categorias);
        panel_categorias.setLayout(panel_categoriasLayout);
        panel_categoriasLayout.setHorizontalGroup(
            panel_categoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_categoriasLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(panel_cat, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel_categoriasLayout.setVerticalGroup(
            panel_categoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_categoriasLayout.createSequentialGroup()
                .addGroup(panel_categoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_categoriasLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(panel_cat, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_categoriasLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(90, 90, 90))
        );

        tabed.addTab("tab5", panel_categorias);

        panel_clientes.setBackground(new java.awt.Color(255, 255, 255));
        panel_clientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        clienteTabla.setBackground(new java.awt.Color(255, 255, 255));
        clienteTabla.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        clienteTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "APELLIDO P.", "APELLIDO M.", "CELULAR", "ESTADO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        clienteTabla.setComponentPopupMenu(popCliente);
        clienteTabla.setRowHeight(30);
        clienteTabla.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        clienteTabla.setShowHorizontalLines(true);
        clienteTabla.getTableHeader().setResizingAllowed(false);
        clienteTabla.getTableHeader().setReorderingAllowed(false);
        jScrollPane6.setViewportView(clienteTabla);

        panel_clientes.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 960, 460));

        btn_nuevoCliente.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_nuevoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add_40px.png"))); // NOI18N
        btn_nuevoCliente.setText("Nuevo CLiente");
        panel_clientes.add(btn_nuevoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 50, 230, 50));

        txt_buscarCliente.setBackground(new java.awt.Color(255, 255, 255));
        txt_buscarCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_buscarClienteKeyTyped(evt);
            }
        });
        panel_clientes.add(txt_buscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 270, 30));

        BusquedaApellidoPaternoCLiente.setBackground(new java.awt.Color(255, 255, 255));
        BusquedaApellidoPaternoCLiente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BusquedaApellidoPaternoCLiente.setForeground(new java.awt.Color(0, 0, 0));
        BusquedaApellidoPaternoCLiente.setText("Busqueda por Apellido Paterno");
        panel_clientes.add(BusquedaApellidoPaternoCLiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        tabed.addTab("tab8", panel_clientes);

        panel_fondo.add(tabed, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 1020, 650));

        getContentPane().add(panel_fondo, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuarioTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuarioTablaMouseClicked

    }//GEN-LAST:event_usuarioTablaMouseClicked

    private void btn_eliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_eliminarUsuarioActionPerformed

    private void btn_actualizarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_actualizarCategoriaActionPerformed

    private void btn_registrarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_registrarCategoriaActionPerformed

    private void txt_buscarClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscarClienteKeyTyped
        //        Principal p = new Principal();
        //        formCliente fc = new formCliente(new javax.swing.JFrame(), true);
        //        editCliente ec = new editCliente(new javax.swing.JFrame(), true);
        //        Controlador_Cliente ccli = new Controlador_Cliente(p, fc, ec);
        //        ccli.tablaDatos(clienteTabla);
    }//GEN-LAST:event_txt_buscarClienteKeyTyped

    private void txt_buscarProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscarProductoKeyTyped
        soloLetras(txt_buscarProducto, 10, evt);
    }//GEN-LAST:event_txt_buscarProductoKeyTyped

    private void txt_buscarUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscarUsuarioKeyTyped
        soloLetras(txt_buscarUsuario, 10, evt);
    }//GEN-LAST:event_txt_buscarUsuarioKeyTyped

    private void txt_cantidadEntradaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cantidadEntradaKeyTyped
        soloNumeros(txt_cantidadEntrada, 3, evt);
    }//GEN-LAST:event_txt_cantidadEntradaKeyTyped

    private void txt_nombreCatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreCatKeyTyped
        soloLetras(txt_nombreCat, 45, evt);
    }//GEN-LAST:event_txt_nombreCatKeyTyped

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Principal p = new Principal();
                Login l = new Login();
                formUsuario f = new formUsuario(new javax.swing.JFrame(), true);
                editUsuario e = new editUsuario(new javax.swing.JFrame(), true);
                formProducto fp = new formProducto(new javax.swing.JFrame(), true);
                editProducto ep = new editProducto(new javax.swing.JFrame(), true);
                BusquedaProductoEntrada busProducto = new BusquedaProductoEntrada(new javax.swing.JFrame(), true);
               
                
                Controlador_Usuario cu = new Controlador_Usuario(p, f, e);
                Controlador_Categoria cc = new Controlador_Categoria(p);
                Controlador_Producto cp = new Controlador_Producto(p, fp, ep);
                Controlador_Entrada ce = new Controlador_Entrada(p, busProducto);
               
                
                Controlador_Login clogin= new Controlador_Login(l, p);
                //CP xd = new CP(p, fp, ep);
                
                cc.ocultarErrores();
                cu.ocultarErrores();
                cp.ocultarErrores();

//                ccli.eventosTeclado();
                //cp.llenarCategoria();
                p.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BusquedaApellidoPaternoCLiente;
    private javax.swing.JLabel BusquedaDeProductoPorNOmbre;
    private javax.swing.JLabel BusquedaPorApellidoPaterno;
    private javax.swing.JLabel Cantidad;
    private javax.swing.JLabel Cantidad1;
    private javax.swing.JLabel Cliente;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel Nombre1;
    private javax.swing.JLabel Precio;
    private javax.swing.JLabel RegistroDeVentas;
    private javax.swing.JLabel Stock;
    private javax.swing.JLabel Stock1;
    private javax.swing.JLabel Total;
    private javax.swing.JPanel barraEmpresa;
    public javax.swing.JButton btn_actualizarCategoria;
    public javax.swing.JButton btn_agregarTabla;
    public javax.swing.JButton btn_agregarTablaEntrada;
    public javax.swing.JButton btn_buscarCliente;
    public javax.swing.JButton btn_buscarProducto;
    public javax.swing.JButton btn_buscarProductoEntrada;
    public javax.swing.JButton btn_categorias;
    public javax.swing.JButton btn_cerrarSesion;
    public javax.swing.JMenuItem btn_editarCategoria;
    public javax.swing.JMenuItem btn_editarCliente;
    public javax.swing.JMenuItem btn_editarProducto;
    public javax.swing.JMenuItem btn_editarUsuario;
    public javax.swing.JMenuItem btn_eliminarCliente;
    public javax.swing.JMenuItem btn_eliminarPedido;
    public javax.swing.JMenuItem btn_eliminarUsuario;
    public javax.swing.JButton btn_entradas;
    public javax.swing.JButton btn_generarEntrada;
    public javax.swing.JButton btn_generarVenta;
    public javax.swing.JButton btn_nuevoCliente;
    public javax.swing.JButton btn_nuevoProducto;
    public javax.swing.JButton btn_nuevoUsuario;
    public javax.swing.JButton btn_productos;
    public javax.swing.JButton btn_registrarCategoria;
    public javax.swing.JButton btn_usuarios;
    public javax.swing.JButton btn_ventas;
    public javax.swing.JMenuItem btn_verDetalles;
    public static javax.swing.JTable categoriaTabla;
    public static javax.swing.JComboBox<String> cbx_estadoCat;
    public static javax.swing.JTable clienteTabla;
    public static javax.swing.JLabel error_estadoCat;
    public static javax.swing.JLabel error_nombreCat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    public static javax.swing.JLabel lbl_cliente;
    public static javax.swing.JLabel lbl_datos;
    public static javax.swing.JLabel lbl_idCategoria;
    public static javax.swing.JLabel lbl_idCliente;
    public static javax.swing.JLabel lbl_idCliente1;
    public static javax.swing.JLabel lbl_idProducto;
    public static javax.swing.JLabel lbl_idProductoEntrada;
    public static javax.swing.JLabel lbl_idUsuario;
    public static javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_nombreEmpresa;
    public static javax.swing.JLabel lbl_nombreEntrada;
    public static javax.swing.JLabel lbl_precio;
    public static javax.swing.JLabel lbl_stock;
    public static javax.swing.JLabel lbl_stockEntrada;
    public static javax.swing.JLabel lbl_total;
    public static javax.swing.JTable nuevaEntradaTabla;
    public static javax.swing.JTable nuevaVentaTabla;
    public static javax.swing.JPanel panel_cat;
    public static javax.swing.JPanel panel_categorias;
    public static javax.swing.JPanel panel_clientes;
    public static javax.swing.JPanel panel_entradas;
    private javax.swing.JPanel panel_fondo;
    private javax.swing.JPanel panel_menu;
    public static javax.swing.JPanel panel_nuevasVentas;
    public static javax.swing.JPanel panel_productos;
    public static javax.swing.JPanel panel_usuarios;
    public static javax.swing.JPanel panel_ventas;
    private javax.swing.JPanel panel_zzz;
    private javax.swing.JPopupMenu popCategoria;
    private javax.swing.JPopupMenu popCliente;
    private javax.swing.JPopupMenu popDetalle;
    private javax.swing.JPopupMenu popNuevaVenta;
    private javax.swing.JPopupMenu popProducto;
    private javax.swing.JPopupMenu popUsuario;
    public static javax.swing.JTable productoTabla;
    public static javax.swing.JTabbedPane tabed;
    public static javax.swing.JTextField txt_buscarCliente;
    public static javax.swing.JTextField txt_buscarProducto;
    public static javax.swing.JTextField txt_buscarUsuario;
    public static javax.swing.JTextField txt_cantidad;
    public static javax.swing.JTextField txt_cantidadEntrada;
    public static javax.swing.JTextField txt_nombreCat;
    public static javax.swing.JTable usuarioTabla;
    public static javax.swing.JTable ventasTabla;
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
    public void soloLetras(JTextField txt, int tamMax, KeyEvent evt) {
        char c = evt.getKeyChar();

        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
            evt.consume();
        }
        if (Character.isLetter(c)) {
            if (txt.getText().length() >= tamMax) {
                evt.consume();
            }
        }
    }
    public void mixto(JTextField txt, int tamMax, KeyEvent evt) {
        char c = evt.getKeyChar();

        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < '0' || c > '9')) {
            evt.consume();
        }

        if (txt.getText().length() >= tamMax) {
            evt.consume();
        }
        else if(evt.getKeyChar()== 32 ){
            evt.consume();
        }
        
    }
}
