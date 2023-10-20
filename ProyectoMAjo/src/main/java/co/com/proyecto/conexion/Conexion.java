package co.com.proyecto.conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public Connection get_connection() {

            Connection connect = null;

            try {
                connect = DriverManager.getConnection("jdbc:mysql: //Localhost:3306/COLOCARNOMBREDELABASEDEDATOS", "root", "");
                if (connect != null) {
                    System.out.println("La conexion ha sido exitosa");
                }
            } catch (SQLException e) {


            }
            return connect;

        }
    }


