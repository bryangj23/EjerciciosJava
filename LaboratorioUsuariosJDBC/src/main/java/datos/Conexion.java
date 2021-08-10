package datos;

import java.sql.*;


public class Conexion {
    
    private static final String SQL_URL="jdbc:mysql://localhost:3307/test?useSSL=false&useTimezone=true&serverTimezone=UTC";
    private static final String SQL_USSER="root";
    private static final String SQL_PASS="admin";
    
    public static Connection getConexion() throws SQLException{
        return DriverManager.getConnection(SQL_URL, SQL_USSER, SQL_PASS);
    }
    
    public static void close(Connection conn) throws SQLException{
        conn.close();
    }
    
    public static void close(ResultSet resultado) throws SQLException{
        resultado.close();
    }
    
    public static void close(Statement stmt) throws SQLException{
        stmt.close();
    }
    
    public static void close(PreparedStatement pstmt) throws SQLException{
        pstmt.close();
    }
    
    
}
