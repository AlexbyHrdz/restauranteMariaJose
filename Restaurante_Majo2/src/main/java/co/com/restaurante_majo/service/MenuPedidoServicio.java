package co.com.restaurante_majo.service;

import co.com.restaurante_majo.dao.MenuPedidoDao;
import co.com.restaurante_majo.dao.ProductoDao;
import co.com.restaurante_majo.menu_pedido.MenuPedido;

import java.util.Scanner;

public class MenuPedidoServicio {
    static Scanner sc = new Scanner(System.in);
    public static void crearMenuPedido (){
        System.out.println("Ingrese id del producto");
        int id = sc.nextInt();
        /*System.out.println("Ingrese Numero mesa: ");
        int nunMesa = sc.nextInt();*/
        System.out.println("Ingrese el numero de registro: ");
        int nunRegistro = sc.nextInt();
        System.out.println("Ingrese el Nombre de usuario ");
        String nombreUsuario = sc.next();
        System.out.println("Ingrese el nombre del producto: ");
        String nombreProduco = sc.next();
        System.out.println("Ingrese el comentario ");
        String comentario = sc.next();

        MenuPedido registro = new MenuPedido();

        registro.setId(id);
        //registro.setNumeroMesa(nunMesa);
        registro.setNumeroRegistro(nunRegistro);
        registro.setNombreUsuario(nombreUsuario);
        registro.setComentario(comentario);

        MenuPedidoDao.crearPedido(registro);
    }
    public static void listasPedido(){
        MenuPedidoServicio.listasPedido();
    }
    public static void modificarProductoDB (){
        MenuPedido update =new MenuPedido();
        System.out.println("Indique para modificar 1: nombre\n" +
                " 2: descripcion \n" +
                "3: Precio \n" +
                "4: cantidad \n");
        int opc = sc.nextInt();
        sc.skip("\n");
        int id;
        switch (opc){
            case 1:
                System.out.println("Selecciono Modificar Numero Mesa");
                System.out.println("Ingrese nuevo valor");
                int nunMesa = sc.nextInt();
                System.out.println("Indique la id a actualizar");
                id = sc.nextInt();
                opc= 1;
                update.setOpc(opc);
                update.setNumeroMesa(nunMesa);
                update.setId(id);
                MenuPedidoDao.modificarMenuPedido(update);

                break;
            case 2:
                System.out.println("Selecciono Modificar Numero de registro");
                System.out.println("Ingrese nuevo valor");
                int numRegistro = sc.nextInt();
                System.out.println("Indique la id a actualizar");
                id = sc.nextInt();

                opc= 2;
                update.setOpc(opc);
                update.setNumeroRegistro(numRegistro);
                update.setId(id);
                MenuPedidoDao.modificarMenuPedido(update);
                break;
            case 3:
                System.out.println(" Selecciono Modificar Nombre Usuario");
                System.out.println("Ingrese nuevo valor");
                String nombreUsuario = sc.next();
                System.out.println("Indique la id a actualizar");
                id = sc.nextInt();
                opc= 3;
                update.setOpc(opc);

                update.setNombreUsuario(nombreUsuario);
                update.setId(id);
                MenuPedidoDao.modificarMenuPedido(update);
                break;
            case 4:
                System.out.println("Selecciono Modificar Nombre Producto");
                System.out.println("Ingrese nuevo valor");
                String nombreProducto = sc.next();
                System.out.println("Indique la id a actualizar");
                id = sc.nextInt();
                opc= 5;
                update.setOpc(opc);

                update.setNombreProducto(nombreProducto);
                update.setId(id);
                MenuPedidoDao.modificarMenuPedido(update);
                break;
            case 5:
                System.out.println("Selecciono Modificar Comentario");
                System.out.println("Ingrese nuevo valor");
                String comentario = sc.next();
                System.out.println("Indique la id a actualizar");
                id = sc.nextInt();
                opc= 5;
                update.setOpc(opc);

                update.setComentario(comentario);
                update.setId(id);
                MenuPedidoDao.modificarMenuPedido(update);
                break;
            default:
                System.out.println("Seleccione una opcion valida");
                break;

        }
    }
    public static void eliminarPedido(){
        System.out.println("Indidque la id del producto que quiere eliminar");
        int idPedido = sc.nextInt();
        ProductoDao.eliminarProductoDB(idPedido);
    }
}
