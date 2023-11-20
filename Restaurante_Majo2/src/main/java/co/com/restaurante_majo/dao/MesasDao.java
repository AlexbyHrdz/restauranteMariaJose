package co.com.restaurante_majo.dao;

import co.com.restaurante_majo.conexion.Conexion;
import co.com.restaurante_majo.mesas.Mesas;
import co.com.restaurante_majo.producto.Producto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MesasDao {
    public static void ListarProductoDB() {
        Conexion conexion = new Conexion();
        PreparedStatement ps = null;

        ResultSet rs = null;
        try (Connection connect = conexion.get_connection()) {
            String query = "SELECT * From mesa";
            ps = connect.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("ID Mesas disponibles" + rs.getInt("id"));
            }
        } catch (SQLException e) {
            System.out.println("No se encontraron registros de mesas");
            System.out.println(e);
        }
    }

    public static void modificarMesaDB(Mesas update) {
        Conexion conexion = new Conexion();
        try (Connection connect = conexion.get_connection()) {
            try {
                PreparedStatement ps = null;
                String query = "UPDATE Mesa SET estado =? Where Id=?";
                ps = connect.prepareStatement(query);
                ps.setString(1, update.getEstado());
                ps.setInt(2, update.getId());
                ps.executeUpdate();
            }catch (SQLException e) {
                System.out.println(e);
                System.out.println("No fue posible  actualizo el registro");
            }

        }catch (SQLException e){
            System.out.println(e);
        }

    }
}
