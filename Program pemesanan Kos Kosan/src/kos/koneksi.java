package kos;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Milan_2201010526
 */
 public class koneksi {
    public static Connection con;
    public static Statement stm;
    public static Connection configDB()throws SQLException{
 try {
 String url
="jdbc:mysql://localhost/db_kosmilan";
 String user="root";
 String pass="";
 Class.forName("com.mysql.cj.jdbc.Driver");
 con =(Connection)
DriverManager.getConnection(url,user,pass);
 stm = con.createStatement();
 System.out.println("koneksi berhasil;");
 } catch (Exception e) {
 System.err.println("koneksi gagal"
+e.getMessage());
 }
return con;
}
}