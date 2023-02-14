package Modelo;

import Utilidades.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EntradaDAO {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();
    int respuesta;
    boolean rpta;

    public int grabarEntrada(Entrada en) {
        int rpta = 0;
        String sql = "insert into entrada(id_usuario) values (?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, en.getId_usuario());

            ps.execute();
            rpta = 1;
        } catch (SQLException e) {
            System.out.println(e.toString());
            rpta = 0;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
                rpta = 0;
            }
        }
        return rpta;
    }

    public int ID_entrada() {
        int idEntrada = 0;
        String sql = "select max(id_entrada) from entrada";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                idEntrada = rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return idEntrada;
    }

    public boolean actualizarStock(int cantidad, int id) {
        String sql = "UPDATE producto set cantidad=? where id_producto=?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, cantidad);
            ps.setInt(2, id);
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    }
    //pendiente
//    public List listarVenta() {
//        String sql = "select v.id_venta,c.nombre_cli,c.apellidoP,c.apellidoM,u.nombre,v.monto,v.fechaVenta from nueva_venta v inner join cliente c on v.id_cliente=c.id_cliente inner join usuario u on v.id_usuario=u.id_usuario;";
//        List<Venta> lista = new ArrayList<>();
//        try {
//            con = cn.getConnection();
//            ps = con.prepareStatement(sql);
//            rs = ps.executeQuery();
//            while (rs.next()) {
//                Venta vent = new Venta();
//                vent.setId_venta(rs.getInt("id_venta"));
//                //vent.setId_usuario(rs.getInt("id_usuario"));
//                //vent.setId_cliente(rs.getInt("id_cliente"));
//                vent.setNombre_Usuario(rs.getString("nombre"));
//                vent.setNombre_cliente(rs.getString("nombre_cli"));
//                vent.setP_cliente(rs.getString("apellidoP"));
//                vent.setM_cliente(rs.getString("apellidoM"));
//                vent.setFecha(rs.getString("fechaVenta"));
//                vent.setMonto(rs.getDouble("monto"));
//                lista.add(vent);
//            }
//        } catch (Exception e) {
//            System.out.println(e.toString());
//        }
//        return lista;
//    }
}
