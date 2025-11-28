package com.joshua.ordermanagement;

import com.joshua.ordermanagement.util.ConexionDb;

import java.sql.Connection;

public class app {
    public static void main(String[] args) {
        Connection conn = ConexionDb.getConnection();
        System.out.println("Sistema de gestion de pedidos");
    }
}
