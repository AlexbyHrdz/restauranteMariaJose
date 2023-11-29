package co.com.restaurante_majo.service;

import co.com.restaurante_majo.dao.MenuPedidoDao;
import co.com.restaurante_majo.menu_pedido.MenuPedido;

import java.util.Scanner;

public class EnvioMultiple {
    static Scanner sc = new Scanner(System.in);
    public static void crearEnvioMultiple (){

        System.out.println("Ingrese id del producto");
        int id = sc.nextInt();
        System.out.println("Ingrese el nombre del producto: ");
        int nunMesa = sc.nextInt();
        System.out.println("Ingrese la descripcion del producto: ");
        int nunRegistro = sc.nextInt();
        System.out.println("Ingrese el precio del producto: ");
        String nombreUsuario = sc.next();
        System.out.println("Ingrese la cantidad del producto: ");
        String nombreProduco = sc.next();
        System.out.println("Ingrese la cantidad del producto: ");
        String comentario = sc.next();

        MenuPedido registro = new MenuPedido();
        
        registro.setId(id);
        registro.setNumeroMesa(nunMesa);
        registro.setNumeroRegistro(nunRegistro);
        registro.setNombreUsuario(nombreUsuario);
        registro.setComentario(comentario);

        MenuPedidoDao.crearPedido(registro);
    }
}
