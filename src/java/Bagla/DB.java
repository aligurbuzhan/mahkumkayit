/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagla;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {

    public static void main(String[] args) {

        try {
            Class.forName("org.postgresql.Driver");
            Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ornek", "postgres", "12345");
            System.out.println("Bağlantı Başarılı.");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
