// Import library yang diperlukan untuk koneksi database
import java.sql.*;
import javax.swing.*;
// mengimport library, setelah titik terakhir itu class

public class Connect {
    // Konstanta untuk driver database MySQL
    static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";

    // URL database MySQL
    static final String DB_URL = "jdbc:mysql://localhost/sms";

    // Username database MySQL
    static final String DB_USER = "root";

    // Password database MySQL
    static final String DB_PASS = "";
    // Digunakan untuk melakukan koneksi ke database.
    // Merepresentasikan koneksi yang terbuka ke database.
    // Dibutuhkan untuk eksekusi query dan manipulasi data.

    // Variabel untuk koneksi database
    static Connection conn;
    // Digunakan untuk mengeksekusi query SQL.
    // Mengijinkan eksekusi single SQL statement.
    // Digunakan untuk query sederhana tanpa parameter.

    // Variabel untuk statement SQL
    static Statement stm;

    // Variabel untuk hasil query
    static ResultSet rs;

    // Metode untuk melakukan koneksi ke database
    public static void main() {
        try {
            // Memuat driver database MySQL
            Class.forName(DB_DRIVER);

            // Membuat koneksi ke database
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);

            // Membuat statement SQL
            stm = conn.createStatement();
        } catch (Exception e) {
            // Menampilkan pesan error jika koneksi gagal
            JOptionPane.showMessageDialog(null, "Error Connection: " + e);
        }
    }

    // Metode untuk menjalankan query SQL dan mengembalikan hasil query
    public ResultSet query(String sql) {
        try {
            // Menjalankan query SQL dan menyimpan hasilnya ke variabel rs
            rs = stm.executeQuery(sql);
        } catch (SQLException e) {
            // Menampilkan pesan error jika query gagal
            JOptionPane.showMessageDialog(null, "Error Query: " + e);
        }
        return rs;
    }

    // Metode untuk melakukan update data pada database
    public int update(String sql) {
        try {
            // Menjalankan query update dan mengembalikan jumlah baris yang terpengaruh
            return stm.executeUpdate(sql);
        } catch (SQLException e) {
            // Menampilkan pesan error jika update gagal
            JOptionPane.showMessageDialog(null, "Error Update: " + e);

            // Mengembalikan nilai 0 jika terjadi error
            return 0;
        }
    }
}
