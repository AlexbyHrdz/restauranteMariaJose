package co.com.restaurante_majo.dao;

import co.com.restaurante_majo.conexion.Conexion;
import co.com.restaurante_majo.mesas.Mesas;

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

    public static void estadoMesaDB(Mesas update) {
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
    public static void modificarProductoDB (Mesas update){
        Conexion conexion = new Conexion();
        try(Connection connect = conexion.get_connection()){
            try {
                PreparedStatement ps =null;
                    String query = "UPDATE Mesa SET id_Numero_Mesa =? Where Id=?";
                    ps = connect.prepareStatement(query);
                    ps.setInt(1, update.getNunMesas());
                    ps.setInt(2, update.getId());
                    ps.executeUpdate();
                } catch (SQLException e) {
                System.out.println(e);
                System.out.println("No fue posible  actualizo el registro");
            }

        }catch (SQLException e){
            System.out.println(e);
        }

    }
    public static void eliminarMesaDB (int id){
        Conexion conexion= new Conexion();
        try(Connection connect = conexion.get_connection()){
            PreparedStatement ps= null;
            try{
                String querry = "DELETE FROM  Mesa where Mesa.id=?";
                ps = connect.prepareStatement(querry);
                ps.setInt(1,id);
                ps.executeUpdate();
                System.out.println("El registro se elimino correctamente");
            }catch (SQLException e){
                System.out.println("No se elimino");
                System.out.println(e);
            }

        }catch (SQLException e){
            System.out.println(e);
        }

    }
}
