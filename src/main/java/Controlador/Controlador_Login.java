package Controlador;

import Modelo.Usuario;
import Modelo.UsuarioDAO;
import Vista.Login;
import static Vista.Login.*;
import Vista.Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextField;
import Utilidades.Encriptar;

import Vista.Producto.editProducto;
import Vista.Producto.formProducto;
import Vista.Usuario.editUsuario;
import Vista.Usuario.formUsuario;

import Vista.Ventas.BusquedaProducto;

import javax.swing.JOptionPane;

public class Controlador_Login implements ActionListener {

    public Login login;
    public Principal principal;
    Usuario usuario = new Usuario();
    UsuarioDAO usuarioDAO = new UsuarioDAO();

    public Controlador_Login(Login login, Principal principal) {
        this.login = login;
        this.principal = principal;
        login.btn_ingresar.addActionListener(this);
        principal.btn_cerrarSesion.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == login.btn_ingresar) {
            ingresar();
        }
        if (e.getSource() == principal.btn_cerrarSesion) {

            ocultarErrores();
            limpiarCampos();
            login.setVisible(true);
            principal.dispose();
        }
    }

    public void ocultarErrores() {
        error_username.setVisible(false);
        error_password.setVisible(false);
        error_ingresar.setVisible(false);
    }

    public void limpiarCampos() {
        login.txt_username.setText(null);
        login.txt_password.setText(null);
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

    public void ingresar() {
        ocultarErrores();
        if (validar(txt_username, error_username) != false && validar(txt_password, error_password)) {
            String encriptado = Encriptar.sha1(txt_password.getText());
            usuario = usuarioDAO.validarIngreso(txt_username.getText(), encriptado);
            if (usuario.getUsername() == null && usuario.getPassword() == null) {
                error_ingresar.setVisible(true);
                error_ingresar.setText("Usuario o password incorrecto");
            } else {
                if (!usuario.getEstado().equals("Activo")) {
                    error_ingresar.setVisible(true);
                    error_ingresar.setText("El usuario se encuentra inactivo");
                } else {
                    Principal p = new Principal();
                    Login l = new Login();
                    formUsuario f = new formUsuario(new javax.swing.JFrame(), true);
                    editUsuario e = new editUsuario(new javax.swing.JFrame(), true);
                    formProducto fp = new formProducto(new javax.swing.JFrame(), true);
                    editProducto ep = new editProducto(new javax.swing.JFrame(), true);
                    BusquedaProducto busProducto = new BusquedaProducto(new javax.swing.JFrame(), true);
                    
                    
                    Controlador_Usuario cu = new Controlador_Usuario(p, f, e);
                    Controlador_Categoria cc = new Controlador_Categoria(p);
                    Controlador_Producto cp = new Controlador_Producto(p, fp, ep);
                    
                    Controlador_Login cll = new Controlador_Login(l, p);
                    cc.ocultarErrores();
                    cu.ocultarErrores();
                    cp.ocultarErrores();
                    //cp.llenarCategoria();
                    if (usuario.getRol().equals("Vendedor")) {
                        p.btn_usuarios.setEnabled(false);                  
                       
                        p.btn_nuevoProducto.setVisible(false);
                        p.panel_cat.setVisible(false);
                        //p.categoriaTabla.setBounds(150, 80, 200,100);
                        
                        p.productoTabla.setComponentPopupMenu(null);
                        p.categoriaTabla.setComponentPopupMenu(null);
                        p.clienteTabla.setComponentPopupMenu(null);
                        
                        p.btn_eliminarCliente.setVisible(false);
                        //p.btn_registrarCategoria.setEnabled(false);
                    }
                    p.setVisible(true);

                    String username = usuario.getUsername();
                    String rol = usuario.getRol();
                    String id = String.valueOf(usuario.getId());
                    Principal.lbl_datos.setText(username + " || " + rol);
                    Principal.lbl_idUsuario.setText(id);
                    login.dispose();
                }
            }
        }
    }

}
