package co.com.restaurante_majo.service;

import co.com.restaurante_majo.dao.ProductoDao;
import co.com.restaurante_majo.producto.Producto;

import java.util.Scanner;

public class ProductoService {
    static Scanner sc = new Scanner(System.in);

    public static void crearProductoDB (){
        System.out.println("Ingrese id del producto");
        int id = sc.nextInt();
        System.out.println("Ingrese el nombre del producto: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese la descripcion del producto: ");
        String descripcion = sc.nextLine();
        System.out.println("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();
        System.out.println("Ingrese la cantidad del producto: ");
        int cantidad = sc.nextInt();

        Producto registro = new Producto();

        registro.setId(id);
        registro.setNombreP(nombre);
        registro.setDescripcion(descripcion);
        registro.setPrecio(precio);
        registro.setCantidad(cantidad);

        ProductoDao.crearProductoDB(registro);
    }

    public static void ListarProductosDB (){

        ProductoDao.ListarProductosDB();
    }

    public static void modificarProductoDB (){
        Producto update = new Producto();
        System.out.println("Indique para modificar 1: nombre\n" +
                " 2: descripcion \n" +
                "3: Precio \n" +
                "4: cantidad \n");
        int opc = sc.nextInt();
        sc.skip("\n");
        int id;
        switch (opc){
            case 1:
                System.out.println("Selecciono Modificar Nombre");
                System.out.println("Ingrese nuevo valor");
                String nombre = sc.nextLine();
                System.out.println("Indique la id a actualizar");
                id = sc.nextInt();
                opc= 1;
                update.setOpc(opc);
                update.setNombreP(nombre);
                update.setId(id);
                ProductoDao.modificarProductoDB(update);

                break;
            case 2:
                System.out.println("Selecciono Modificar Descripcio");
                System.out.println("Ingrese nuevo valor");
                String descripcion = sc.nextLine();
                System.out.println("Indique la id a actualizar");
                id = sc.nextInt();

                opc= 2;
                update.setOpc(opc);
                update.setDescripcion(descripcion);
                update.setId(id);
                ProductoDao.modificarProductoDB(update);
                break;
            case 3:
                System.out.println(" Selecciono Modificar Precio");
                System.out.println("Ingrese nuevo valor");
                double precio = sc.nextDouble();
                System.out.println("Indique la id a actualizar");
                id = sc.nextInt();
                opc= 3;
                update.setOpc(opc);

                update.setPrecio(precio);
                update.setId(id);
                ProductoDao.modificarProductoDB(update);
                break;
            case 4:
                System.out.println("Selecciono Modificar Cantidad");
                System.out.println("Ingrese nuevo valor");
                int cantidad = sc.nextInt();
                System.out.println("Indique la id a actualizar");
                id = sc.nextInt();
                opc= 5;
                update.setOpc(opc);

                update.setCantidad(cantidad);
                update.setId(id);
                ProductoDao.modificarProductoDB(update);
                break;
            default:
                System.out.println("Seleccione una opcion valida");
                break;

        }

    }

    public static void eliminarProductoDB (){
        System.out.println("Indidque la id del producto que quiere eliminar");
        int idProducto = sc.nextInt();
        ProductoDao.eliminarProductoDB(idProducto);
    }
}
