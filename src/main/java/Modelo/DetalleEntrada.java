
package Modelo;


public class DetalleEntrada {
    
    private int id_detalleEntrada;
    private int cantidad;
    private int id_entrada;
    private int id_producto;
    private String nomProducto;

    public DetalleEntrada() {
    }

    public DetalleEntrada(int id_detalleEntrada, int cantidad, int id_entrada, int id_producto, String nomProducto) {
        this.id_detalleEntrada = id_detalleEntrada;
        this.cantidad = cantidad;
        this.id_entrada = id_entrada;
        this.id_producto = id_producto;
        this.nomProducto = nomProducto;
    }

    public int getId_detalleEntrada() {
        return id_detalleEntrada;
    }

    public void setId_detalleEntrada(int id_detalleEntrada) {
        this.id_detalleEntrada = id_detalleEntrada;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getId_entrada() {
        return id_entrada;
    }

    public void setId_entrada(int id_entrada) {
        this.id_entrada = id_entrada;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNomProducto() {
        return nomProducto;
    }

    public void setNomProducto(String nomProducto) {
        this.nomProducto = nomProducto;
    }
    
}
