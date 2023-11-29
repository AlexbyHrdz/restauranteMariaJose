package co.com.restaurante_majo.dao;

import co.com.restaurante_majo.conexion.Conexion;
import co.com.restaurante_majo.menu_pedido.MenuPedido;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MenuPedidoDao {

    public static void crearPedido (MenuPedido registro){

        Conexion connect = new Conexion();

        try (Connection conexion = connect.get_connection()){

            PreparedStatement ps = null;

            try {

                String query = "INSERT INTO menu_pedido(id, Numero_Mesa,Nombre_Usuario,Nombre_Producto ,Comentarios) VALUES (?,?,?,?,?)";

                ps = conexion.prepareStatement(query);

                ps.setInt(1, registro.getId());

               /* ps.setInt(2, registro.getNumeroMesa());*/

                ps.setInt(2, registro.getNumeroRegistro());

                ps.setString(3, registro.getNombreUsuario());

                ps.setString(4, registro.getNombreProducto());

                ps.setString(5, registro.getComentario());

                ps.executeUpdate();

                System.out.println("Registro de producto exitoso");

            }catch (SQLException e){

                System.out.println(e);
            }

        }catch (SQLException e ){

            System.out.println(e);
        }

    }
    public static void listarMenuPedido(){
        Conexion conexion = new Conexion();
        PreparedStatement ps = null;

        ResultSet rs =null;
        try (Connection connect = conexion.get_connection()){
            String query = "SELECT * From menu_pedido";
            ps = connect.prepareStatement(query);
            rs = ps.executeQuery();

            while(rs.next()){

                System.out.println("Id:" + rs.getInt("id"));
                System.out.println("Numero Mesa:"+ rs.getInt("Numero_Mesa"));
                System.out.println("Numero Registro"+rs.getInt("Numero_Registro"));
                System.out.println("Nombre Usuario" + rs.getString("Nombre_Usuario"));
                System.out.println("Nombre Producto"+rs.getString("Nombre_Producto"));
                System.out.println("Comentario"+rs.getString("Comentarios"));


            }
        }catch (SQLException e){
            System.out.println("No se recuperaron registros");
            System.out.println(e);
        }
    }

    public static void modificarMenuPedido (MenuPedido update){
        Conexion conexion = new Conexion();
        try(Connection connect = conexion.get_connection()){

            PreparedStatement ps =null;

            try {
                int opc = update.getOpc();
                System.out.println(opc);
                if(opc==1) {
                    String query = "UPDATE menu_pedido SET Numero_Mesa =? Where Id=?";
                    ps = connect.prepareStatement(query);
                    ps.setInt(1, update.getNumeroMesa());
                    ps.setInt(2, update.getId());
                    ps.executeUpdate();
                } else if (opc==2) {
                    String query = "UPDATE menu_pedido SET Numero_Registro =? Where Id=?";
                    ps = connect.prepareStatement(query);
                    ps.setInt(1, update.getNumeroRegistro());
                    ps.setInt(2, update.getId());
                    ps.executeUpdate();
                } else if (opc== 3) {
                    String query = "UPDATE menu_pedido SET Nombre_Usuario =? Where Id=?";
                    ps = connect.prepareStatement(query);
                    ps.setString(1, update.getNombreUsuario());
                    ps.setInt(2, update.getId());
                    ps.executeUpdate();
                } else if (opc==4) {
                    String query = "UPDATE menu_pedido SET Nombre_Producto =? Where Id=?";
                    ps = connect.prepareStatement(query);
                    ps.setString(1, update.getNombreProducto());
                    ps.setInt(2, update.getId());
                    ps.executeUpdate();
                } else if (opc==5) {
                String query = "UPDATE menu_pedido SET Comentarios =? Where Id=?";
                ps = connect.prepareStatement(query);
                ps.setString(1, update.getComentario());
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
    public static void eliminarPedido (int idPedido){
        Conexion conexion= new Conexion();
        try(Connection connect = conexion.get_connection()){
            PreparedStatement ps= null;
            try{
                String querry = "DELETE FROM  menu_pedido where menu_pedido.id=?";
                ps = connect.prepareStatement(querry);
                ps.setInt(1, idPedido);
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
