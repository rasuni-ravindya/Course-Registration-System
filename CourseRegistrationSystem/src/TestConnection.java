/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rasuni
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/crs_db";
        String user = "root"; // Change if needed
        String password = "1234"; // Change if needed

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("✅ MySQL Connection Successful!");
        } catch (SQLException e) {
            System.out.println("❌ Connection Failed: " + e.getMessage());
        }
    }
}
