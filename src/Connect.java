import java.sql.*;
import javax.swing.*;

public class Connect {
    static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/sms";
    static final String DB_USER = "root";
    static final String DB_PASS = "";
    
    static Connection conn;
    static Statement stm;
    static ResultSet rs;
    
    public static void main(){
        try {
            Class.forName(DB_DRIVER);
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            stm = conn.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error Connection: " + e);
        }
    }
    
    public ResultSet query(String sql){
        try {
            rs = stm.executeQuery(sql);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error Query: " + e);
        }
        return rs;
    }
    
    public int update(String sql) {
        try {
            return stm.executeUpdate(sql);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error Update: " + e);
            return 0;
        }
    }
}
