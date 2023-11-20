package co.com.restaurante_majo.dao;

import co.com.restaurante_majo.conexion.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MesasDao {
    public static void ListarProductoDB(){
        Conexion conexion = new Conexion();
        PreparedStatement  ps = null;

        ResultSet rs = null;
        try(Connection connect = conexion.get_connection()){
            String query= "SELECT * From mesa";
            ps = connect.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()){
                System.out.println("ID Mesas disponibles"+rs.getInt("id"));
            }
        }catch (SQLException e){
            System.out.println("No se encontraron registros de mesas");
            System.out.println(e);
        }
    }
}
