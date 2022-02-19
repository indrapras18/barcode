/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class koneksi {

    private Connection koneksi;

    public Connection connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Koneksi berhasil");
        } catch (ClassNotFoundException ex) {
            System.out.println("koneksi gagal" + ex);
        }
        
        String url = "jdbc:mysql://localhost:3306/db_barcode";
        try {
            koneksi = DriverManager.getConnection(url,"root","");
            System.out.println("Berhasil Tersambung!");
        } catch (SQLException e) {
            System.out.println("Koneksi Gagal Tersambung!");
        }
        return koneksi;
    }
}
