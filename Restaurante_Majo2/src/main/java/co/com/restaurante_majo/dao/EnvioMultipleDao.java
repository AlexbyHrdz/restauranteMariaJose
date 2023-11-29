package co.com.restaurante_majo.dao;

import co.com.restaurante_majo.conexion.Conexion;
import co.com.restaurante_majo.menu_pedido.MenuPedido;
import co.com.restaurante_majo.service.EnvioMultiple;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class EnvioMultipleDao {
    static Scanner sc = new Scanner(System.in);
    public static void modificarMenuPedido (MenuPedido update){
        Conexion conexion = new Conexion();
        try(Connection connect = conexion.get_connection()){

            PreparedStatement ps =null;

            try {
                int opc = update.getOpc();
                System.out.println(opc);
                if(opc==1) {
                    String query = "INSERT INTO menu_pedido() VALUES (?)";
                    ps = connect.prepareStatement(query);
                    ps.setInt(1, update.getNumeroMesa());
                    ps.setInt(2, update.getId());
                    ps.executeUpdate();
                } else if (opc==1) {
                    String query = "INSERT INTO menu_pedido() VALUES (?)";
                    ps = connect.prepareStatement(query);
                    ps.setInt(1, update.getNumeroRegistro());
                    ps.setInt(2, update.getId());
                    ps.executeUpdate();
                } else if (opc== 1) {
                    String query = "INSERT INTO menu_pedido() VALUES (?)";
                    ps = connect.prepareStatement(query);
                    ps.setString(1, update.getNombreUsuario());
                    ps.setInt(2, update.getId());
                    ps.executeUpdate();
                } else if (opc==1) {
                    String query = "INSERT INTO menu_pedido() VALUES (?)";
                    ps = connect.prepareStatement(query);
                    ps.setString(1, update.getNombreProducto());
                    ps.setInt(2, update.getId());
                    ps.executeUpdate();
                } else if (opc==1) {
                    String query = "INSERT INTO menu_pedido() VALUES (?)";
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
}

