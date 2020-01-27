package conexionbd;

import conexion.Articulos;
import conexion.Conexion;
import conexion.conector;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author SISTEMAS
 */
public class ConexionBd {

    public static void main(String[] args) throws SQLException {

        Conexion stringConexion = new Conexion();
        stringConexion.getConexion();
        Articulos articulo = new Articulos();
        articulo.setId(3);
        articulo.setNombre("Microondas");
        articulo.setDescripcion("Marca Panasonic");
        articulo.setPrecio(150.50);
        String insert = "INSERT INTO Articulos(id,nombre,descripcion,precio) VALUES(?,?,?,?)";

        PreparedStatement ps = stringConexion.getConexion().prepareStatement(insert);
        ps.setString(1, "4");
        ps.setString(2, articulo.getNombre());
        ps.setString(3, articulo.getDescripcion());
        ps.setString(4, "150.50");
        ps.executeUpdate();

    }

}
