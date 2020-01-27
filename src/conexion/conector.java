package conexion;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SISTEMAS
 */
public class conector {

    Connection conexion = null;
    String url = "jdbc:mysql://localhost:3306/Ejercicio1";
    String usuario = "root";
    String password = "1234";

    public conector() {
        try {
            conexion = (Connection) DriverManager.getConnection(url, usuario, password);
            if (conexion == null) {
                System.out.println("Se conecto");
            } else {
                System.err.println("No se conecto");

            }

        } catch (SQLException ex) {
            System.err.println("Error Conexion");

            Logger.getLogger(conector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Connection getConexion() {
        return conexion;
    }

    public void Desconectarse() {
        conexion = null;
    }
}
