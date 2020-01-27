/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author epcqa
 */
public class Conexion {

    private final String user = "root";
    private final String password = "1234";
    private final String url = "jdbc:mysql://localhost:3306/Ejercicio1";
    private Connection con = null;

    public Connection getConexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);

        } catch (Exception e) {

        }
        return con;
    }
}
