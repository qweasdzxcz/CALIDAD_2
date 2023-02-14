
package Modelo;

import Utilidades.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class DetalleEntradaDAO {
    
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();

    public int grabarDetallesEntrada(DetalleEntrada det) {
        int respuesta = 0;
        String sql = "insert into detalleentrada(id_entrada,id_producto,cantidad) values (?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, det.getId_entrada());
            ps.setInt(2, det.getId_producto());
            ps.setInt(3, det.getCantidad());
            ps.execute();
            respuesta = 1;
        } catch (SQLException e) {
            System.out.println(e.toString());
            respuesta = 0;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
                respuesta = 0;
            }
        }
        return respuesta;
    }
//pendiente uso
//    public List listarDetalles(int id_venta) {
//        String sql = "select dv.id_producto,p.nombre,dv.precioVenta,dv.cantidad from detalles_venta dv inner join producto p on dv.id_producto = p.id_producto where dv.id_venta=" + id_venta;
//        List<DetalleVenta> lista = new ArrayList<>();
//        try {
//            con = cn.getConnection();
//            ps = con.prepareStatement(sql);
//            rs = ps.executeQuery();
//            while (rs.next()) {
//                DetalleVenta vent = new DetalleVenta();
//               // vent.setId_venta(rs.getInt("id_venta"));
//                //vent.setId_usuario(rs.getInt("id_usuario"));
//                //vent.setId_cliente(rs.getInt("id_cliente"));
//                vent.setId_producto(rs.getInt("id_producto"));
//                vent.setNom_producto(rs.getString("nombre"));
//                vent.setPrecioVenta(rs.getDouble("precioVenta"));
//                vent.setCantidad(rs.getInt("cantidad"));
//                lista.add(vent);
//            }
//        } catch (SQLException e) {
//            System.out.println(e.toString()+"\nla ptmr");
//        }
//        return lista;
//    }
    
    
}
