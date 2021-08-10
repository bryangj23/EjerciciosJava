package datos;

import domain.Usuario;
import java.sql.*;
import java.util.*;

public class UsuarioDAO {

    private final String SQL_SELECT = "SELECT * FROM usuario";
    private final String SQL_INSERT = "INSERT INTO usuario(usuario, password) VALUES(?, ?)";
    private final String SQL_UPDATE = "UPDATE usuario SET usuario = ?, password = ? WHERE id_usuario = ?";
    private final String SQL_DELETE = "DELETE FROM usuario WHERE id_usuario = ?";

    public List<Usuario> selcetUsuarios() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet result = null;
        List<Usuario> usuarios = new ArrayList<>();
        Usuario usuario = null;

        try {
            conn = Conexion.getConexion();
            stmt = conn.prepareStatement(SQL_SELECT);
            result = stmt.executeQuery();

            while (result.next()) {
                usuario = new Usuario(result.getInt("id_usuario"), result.getString("usuario"), result.getString("password"));
                usuarios.add(usuario);
            }
            System.out.println("\nEjecutando query: "+SQL_SELECT);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {

            try {

                Conexion.close(result);
                Conexion.close(stmt);
                Conexion.close(conn);

            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return usuarios;
    }

    public int insertUsuario(Usuario usuario) {

        Connection conn = null;
        PreparedStatement stmt = null;
        int registro = 0;

        try {
            conn = Conexion.getConexion();
            stmt = conn.prepareStatement(SQL_INSERT);

            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, usuario.getPassword());

            registro = stmt.executeUpdate();
            System.out.println("Ejecutando query: "+SQL_INSERT);
            System.out.println("Registros afectados: "+registro);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }

        return registro;
    }

    public int updateUsuario(Usuario usuario) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registro = 0;

        try {
            conn = Conexion.getConexion();
            stmt = conn.prepareStatement(SQL_UPDATE);

            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, usuario.getPassword());
            stmt.setInt(3, usuario.getIdUsuario());

            registro = stmt.executeUpdate();
            System.out.println("Ejecutando query: "+SQL_UPDATE);
            System.out.println("Registros afectados: "+registro);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registro;
    }

    public int deleteUsuario(Usuario usuario) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registro = 0;

        try {
            conn = Conexion.getConexion();
            stmt = conn.prepareStatement(SQL_DELETE);

            stmt.setInt(1, usuario.getIdUsuario());

            registro = stmt.executeUpdate();
            System.out.println("Ejecutando query: "+SQL_DELETE);
            System.out.println("Registros afectados: "+registro);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }

        }
        return registro;
    }

}
