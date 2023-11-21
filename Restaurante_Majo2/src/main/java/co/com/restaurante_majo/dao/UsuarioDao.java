package co.com.restaurante_majo.dao;

import co.com.restaurante_majo.conexion.Conexion;
import co.com.restaurante_majo.registro.Registro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDao {

    public static void crearUsuarioBD(Registro dato){

        Conexion connect = new Conexion();

        try(Connection conexion = connect.get_connection()) {
            PreparedStatement ps =null;
            try {
                String query = "INSERT INTO registro(Nombre,Numero_Telefono) values (?,?,?)";
                ps = conexion.prepareStatement(query);
                ps.setString(1, dato.getNombre());
                ps.setInt(2, dato.getNunTen());
                ps.setInt(3, dato.getNumMesa());
                ps.executeUpdate();
                System.out.println("Registro Exitoso");
            }catch (SQLException e){
                System.out.println(e);
            }
        }catch (SQLException e){
            System.out.println(e);
        }

    }
}
