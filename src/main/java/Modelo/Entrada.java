package Modelo;

public class Entrada {

    private int id_entrada;
    private String fecha;
    private int id_usuario;
    private String username;

    public Entrada() {
    }

    public Entrada(int id_entrada, String fecha, int id_usuario, String username) {
        this.id_entrada = id_entrada;
        this.fecha = fecha;
        this.id_usuario = id_usuario;
        this.username = username;
    }

    public int getId_entrada() {
        return id_entrada;
    }

    public void setId_entrada(int id_entrada) {
        this.id_entrada = id_entrada;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    
}
