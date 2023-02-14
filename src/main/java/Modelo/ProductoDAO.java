package Modelo;

import Utilidades.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAO {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();
    int respuesta;

    public int agregarProducto(Producto pro) {
        String sql = "insert into producto(nombre,descripcion,cantidad,precio,id_categoria) values(?,?,?,?,?);";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);

            ps.setString(1, pro.getNombre());
            ps.setString(2, pro.getDescripcion());
            ps.setInt(3, pro.getCantidad());
            ps.setDouble(4, pro.getPrecio());
            ps.setInt(5, pro.getId_categoria());

            ps.executeUpdate();

        } catch (Exception e) {
        }
        return respuesta;
    }

    public List listarProducto() {
        String sql = "select p.id_producto,p.nombre,p.descripcion,p.cantidad,p.precio,c.nombre_cat,p.estado from producto p inner join categoria c on p.id_categoria=c.id_categoria";
        List<Producto> lista = new ArrayList<>();
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Producto pro = new Producto();

                pro.setId(rs.getInt("id_producto"));
                pro.setNombre(rs.getString("nombre"));
                pro.setDescripcion(rs.getString("descripcion"));
                pro.setNomCategoria(rs.getString("nombre_cat"));
                pro.setPrecio(rs.getDouble("precio"));
                pro.setCantidad(rs.getInt("cantidad"));
                pro.setEstado(rs.getString("estado"));
                lista.add(pro);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return lista;
    }

    public boolean eliminarProducto(int id) {
        String sql = "delete from producto where id_producto = ?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    }

    public Producto buscarProducto_ID(int id) {
        Producto p = new Producto();
        String sql = "select * from producto where id_producto=" + id;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                p.setId(rs.getInt(1));
                p.setNombre(rs.getString(2));
                p.setDescripcion(rs.getString(3));
                p.setCantidad(rs.getInt(4));
                p.setPrecio(rs.getDouble(5));

            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return p;
    }
    
    public List buscarProducto(String valor) {      
        String sql = "select p.id_producto,p.nombre,p.descripcion,p.cantidad,p.precio,c.nombre_cat,p.estado from producto p inner join categoria c on p.id_categoria=c.id_categoria where nombre like '%" + valor+"%'";
         List<Producto> lista = new ArrayList<>();
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Producto pro = new Producto();
               pro.setId(rs.getInt("id_producto"));
                pro.setNombre(rs.getString("nombre"));
                pro.setDescripcion(rs.getString("descripcion"));
                pro.setNomCategoria(rs.getString("nombre_cat"));
                pro.setPrecio(rs.getDouble("precio"));
                pro.setCantidad(rs.getInt("cantidad"));
                pro.setEstado(rs.getString("estado"));
                lista.add(pro);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return lista;
    }
    public int actualizarProducto(Producto pr) {
        int rpta = 0;
        String sql = "update producto set nombre=?,descripcion=?,cantidad=?,precio=?,id_categoria=? where id_producto=?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);

            ps.setString(1, pr.getNombre());
            ps.setString(2, pr.getDescripcion());
            ps.setInt(3, pr.getCantidad());
            ps.setDouble(4, pr.getPrecio());
            ps.setInt(5, pr.getId_categoria());
            ps.setInt(6, pr.getId());

            ps.executeUpdate();
            rpta = 1;
        } catch (Exception e) {
            System.out.println(e);
            rpta=0;
        }
        return rpta;
    }

    //BUSCAR PRODCUTO POR ID O NOMBRE SEGUN LO QUE INGRESEMOS
    public List listarProductoBusqueda(String filtro, String valor) {
        String sql = "select * from producto where " + filtro + " like '%" + valor + "%'";
        String sql2 = "select p.id_producto,p.nombre,p.descripcion,p.cantidad,p.precio,c.nombre_cat from producto p inner join categoria c on p.id_categoria=c.id_categoria where " + filtro + " like '%" + valor + "%' and p.estado = 'Activo' ";
        List<Producto> lista = new ArrayList<>();
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql2);
            rs = ps.executeQuery();
            while (rs.next()) {
                Producto pro = new Producto();

                pro.setId(rs.getInt("id_producto"));
                pro.setNombre(rs.getString("nombre"));
                pro.setDescripcion(rs.getString("descripcion"));
                pro.setNomCategoria(rs.getString("nombre_cat"));
                pro.setCantidad(rs.getInt("cantidad"));
                pro.setPrecio(rs.getDouble("precio"));

                lista.add(pro);
            }
        } catch (Exception e) {
        }
        return lista;
    }

}
