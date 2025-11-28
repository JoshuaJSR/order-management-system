package com.joshua.ordermanagement.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDb {
    private static final String URL ="jdbc:mysql://localhost:3306/Ordermanagement?useSSL=false&serverTimezone=UTC";
    private static final String USER ="root";
    private static final String PASSWORD ="Admin2004";


    public static Connection getConnection(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexion exitosa");
        }catch (SQLException e){
            System.out.println("Error al conectar" + e.getMessage());
        }
        return conn;
    }
}
