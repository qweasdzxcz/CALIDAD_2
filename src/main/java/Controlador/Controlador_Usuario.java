package Controlador;

import Modelo.Usuario;
import Modelo.UsuarioDAO;
import Vista.Usuario.formUsuario;
import static Vista.Usuario.formUsuario.*;
import static Vista.Principal.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import Utilidades.Encriptar;
import Vista.Principal;
import Vista.Usuario.editUsuario;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Controlador_Usuario implements ActionListener {

    private final Principal principal;
    private final formUsuario formUsuario;
    private final editUsuario editUsuario;
    Usuario usuario = new Usuario();
    UsuarioDAO usuarioDAO = new UsuarioDAO();
    DefaultTableModel tablaU = new DefaultTableModel();

    public Controlador_Usuario(Principal principal, formUsuario formUsuario, editUsuario editUsuario) {
        this.principal = principal;
        this.formUsuario = formUsuario;
        this.editUsuario = editUsuario;
        this.formUsuario.btn_registrar.addActionListener(this);
        this.principal.btn_usuarios.addActionListener(this);
        this.principal.btn_nuevoUsuario.addActionListener(this);
        this.editUsuario.btn_actualizar.addActionListener(this);
        this.principal.btn_editarUsuario.addActionListener(this);
        this.principal.btn_eliminarUsuario.addActionListener(this);
        buscarUsuario();
        ocultarErrores();
        limpiarCampos();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == formUsuario.btn_registrar) {
            registrarUsuario();
        }
        if (e.getSource() == principal.btn_nuevoUsuario) {
            formUsuario.setVisible(true);
            ocultarErrores();
            limpiarCampos();
        }
        if (e.getSource() == principal.btn_usuarios) {
            principal.tabed.setSelectedComponent(panel_usuarios);
            limpiarTablaUsusario();
            listarUsuario(principal.usuarioTabla);
        }
        if (e.getSource() == editUsuario.btn_actualizar) {
            actualizarUsuario();
        }
        if (e.getSource() == principal.btn_editarUsuario) {
            editarUsuario();
            ocultarErrores();
        }
        if (e.getSource() == principal.btn_eliminarUsuario) {
            eliminarUsuario();
        }
    }

    public Icon icono(String ruta, int ancho, int alto) {
        //ImageIcon imagen = new ImageIcon(ruta);
        Icon img = new ImageIcon(new ImageIcon(getClass().getResource(ruta)).getImage().getScaledInstance(ancho, alto, WIDTH));
        return img;
    }

    public void ocultarErrores() {
        error_nombre.setVisible(false);
        error_paterno.setVisible(false);
        error_materno.setVisible(false);
        error_dni.setVisible(false);
        error_celular.setVisible(false);
        error_username.setVisible(false);
        error_password.setVisible(false);
        error_rol.setVisible(false);
        editUsuario.error_nombre.setVisible(false);
        editUsuario.error_paterno.setVisible(false);
        editUsuario.error_materno.setVisible(false);
        editUsuario.error_dni.setVisible(false);
        editUsuario.error_celular.setVisible(false);
        editUsuario.error_rol.setVisible(false);
        editUsuario.error_estado.setVisible(false);
        editUsuario.lbl_id.setVisible(false);
    }

    public void limpiarCampos() {
        txt_nombre.setText("");
        txt_paterno.setText("");
        txt_materno.setText("");
        txt_dni.setText("");
        txt_celular.setText("");
        txt_username.setText("");
        txt_password.setText("");
        cbx_rol.setSelectedIndex(-1);
        editUsuario.txt_nombre.setText("");
        editUsuario.txt_paterno.setText("");
        editUsuario.txt_materno.setText("");
        editUsuario.txt_dni.setText("");
        editUsuario.txt_celular.setText("");
        editUsuario.cbx_rol.setSelectedIndex(-1);
        editUsuario.cbx_estado.setSelectedIndex(-1);
        editUsuario.lbl_id.setText("");
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

    public boolean validarTama??oDuplicado(JTextField txt, JLabel lbl, int tama??o, String nombreColumna, String opcion) {
        if (txt.getText().isEmpty() || txt.getText().isBlank()) {
            lbl.setVisible(true);
            lbl.setText("Campo obligatorio");
            return false;
        }

        if (txt.getText().length() < tama??o) {
            lbl.setVisible(true);
            lbl.setText("El campo debe contener " + tama??o + " digitos");
            return false;
        }

        switch (nombreColumna) {
            case "dni" -> {
                int v = usuarioDAO.validarDni(txt.getText());
                if (v > 0 && opcion.equals("R")) {
                    lbl.setVisible(true);
                    lbl.setText("Esta registrado, intente con otro");
                    return false;
                }
                return true;
            }
            case "celular" -> {
                int v = usuarioDAO.validarCelular(txt.getText());
                if (v > 0 && opcion.equals("R")) {
                    lbl.setVisible(true);
                    lbl.setText("Esta registrado, intente con otro");
                    return false;
                }
                return true;
            }
        }
        lbl.setVisible(false);
        return true;
    }

    public boolean validarUsername(JTextField txt, JLabel lbl, int tama??o, String opcion) {
        if (txt.getText().isEmpty() || txt.getText().isBlank()) {
            lbl.setVisible(true);
            lbl.setText("Campo obligatorio");
            return false;
        }
        if (txt.getText().length() < tama??o) {
            lbl.setVisible(true);
            lbl.setText("Debe contener minimo " + tama??o + " caracteres");
            return false;
        }
        int v = usuarioDAO.validarUsername(txt.getText());
        if (v > 0 && opcion.equals("R")) {
            lbl.setVisible(true);
            lbl.setText("Esta registrado, intente con otro");

            return false;
        }

        lbl.setVisible(false);
        return true;
    }

    public boolean validarCbx(JComboBox cbx, JLabel lbl) {
        if (cbx.getSelectedIndex() < 0) {
            lbl.setVisible(true);
            lbl.setText("Seleccione un rol");
            return false;
        }
        lbl.setVisible(false);
        return true;
    }

  public void registrarUsuario() {
        ocultarErrores();
        if (validar(txt_nombre, error_nombre) != false && validar(txt_paterno, error_paterno) != false && validar(txt_materno, error_materno) != false
                && validarTama??oDuplicado(txt_dni, error_dni, 8, "dni", "R") != false && validarTama??oDuplicado(txt_celular, error_celular, 9, "celular", "R") != false
                && validarUsername(txt_username, error_username, 8, "R") != false && validar(txt_password, error_password) != false
                && validarCbx(cbx_rol, error_rol) != false) {
            String encriptado = Encriptar.sha1(txt_password.getText());
            usuario.setNombre(txt_nombre.getText());
            usuario.setApellidoP(txt_paterno.getText());
            usuario.setApellidoM(txt_materno.getText());
            usuario.setDni(txt_dni.getText());
            usuario.setCelular(txt_celular.getText());
            usuario.setUsername(txt_username.getText());
            usuario.setPassword(encriptado);
            usuario.setRol(cbx_rol.getSelectedItem().toString());
            //JOptionPane.showMessageDialog(null,"pass : "+txt_password.getText()+"\nencriptado : "+encriptado);
            int rpta = usuarioDAO.agregarUsuario(usuario);
            if (rpta == 0) {
                JOptionPane.showMessageDialog(principal, "Ocurrio un error, no se pudo registrar", "MENSAJE", JOptionPane.PLAIN_MESSAGE, icono("/img/error.png", 50, 50));
            } else {
                limpiarCampos();
                ocultarErrores();
                limpiarTablaUsusario();
                listarUsuario(usuarioTabla);
                formUsuario.dispose();
                JOptionPane.showMessageDialog(principal, "USUARIO REGISTRADO", "MENSAJE", JOptionPane.PLAIN_MESSAGE, icono("/img/ok.png", 50, 50));
            }
        }
    }

    public void listarUsuario(JTable tabla) {
        List<Usuario> listaU = usuarioDAO.listarUsuario();
        tablaU = (DefaultTableModel) tabla.getModel();
        Object[] obj = new Object[9];
        for (int i = 0; i < listaU.size(); i++) {
            obj[0] = listaU.get(i).getId();
            obj[1] = listaU.get(i).getNombre();
            obj[2] = listaU.get(i).getApellidoP();
            obj[3] = listaU.get(i).getApellidoM();
            obj[4] = listaU.get(i).getDni();
            obj[5] = listaU.get(i).getCelular();
            obj[6] = listaU.get(i).getUsername();
            obj[7] = listaU.get(i).getRol();
            obj[8] = listaU.get(i).getEstado();
            tablaU.addRow(obj);
            //System.out.println(obj[0] + "\n" + obj[1] + "\n" + obj[2] + "\n" + obj[3] + "\n" + obj[4] + "\n" + obj[5]+ "\n" + obj[6]+ "\n" + obj[7]+ "\n" + obj[8]+ "\n");
        }
        tabla.setModel(tablaU);
    }

    public void limpiarTablaUsusario() {
        for (int i = 0; i < tablaU.getRowCount(); i++) {
            tablaU.removeRow(i);
            i = i - 1;
        }
    }

    public void eliminarUsuario() {
        int fila = principal.usuarioTabla.getSelectedRow();
        int pregunta = JOptionPane.showConfirmDialog(null, "DESEA ELIMINAR ?");
        if (pregunta == 0) {
            int id = Integer.parseInt(principal.usuarioTabla.getValueAt(fila, 0).toString());
            int rpta = usuarioDAO.eliminarUsuario(id);
            if (rpta == 0) {
                JOptionPane.showMessageDialog(principal, "No se pudo eliminar", "MENSAJE", JOptionPane.PLAIN_MESSAGE, icono("/img/error.png", 50, 50));
            } else {
                limpiarTablaUsusario();
                listarUsuario(usuarioTabla);
                JOptionPane.showMessageDialog(principal, "Usuario Eliminado", "MENSAJE", JOptionPane.PLAIN_MESSAGE, icono("/img/ok.png", 50, 50));
            }

        }
    }

    public void editarUsuario() {

        int fila = principal.usuarioTabla.getSelectedRow();
        editUsuario.lbl_id.setText(usuarioTabla.getValueAt(fila, 0).toString());
        editUsuario.txt_nombre.setText(usuarioTabla.getValueAt(fila, 1).toString());
        editUsuario.txt_paterno.setText(usuarioTabla.getValueAt(fila, 2).toString());
        editUsuario.txt_materno.setText(usuarioTabla.getValueAt(fila, 3).toString());
        editUsuario.txt_dni.setText(usuarioTabla.getValueAt(fila, 4).toString());
        editUsuario.txt_celular.setText(usuarioTabla.getValueAt(fila, 5).toString());
        editUsuario.cbx_rol.setSelectedItem(usuarioTabla.getValueAt(fila, 7).toString());
        editUsuario.cbx_estado.setSelectedItem(usuarioTabla.getValueAt(fila, 8).toString());
        editUsuario.setVisible(true);

    }

   public void actualizarUsuario() {
        if (validar(editUsuario.txt_nombre, editUsuario.error_nombre) != false && validar(editUsuario.txt_paterno, editUsuario.error_paterno) != false && validar(editUsuario.txt_materno, editUsuario.error_materno) != false
                && validarTama??oDuplicado(editUsuario.txt_dni, editUsuario.error_dni, 8, "dni", "A") != false && validarTama??oDuplicado(editUsuario.txt_celular, editUsuario.error_celular, 9, "celular", "A") != false
                && validarCbx(editUsuario.cbx_rol, editUsuario.error_rol) != false && validarCbx(editUsuario.cbx_estado, editUsuario.error_estado) != false) {
            usuario.setNombre(editUsuario.txt_nombre.getText());
            usuario.setApellidoP(editUsuario.txt_paterno.getText());
            usuario.setApellidoM(editUsuario.txt_materno.getText());
            usuario.setDni(editUsuario.txt_dni.getText());
            usuario.setCelular(editUsuario.txt_celular.getText());
            usuario.setRol(editUsuario.cbx_rol.getSelectedItem().toString());
            usuario.setEstado(editUsuario.cbx_estado.getSelectedItem().toString());
            usuario.setId(Integer.parseInt(editUsuario.lbl_id.getText()));
            int rpta = usuarioDAO.actualizarUsuario(usuario);
            if (rpta == 0) {
                JOptionPane.showMessageDialog(principal, "Ocurrio un error, no se pudo actualizar", "MENSAJE", JOptionPane.PLAIN_MESSAGE, icono("/img/error.png", 50, 50));
            } else {
                limpiarCampos();
                ocultarErrores();
                limpiarTablaUsusario();
                listarUsuario(usuarioTabla);
                editUsuario.dispose();
                JOptionPane.showMessageDialog(principal, "USUARIO ACTUALIZADO", "MENSAJE", JOptionPane.PLAIN_MESSAGE, icono("/img/ok.png", 50, 50));
            }
        }
    }

    public void tablaDatosUsuario(JTable tabla) {
        limpiarTablaUsusario();
        String valor = txt_buscarUsuario.getText();
        List<Usuario> listaU = usuarioDAO.buscarUsuario_TXT(valor);
        //System.out.println("filtro : " + filtro + "\n" + "valor : " + a);
        tablaU = (DefaultTableModel) tabla.getModel();
        Object[] obj = new Object[9];
        for (int i = 0; i < listaU.size(); i++) {
            obj[0] = listaU.get(i).getId();
            obj[1] = listaU.get(i).getNombre();
            obj[2] = listaU.get(i).getApellidoP();
            obj[3] = listaU.get(i).getApellidoM();
            obj[4] = listaU.get(i).getDni();
            obj[5] = listaU.get(i).getCelular();
            obj[6] = listaU.get(i).getUsername();
            obj[7] = listaU.get(i).getRol();
            obj[8] = listaU.get(i).getEstado();
            tablaU.addRow(obj);
            //System.out.println(obj[0] + "\n" + obj[1] + "\n" + obj[2] + "\n" + obj[3] + "\n" + obj[4] + "\n" + obj[5]+ "\n" + obj[6]+ "\n" + obj[7]+ "\n" + obj[8]+ "\n");
        }
        tabla.setModel(tablaU);
    }

    public void buscarUsuario() {
        //BusquedaCliente busC = new BusquedaCliente(principal, true);
        KeyListener evento = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                tablaDatosUsuario(usuarioTabla);
                //tablaDatosCliente(busC.busquedaClienteTabla);
            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        };
        txt_buscarUsuario.addKeyListener(evento);
        System.out.println(txt_buscarUsuario.getText());
        //busC.txt_valorCli.addKeyListener(evento);
    }
}

//    public boolean validarPassword(JTextField txt_uno, JTextField txt_dos, JLabel lbl_uno, JLabel lbl_dos) {
//        validar(txt_uno, lbl_uno);
//        validar(txt_dos, lbl_dos);
//        if (!txt_uno.getText().equals(txt_dos.getText())) {
//            lbl_dos.setVisible(true);
//            lbl_dos.setText("Los campos no coindicen");
//            return false;
//        }
//        lbl_uno.setVisible(false);
//        lbl_dos.setVisible(false);
//        return true;
//    }

