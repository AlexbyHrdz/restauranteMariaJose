package co.com.restaurante_majo.administrador;

import co.com.restaurante_majo.service.ProductoService;

import java.util.Scanner;

public class Admin {
    static Scanner sc = new Scanner(System.in);

    private String email = "MajoRestaurante@gmail.com";
    private String password = "123456789";

    public  static  void menuAdmin(){

        int inicio = 1;
        System.out.println("Selecione 1. si quiere añadir un producto\n" +
                "2.si quiere eliminar un producto\n" +
                "3.si quiere modificar un producto\n" +
                "4.si quiere modificar el estado de una mesa\n" +
                "5.si quiere imprimir la factura \n" +
                "6. si quiere salir del menu Administrador\n");
        int opc = sc.nextInt();
    while (inicio !=0 ){
        switch (opc){
            case 1:
                System.out.println("selecciono añadir producto");

                break;
            case 2:
                System.out.println("Selecciono eliminar producto");
                break;
            case 3:
                System.out.println("Selecciono modificar producto");
                break;
            case 4:
                System.out.println("Selecciono modificar estado de la mesa");
                break;
            case 5:
                System.out.println("selecciono imprimir factura");
                break;
            case 6:
                System.out.println("Selecciono salir del sistema administrador");
                opc=0;
                break;
            default:
                System.out.println("seleccione una opcion valida");
                break;

        }
    }
    }

}
