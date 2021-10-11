/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import static datos.DbConexion.getConnection;
import dominio.Usuarios;
import java.sql.*;
import java.util.*;

/**
 *
 * @author Joe
 */
public class UsuariosDB {

    private static final String SQL_SELECT = "select * from tb_usuarios";
    private static final String SQL_UPDATE = "update tb_usuarios set user= ?,password=?,correo=? where id=?";
    private static final String SQL_INSERT = "insert into tb_usuarios(user,password,correo) values (?,?,?)";
    private static final String SQL_DELETE = "delete from tb_usuarios where id=?";

    public List<Usuarios> select() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuarios usuario = null;
        List<Usuarios> usuarios = new ArrayList<Usuarios>();

        try {
            conn = DbConexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String user = rs.getString("user");
                String password = rs.getString("password");

                usuario = new Usuarios();
                usuario.setUser(user);
                usuario.setPassword(password);
                usuario.setId(id);

                usuarios.add(usuario);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            DbConexion.close(rs);
            DbConexion.close(stmt);
            DbConexion.close(conn);
        }
        return usuarios;
    }

    public boolean select_validacion(Usuarios datos) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuarios usuario = new Usuarios();
        boolean tiene_permiso = false;

        try {
            String condicion = SQL_SELECT + " where user='" + datos.getUser() + "' and password ='" + datos.getPassword() + "'";

            conn = DbConexion.getConnection();
            stmt = conn.prepareStatement(condicion);
            rs = stmt.executeQuery();
            System.out.println("condicion = " + condicion);

            while (rs.next()) {
                tiene_permiso = true;
                int id = rs.getInt("id");
                String user = rs.getString("user");
                String password = rs.getString("password");

                usuario = new Usuarios();
                usuario.setUser(user);
                usuario.setPassword(password);
                usuario.setId(id);

            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            DbConexion.close(rs);
            DbConexion.close(stmt);
            DbConexion.close(conn);
        }
        return tiene_permiso;
    }

    public int insert(Usuarios usuario) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = DbConexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, usuario.getUser());
            stmt.setString(2, usuario.getPassword());
            stmt.setString(3, usuario.getCorreo());
            System.out.println("Ejecutando cuerito=" + SQL_INSERT);

            System.out.println("Se procesaron " + rows);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            DbConexion.close(stmt);
            DbConexion.close(conn);
        }
        return rows;
    }

    public boolean insertar(Usuarios usuario) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = DbConexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, usuario.getUser());
            stmt.setString(2, usuario.getPassword());
            stmt.setString(3, usuario.getCorreo());
            stmt.execute();
        
            return true;

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } 
        
        return false;
    }

    public int actualizar(Usuarios usuario) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = DbConexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, usuario.getUser());
            stmt.setString(2, usuario.getPassword());
            stmt.setInt(3, usuario.getId());
            System.out.println("Ejecutando cuerito=" + SQL_UPDATE);

            rows = stmt.executeUpdate();
            System.out.println("Se procesaron " + rows);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            DbConexion.close(stmt);
            DbConexion.close(conn);
        }
        return rows;
    }

    public int borrar(Usuarios usuario) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = DbConexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, usuario.getId());
            System.out.println("Ejecutando cuerito=" + SQL_DELETE);

            rows = stmt.executeUpdate();
            System.out.println("Se procesaron " + rows);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            DbConexion.close(stmt);
            DbConexion.close(conn);
        }
        return rows;
    }
}
