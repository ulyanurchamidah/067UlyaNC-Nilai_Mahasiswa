package Mahasiswa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

class Koneksi {

    static Connection getKoneksi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    Connection con;
    Statement stm;
    
    public void config(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/test","root","");
            stm = con.createStatement();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "koneksi gagal" +e.getMessage());
        }
    }
}
