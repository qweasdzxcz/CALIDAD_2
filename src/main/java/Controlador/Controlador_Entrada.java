package Controlador;

import Modelo.DetalleEntrada;
import Modelo.DetalleEntradaDAO;
import Modelo.Entrada;
import Modelo.EntradaDAO;
import Modelo.Producto;
import Modelo.ProductoDAO;
import Vista.Entrada.BusquedaProductoEntrada;
import Vista.Principal;
import static Vista.Principal.nuevaEntradaTabla;
import static Vista.Principal.panel_entradas;
import Vista.Ventas.BusquedaProducto;
import static Vista.Entrada.BusquedaProductoEntrada.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Controlador_Entrada implements ActionListener {

    private Principal principal;
    private BusquedaProductoEntrada busquedaPro;

    Producto producto = new Producto();
    ProductoDAO productoDAO = new ProductoDAO();

    Entrada entrada = new Entrada();
    EntradaDAO entradaDAO = new EntradaDAO();

    DetalleEntrada detalleE = new DetalleEntrada();
    DetalleEntradaDAO detalleEDAO = new DetalleEntradaDAO();

    DefaultTableModel tablaNuevaEntrada = new DefaultTableModel();
    DefaultTableModel tablaBusquedaProducto = new DefaultTableModel();
    //DefaultTableModel tablaBC = new DefaultTableModel();
    int objEntrada = 0;

    public Controlador_Entrada(Principal principal, BusquedaProductoEntrada busquedaPro) {
        this.principal = principal;
        this.busquedaPro = busquedaPro;
        principal.btn_entradas.addActionListener(this);
        principal.btn_buscarProductoEntrada.addActionListener(this);

        principal.btn_generarEntrada.addActionListener(this);
        principal.btn_agregarTablaEntrada.addActionListener(this);
        busquedaPro.btn_agregarEntrada.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == principal.btn_entradas) {
            principal.tabed.setSelectedComponent(panel_entradas);
            //listarProducto(principal.productoTabla);
        }
        if (e.getSource() == principal.btn_buscarProductoEntrada) {
            busquedaPro.setVisible(true);
        }
        if (e.getSource() == busquedaPro.btn_agregarEntrada) {
            pasarDatosProducto();
        }
        if (e.getSource() == principal.btn_agregarTablaEntrada) {
            agregarTabla();
        }
        if (e.getSource() == principal.btn_generarEntrada) {
            generarEntrada();
            generarDetallesEntarda();
            actualizarStock();
            limpiarTablaPedido();
            limpiarCamposEntrada();
            JOptionPane.showMessageDialog(null,"Entrada Regsitrada");
        }
//        if (e.getSource() == busquedaPro.btn_agregar) {
//            pasarDatosProducto();
//        }
//        if (e.getSource() == busquedaCli.btn_agregarCli) {
//            pasarDatosCliente();
//        }
//        if (e.getSource() == principal.btn_agregarTabla) {
//            agregarTabla();
//        }
    }

    public void limpiarTablaPedido() {
        for (int i = 0; i < tablaNuevaEntrada.getRowCount(); i++) {
            tablaNuevaEntrada.removeRow(i);
            i = i - 1;
        }
    }
    
    public void limpiarCamposEntrada() {
        Principal.lbl_nombreEntrada.setText(null);
        Principal.lbl_idProductoEntrada.setText(null);
        Principal.txt_cantidadEntrada.setText(null);
        Principal.lbl_stockEntrada.setText(null);
    }

    public void pasarDatosProducto() {
        int fila = busquedaPro.busquedaProductoTablaEntrada.getSelectedRow();
        //System.out.println("funcoiona" + "\nfila :" + fila);
        principal.lbl_idProductoEntrada.setText(busquedaProductoTablaEntrada.getValueAt(fila, 0).toString());
        principal.lbl_nombreEntrada.setText(busquedaProductoTablaEntrada.getValueAt(fila, 1).toString());

        principal.lbl_stockEntrada.setText(busquedaProductoTablaEntrada.getValueAt(fila, 4).toString());
        busquedaPro.setVisible(false);
        principal.txt_cantidad.requestFocus();
    }

    public void agregarTabla() {
        if (!"".equals(Principal.lbl_nombreEntrada.getText()) && !"".equals(Principal.lbl_stockEntrada.getText())) {
            String idV = Principal.lbl_idProductoEntrada.getText();
            String nombreV = Principal.lbl_nombreEntrada.getText();
            int cantidadV = Integer.parseInt(Principal.txt_cantidadEntrada.getText());
            int stockV = Integer.parseInt(Principal.lbl_stockEntrada.getText());

            if (!"".equals(Principal.txt_cantidadEntrada.getText())) {
                Principal.txt_cantidadEntrada.setRequestFocusEnabled(true);

                objEntrada++;
                tablaNuevaEntrada = (DefaultTableModel) nuevaEntradaTabla.getModel();
                //no se repitan productos
                for (int i = 0; i < nuevaEntradaTabla.getRowCount(); i++) {
                    if (nuevaEntradaTabla.getValueAt(i, 1).equals(Principal.lbl_nombreEntrada.getText())) {
                        JOptionPane.showMessageDialog(null, "EL PRODUCTO SE REPITE, MODIFIQUE LA CANTIDAD");
                        return;
                    }
                }
                ArrayList listaVenta = new ArrayList();
                listaVenta.add(objEntrada);
                listaVenta.add(idV);
                listaVenta.add(nombreV);
                //listaVenta.add(precioV);
                listaVenta.add(cantidadV);
                // listaVenta.add(total);

                Object[] NE = new Object[4];
                NE[0] = listaVenta.get(1);
                NE[1] = listaVenta.get(0);
                NE[2] = listaVenta.get(2);
                //NE[3] = listaVenta.get(3);
                NE[3] = listaVenta.get(3);
                // NE[5] = listaVenta.get(5);

                tablaNuevaEntrada.addRow(NE);
                nuevaEntradaTabla.setModel(tablaNuevaEntrada);
                limpiarCamposEntrada();
                System.out.println("tabla llenada ");

//else {
//                    JOptionPane.showMessageDialog(null, "No disponible reabastecer");
//                }
            } else {
                JOptionPane.showConfirmDialog(null, "Ingrese la cantidad");

            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un producto");
        }
    }

    public void generarEntrada() {
        int id_user = Integer.parseInt(principal.lbl_idUsuario.getText());
        entrada.setId_usuario(id_user);

        int rpta = entradaDAO.grabarEntrada(entrada);
        if (rpta == 0) {
            JOptionPane.showMessageDialog(null, "no registrado");
        } else {
            //JOptionPane.showMessageDialog(null, "ENTRADA REGISTRADA CON EXITO");
        }
    }

    public void generarDetallesEntarda() {
        for (int i = 0; i < nuevaEntradaTabla.getRowCount(); i++) {
            int id_pro = Integer.parseInt(nuevaEntradaTabla.getValueAt(i, 0).toString());
            
            int cantidad = Integer.parseInt(nuevaEntradaTabla.getValueAt(i, 3).toString());
            int idEntrada = entradaDAO.ID_entrada();
            //System.out.println("PRODUCTO " + i + "------\nidEntrada: " + idEntrada + "\nid_pro : " + id_pro + "\ncantidad :" + cantidad );
            detalleE.setId_entrada(idEntrada);
            detalleE.setId_producto(id_pro);
            detalleE.setCantidad(cantidad);
            int rpta = detalleEDAO.grabarDetallesEntrada(detalleE);
            if (rpta == 0) {
                JOptionPane.showMessageDialog(null, "No se registraron los detalles");
            }
        }
    }

    public void actualizarStock() {
        for (int i = 0; i < nuevaEntradaTabla.getRowCount(); i++) {
            int id_pro = Integer.parseInt(nuevaEntradaTabla.getValueAt(i, 0).toString());
            int cantidadIngresada = Integer.parseInt(nuevaEntradaTabla.getValueAt(i, 3).toString());
            producto = productoDAO.buscarProducto_ID(id_pro);
            int cantidadActual = producto.getCantidad() + cantidadIngresada;
            entradaDAO.actualizarStock(cantidadActual, id_pro);
        }
    }
}
