package Controlador;

import Modelo.Categoria;
import Modelo.CategoriaDAO;

import Modelo.ComboBox;
import Modelo.Producto;
import Modelo.ProductoDAO;

import Vista.Principal;
import static Vista.Principal.*;
import static Vista.Producto.editProducto.*;
import static Vista.Producto.formProducto.*;
import Vista.Producto.editProducto;
import Vista.Producto.formProducto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public final class Controlador_Producto implements ActionListener {

    private final Principal principal;
    private final formProducto formProducto;
    private final editProducto editProducto;
    Producto producto = new Producto();
    ProductoDAO productoDAO = new ProductoDAO();
    CategoriaDAO categoriaDAO = new CategoriaDAO();
    DefaultTableModel tablaP = new DefaultTableModel();

    public Controlador_Producto(Principal principal, formProducto formProducto, editProducto editProducto) {
        this.principal = principal;
        this.formProducto = formProducto;
        this.editProducto = editProducto;
        principal.btn_productos.addActionListener(this);
        principal.btn_nuevoProducto.addActionListener(this);
        principal.btn_editarProducto.addActionListener(this);
        formProducto.btn_registrar.addActionListener(this);
        principal.btn_editarProducto.addActionListener(this);
        editProducto.btn_actualizar.addActionListener(this);
        //llenarCategoria();
        buscarProducto();
        ocultarErrores();
        limpiarCampos();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == principal.btn_productos) {
            principal.tabed.setSelectedComponent(panel_productos);
            listarProducto(principal.productoTabla);
        }
        if (e.getSource() == principal.btn_nuevoProducto) {
            ocultarErrores();
            limpiarCampos();
            llenarCategoria(formProducto.cbx_categoria);
            formProducto.setVisible(true);
        }
        if (e.getSource() == formProducto.btn_registrar) {
            registrarProducto();
            listarProducto(productoTabla);
        }
        if (e.getSource() == principal.btn_editarProducto) {
            llenarCategoria(editProducto.cbx_categoria);
            editarProducto();
            //editProducto.setVisible(true);
        }

        if (e.getSource() == editProducto.btn_actualizar) {
            actualizarProducto();
            listarProducto(productoTabla);

        }
    }

    public void ocultarErrores() {
        formProducto.error_nombre.setVisible(false);
        formProducto.error_categoria.setVisible(false);

        editProducto.error_nombre.setVisible(false);
        editProducto.error_categoria.setVisible(false);
        editProducto.error_estado.setVisible(false);

    }

    public void limpiarCampos() {
        formProducto.txt_nombre.setText("");
        formProducto.txt_descrip.setText("");
        //formProducto.cbx_categoria.setSelectedIndex(0);

        editProducto.txt_nombre.setText("");
        editProducto.txt_descrip.setText("");
        // editProducto.cbx_categoria.setSelectedIndex(0);
        //editProducto.cbx_estado.setSelectedIndex(0);

    }

    public boolean validar(JTextField txt, JLabel lbl) {
        if (txt.getText().isEmpty() || txt.getText().isBlank()) {
            lbl.setVisible(true);
            lbl.setText("Campo obligatorio");
            return false;
        }
        lbl.setVisible(false);
        return true;
    }

    public boolean validarCbx(JComboBox cbx, JLabel lbl) {
        if (cbx.getSelectedIndex() < 0) {
            lbl.setVisible(true);
            lbl.setText("Seleccione una categoria");
            return false;
        }
        lbl.setVisible(false);
        return true;
    }

    public boolean validar123(JTextField txt, JLabel lbl, String tipo) {

        if (txt.getText().isEmpty() || txt.getText().isBlank()) {
            lbl.setVisible(true);
            lbl.setText("Campo obligatorio");
            return false;
        }
        switch (tipo) {
            case "int": {
                int valor_int = Integer.parseInt(txt.getText());
                if (valor_int <= 0) {
                    lbl.setVisible(true);
                    lbl.setText("Debe ser mayor a 0");
                    return false;
                }
                return true;
            }
            case "double": {
                double valor_double = Double.parseDouble(txt.getText());
                if (valor_double <= 0) {
                    lbl.setVisible(true);
                    lbl.setText("Debe ser mayor a 0");
                    return false;
                }
                return true;
            }
            default: {

            }

        }
        lbl.setVisible(false);
        return true;
    }

    public void llenarCategoria(JComboBox cbx) {
        cbx.removeAllItems();
        List<Categoria> listaC = categoriaDAO.listarCategoriaActiva();
        for (int i = 0; i < listaC.size(); i++) {
            int id = listaC.get(i).getId();
            String nombre = listaC.get(i).getNombre();
            cbx.addItem(new ComboBox(id, nombre));
        }
        System.out.println("categoria llena");
    }

    public void registrarProducto() {
        if (validar(formProducto.txt_nombre, formProducto.error_nombre) != false) {
            producto.setNombre(formProducto.txt_nombre.getText());
            producto.setDescripcion(formProducto.txt_descrip.getText());

            ComboBox obj = (ComboBox) formProducto.cbx_categoria.getSelectedItem();
            producto.setId_categoria(obj.getId());
            System.out.println(formProducto.txt_nombre.getText() + "\n" + formProducto.txt_descrip.getText() + "\n"
                    + "\n" + obj.getId());
            productoDAO.agregarProducto(producto);

            ocultarErrores();
            limpiarCampos();
            formProducto.setVisible(false);
            JOptionPane.showMessageDialog(null, "Registrado");
        }
    }

    public void listarProducto(JTable tabla) {
        limpiarTablaProducto();
        List<Producto> listaP = productoDAO.listarProducto();
        if (listaP != null) {
            tablaP = (DefaultTableModel) tabla.getModel();
            Object[] obj = new Object[6];
            for (int i = 0; i < listaP.size(); i++) {
                obj[0] = listaP.get(i).getId();
                obj[1] = listaP.get(i).getNombre();
                obj[2] = listaP.get(i).getDescripcion();
                obj[3] = listaP.get(i).getNomCategoria();
                //obj[4] = listaP.get(i).getPrecio();
                obj[4] = listaP.get(i).getCantidad();
                obj[5] = listaP.get(i).getEstado();
                //System.out.println(obj[0] + "\n" + obj[1] + "\n" + obj[2] + "\n" + obj[3] + "\n" + obj[4] + "\n" + obj[5] + "\n" + obj[6] + "\n");
                tablaP.addRow(obj);
            }
            tabla.setModel(tablaP);
        } else {
            System.out.println("vacio");
        }

    }

    public void limpiarTablaProducto() {
        for (int i = 0; i < tablaP.getRowCount(); i++) {
            tablaP.removeRow(i);
            i = i - 1;
        }
    }

    public void editarProducto() {
        int fila = principal.productoTabla.getSelectedRow();
        editProducto.lbl_id.setText(productoTabla.getValueAt(fila, 0).toString());
        editProducto.txt_nombre.setText(productoTabla.getValueAt(fila, 1).toString());
        editProducto.txt_descrip.setText(productoTabla.getValueAt(fila, 2).toString());
        //editProducto.cbx_categoria.setSelectedItem(productoTabla.getValueAt(fila, 3).toString());       
        editProducto.cbx_estado.setSelectedItem(productoTabla.getValueAt(fila, 5).toString());
//        System.out.println("datos enviados");
        editProducto.setVisible(true);
    }

    public void actualizarProducto() {
        //System.out.println("actulizar funciona");
        if (validar(editProducto.txt_nombre, editProducto.error_nombre) != false) {
            
            producto.setNombre(editProducto.txt_nombre.getText());
            producto.setDescripcion(editProducto.txt_descrip.getText());

            ComboBox obj = (ComboBox) editProducto.cbx_categoria.getSelectedItem();
            producto.setId_categoria(obj.getId());
            producto.setId(Integer.parseInt(editProducto.lbl_id.getText()));
            producto.setEstado(editProducto.cbx_estado.getSelectedItem().toString());
            System.out.println(editProducto.txt_nombre.getText() + "\n" + editProducto.txt_descrip.getText() + "\n" +editProducto.cbx_estado.getSelectedItem().toString()
                    +  "\n cat : " + obj.getId());
            int rpta = productoDAO.actualizarProducto(producto);
            editProducto.setVisible(false);
            editProducto.setVisible(false);
            ocultarErrores();
            limpiarCampos();
            if (rpta != 0) {
                listarProducto(ventasTabla);
                JOptionPane.showMessageDialog(null, "Actualizado");
                
            } else {
                JOptionPane.showMessageDialog(null, "Ocurrio un error, no se pudo actulizar");
            }

        }
    }

    public void eliminarProducto() {
        int fila = principal.productoTabla.getSelectedRow();
        int pregunta = JOptionPane.showConfirmDialog(null, "DESEA ELIMINAR ?");
        if (pregunta == 0) {
            int id = Integer.parseInt(principal.productoTabla.getValueAt(fila, 0).toString());
            productoDAO.eliminarProducto(id);
            limpiarTablaProducto();
            listarProducto(principal.productoTabla);
        }
    }

    public void tablaDatosProducto(JTable tabla) {
        limpiarTablaProducto();

        String valor = txt_buscarProducto.getText();
        List<Producto> listaCli = productoDAO.buscarProducto(valor);
        //System.out.println("filtro : " + filtro + "\n" + "valor : " + a);
        tablaP = (DefaultTableModel) tabla.getModel();
        Object[] obj = new Object[6];
        for (int i = 0; i < listaCli.size(); i++) {
            obj[0] = listaCli.get(i).getId();
            obj[1] = listaCli.get(i).getNombre();
            obj[2] = listaCli.get(i).getDescripcion();
            obj[3] = listaCli.get(i).getNomCategoria();
            //obj[4] = listaCli.get(i).getPrecio();
            obj[4] = listaCli.get(i).getCantidad();
            obj[5] = listaCli.get(i).getEstado();
            tablaP.addRow(obj);
            //System.out.println(obj[0] + "\n" + obj[1] + "\n" + obj[2] + "\n" + obj[3] + "\n" + obj[4] + "\n" + obj[5]);
        }
        tabla.setModel(tablaP);
    }

    public void buscarProducto() {
        //BusquedaCliente busC = new BusquedaCliente(principal, true);
        KeyListener evento = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                tablaDatosProducto(productoTabla);
                //tablaDatosCliente(busC.busquedaClienteTabla);
            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        };
        txt_buscarProducto.addKeyListener(evento);

        //busC.txt_valorCli.addKeyListener(evento);
    }
//
//    public void actualizarUsuario() {
//        if (validar(editProducto.txt_nombre, editProducto.error_nombre) != false && validar(editProducto.txt_paterno, editProducto.error_paterno) != false && validar(editProducto.txt_materno, editProducto.error_materno) != false
//                && validarTamañoDuplicado(editProducto.txt_dni, editProducto.error_dni, 8, "dni", "A") != false && validarTamañoDuplicado(editProducto.txt_celular, editProducto.error_celular, 9, "celular", "A") != false
//                && validarCbx(editProducto.cbx_rol, editProducto.error_rol) != false && validarCbx(editProducto.cbx_estado, editProducto.error_estado) != false) {
//            usuario.setNombre(editProducto.txt_nombre.getText());
//            usuario.setApellidoP(editProducto.txt_paterno.getText());
//            usuario.setApellidoM(editProducto.txt_materno.getText());
//            usuario.setDni(editProducto.txt_dni.getText());
//            usuario.setCelular(editProducto.txt_celular.getText());
//            usuario.setRol(editProducto.cbx_rol.getSelectedItem().toString());
//            usuario.setEstado(editProducto.cbx_estado.getSelectedItem().toString());
//            usuario.setId(Integer.parseInt(editProducto.lbl_id.getText()));
//            usuarioDAO.actualizarUsuario(usuario);
//            JOptionPane.showMessageDialog(null, "actualizado");
//            limpiarCampos();
//            ocultarErrores();
//            limpiarTablaUsusario();
//            listarUsuario(productoTabla);
//        }
//    }
}
