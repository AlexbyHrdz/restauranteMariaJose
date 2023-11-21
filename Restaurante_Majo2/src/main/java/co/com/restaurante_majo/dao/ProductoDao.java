package co.com.restaurante_majo.dao;

import co.com.restaurante_majo.conexion.Conexion;
import co.com.restaurante_majo.producto.Producto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductoDao {
    public static void crearProductoDB (Producto registro){

        Conexion connect = new Conexion();

        try (Connection conexion = connect.get_connection()){

            PreparedStatement ps = null;

            try {

                String query = "INSERT INTO producto(Nombre_Productos, Descripcion, Precio_Producto,  Cantidad_Producto) VALUES (?,?,?,?)";

                ps = conexion.prepareStatement(query);

                ps.setString(1, registro.getNombreP());

                ps.setString(2, registro.getDescripcion());

                ps.setDouble(3, registro.getPrecio());

                ps.setDouble(4, registro.getCantidad());

                ps.executeUpdate();

                System.out.println("Registro de producto exitoso");

            }catch (SQLException e){

                System.out.println(e);
            }

        }catch (SQLException e ){

            System.out.println(e);
        }

    }

    public static void ListarProductosDB (){
        Conexion conexion = new Conexion();
        PreparedStatement ps = null;

        ResultSet rs =null;
        try (Connection connect = conexion.get_connection()){
            String query = "SELECT * From producto";
            ps = connect.prepareStatement(query);
            rs = ps.executeQuery();

            while(rs.next()){

                System.out.println("Id Producto" + rs.getInt("id"));
                System.out.println("Nombre de producto"+ rs.getString("Nombre_Productos"));
                System.out.println("Descripcion de productos"+rs.getString("Descripcion"));
                System.out.println("Precio de producto" + rs.getDouble("Precio_Producto"));
                System.out.println("Cantidad de producto"+rs.getInt("Cantidad_Producto"));


            }
        }catch (SQLException e){
            System.out.println("No se recuperaron registros");
            System.out.println(e);
        }
    }

    public static void modificarProductoDB (Producto update){
        Conexion conexion = new Conexion();
        try(Connection connect = conexion.get_connection()){

            PreparedStatement ps =null;

            try {
                int opc = update.getOpc();
                System.out.println(opc);
                if(opc==1) {
                    String query = "UPDATE producto SET Nombre_Productos =? Where Id=?";
                    ps = connect.prepareStatement(query);
                    ps.setString(1, update.getNombreP());
                    ps.setInt(2, update.getId());
                    ps.executeUpdate();
                } else if (opc==2) {
                    String query = "UPDATE producto SET Descripcion =? Where Id=?";
                    ps = connect.prepareStatement(query);
                    ps.setString(1, update.getDescripcion());
                    ps.setInt(2, update.getId());
                    ps.executeUpdate();
                } else if (opc== 3) {
                    String query = "UPDATE producto SET Precio_Producto =? Where Id=?";
                    ps = connect.prepareStatement(query);
                    ps.setDouble(1, update.getPrecio());
                    ps.setInt(2, update.getId());
                    ps.executeUpdate();
                } else if (opc==4) {
                    String query = "UPDATE producto SET Cantidad_Producto =? Where Id=?";
                    ps = connect.prepareStatement(query);
                    ps.setDouble(1, update.getCantidad());
                    ps.setInt(2, update.getId());
                    ps.executeUpdate();
                }
            }catch (SQLException e) {
                System.out.println(e);
                System.out.println("No fue posible  actualizo el registro");
            }

        }catch (SQLException e){
            System.out.println(e);
        }

    }

    public static void eliminarProductoDB (int idProducto){
        Conexion conexion= new Conexion();
        try(Connection connect = conexion.get_connection()){
            PreparedStatement ps= null;
            try{
                String querry = "DELETE FROM  producto where producto.id=?";
                ps = connect.prepareStatement(querry);
                ps.setInt(1,idProducto);
                ps.executeUpdate();
                System.out.println("El registro se elimino correctamente");
            }catch (SQLException e){
                System.out.println("NO se elimino");
                System.out.println(e);
            }

        }catch (SQLException e){
            System.out.println(e);
        }

    }
}
