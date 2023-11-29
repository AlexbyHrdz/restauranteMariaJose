package co.com.restaurante_majo.dao;

import co.com.restaurante_majo.conexion.Conexion;
import co.com.restaurante_majo.factura.Factura;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FacturaDao {
    public static void ListarFacturaDB() {
        Conexion conexion = new Conexion();
        ResultSet rs =null;
        try (Connection connect = conexion.get_connection()) {
            try {
                PreparedStatement ps= null;

                String query = "select Registro.id, Mesa.id,Producto.id_Producto,Producto.Precio_Producto from Factura " +
                        "inner join Registro on Registro.Nombre = Factura.id_Registro " +
                        "inner join Producto on Producto.Nombre_Productos = Factura.id_Producto and Producto.Precio_Producto = Factura.id_Producto " +
                        "inner join Mesa on Mesa.Numero_Mesa = Factura.id_Numero_Mesa";
                ps = connect.prepareStatement(query);
                 rs = ps.executeQuery();
                while (rs.next()) {
                    System.out.println("Factura disponible" + rs.getInt("id"));
                }
            } catch (SQLException e) {
                System.out.println("No se encontro registro de factura");
                System.out.println(e);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

}
