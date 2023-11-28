package co.com.restaurante_majo.interfas_console;

import co.com.restaurante_majo.administrador.Admin;
import co.com.restaurante_majo.dao.FacturaDao;
import co.com.restaurante_majo.dao.ProductoDao;
import co.com.restaurante_majo.service.FacturaService;
import co.com.restaurante_majo.service.MesasService;
import co.com.restaurante_majo.service.ProductoService;

import java.util.Scanner;

public class Console {
    static Scanner sc= new Scanner(System.in);



    public static void inicioSecion(){
        System.out.println("Precione 1 para iniciar");
        int opcInicio = sc.nextInt();


        if (opcInicio == 1) {
            System.out.println("Precione 1 para iniciar secion con admin \n" +
                    "Precione 2 para registrarse ");

            int opc = sc.nextInt();
            switch (opc) {
                case 1:
                    Admin admin = new Admin();
                    if (admin.getEmail().equals(admin.getEmail()) && admin.getPassword().equals(admin.getPassword()) ){
                        opcionAdmin();
                    }else{
                        System.out.println("No es administrador");
                    }
                    break;
                case 2:
                    opcionesUsuario();
                    break;
                default:
                    System.out.println("seleccione una opccion valida");
                    break;
            }

        } else {
            System.out.println("Opción no válida. Saliendo del programa.");
        }
    }

    public static void opcionesUsuario() {
        int opc;
        do{

            System.out.println("\n** Menú Principal Usuario **");
            System.out.println("1. Marque la mesa en la que se encuentra ");
            System.out.println("2. Ingrese a el menu ");
            System.out.println("3. Pedir factura");
            System.out.println("0. Salir");
            System.out.println("Selecciona una opción:");

            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Seleciono marcar mesa");
                    MesasService.estadoMesaBD();
                    break;
                case 2:
                    System.out.println("Seleciono el menu");
                    ProductoDao.ListarProductosDB();
                    break;
                case 3:
                    System.out.println("Seleciono Factura");
                    FacturaService.ListarFacturaDB();
                    break;
                case 0:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");

                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    break;
            }
        }while (opc != 0);

    }

    public static void opcionAdmin() {
        int opc;
        do {
            System.out.println("\n** Menú Admin **");
            System.out.println("1. Productos");
            System.out.println("2. Mesas");
            System.out.println("3. Pedidos");
            System.out.println("4. Facturas");
            System.out.println("0. Volver al Menú Principal");
            System.out.println("Selecciona una opción:");

            opc= sc.nextInt();

            switch (opc) {
                case 1:
                    productos();
                    break;
                case 2:
                    mesas();
                    break;
                case 3:
                    pedidos();
                    break;
                case 4:
                    factura();
                    break;
                case 0:
                    System.out.println("Volviendo al Menú Principal.");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    break;
            }
        } while (opc != 0);
    }

    public static void productos() {
        int opc;
        do {
            System.out.println("\n** Menú Productos **");
            System.out.println("1. Ver productos");
            System.out.println("2. Crear productos");
            System.out.println("3. Eliminar produtos");
            System.out.println("4. Actualizar productos");
            System.out.println("0. Volver al Menú Principal");
            System.out.println("Selecciona una opción:");

            opc= sc.nextInt();

            switch (opc) {
                case 1:
                    ProductoService.ListarProductosDB();
                    break;
                case 2:
                    ProductoService.crearProductoDB();
                    break;
                case 3:
                    ProductoService.eliminarProductoDB();
                    break;
                case 4:
                    ProductoService.modificarProductoDB();
                    break;
                case 0:
                    System.out.println("Volviendo al Menú Principal.");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    break;
            }
        } while (opc != 0);
    }
    public static void mesas() {
        int opc;
        do {
            System.out.println("\n** Menú Mesas **");
            System.out.println("1. Ver estado Mesas");
            System.out.println("2. modificar estado de la mesa");
            System.out.println("3. Eliminar mesa");
            System.out.println("0. Volver al Menú Principal");
            System.out.println("Selecciona una opción:");

            opc= sc.nextInt();

            switch (opc) {
                case 1:
                    MesasService.listasMesasDisponiblesBD();
                    break;
                case 2:
                    MesasService.estadoMesaBD();
                    break;
                case 3:
                    MesasService.eliminarMesaDB();
                    break;
                case 0:
                    System.out.println("Volviendo al Menú Principal.");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    break;
            }
        } while (opc != 0);
    }
    public static void pedidos() {
        int opc;
        do {
            System.out.println("\n** Menú Pedidos **");
            System.out.println("1. Ver pedidos");
            System.out.println("2. Modificar pedidos");
            System.out.println("3. Eliminar pedidos");
            System.out.println("4. Actualizar pedidos");
            System.out.println("0. Volver al Menú Principal");
            System.out.println("Selecciona una opción:");

            opc= sc.nextInt();

            switch (opc) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 0:
                    System.out.println("Volviendo al Menú Principal.");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    break;
            }
        } while (opc != 0);
    }
    public static void factura() {
        int opc;
        do {
            System.out.println("\n** Menú Factura **");
            System.out.println("1. Ver Factura");
            System.out.println("0. Volver al Menú Principal");
            System.out.println("Selecciona una opción:");

            opc= sc.nextInt();

            switch (opc) {
                case 1:

                    break;
                case 0:
                    System.out.println("Volviendo al Menú Principal.");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    break;
            }
        } while (opc != 0);
    }


            

}

