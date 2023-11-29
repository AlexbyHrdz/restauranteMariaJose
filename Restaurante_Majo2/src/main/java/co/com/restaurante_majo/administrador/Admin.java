package co.com.restaurante_majo.administrador;

import co.com.restaurante_majo.interfas_console.Console;
import co.com.restaurante_majo.service.ProductoService;

import java.util.Scanner;

public class Admin {


    private static String email = "Majorestaurante@gmail.com";
    private static String password = "123456789";

    public Admin() {

    }

    public Admin(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public static void inicioSecion(){


        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su correo electrónico: ");
        String correoUsuario = scanner.nextLine();
        System.out.print("Ingrese su contraseña: ");
        String contrasenaUsuario = scanner.nextLine();


        if (correoUsuario.equals(email) && contrasenaUsuario.equals(password)) {
            System.out.println("Inicio de sesión exitoso. ¡Bienvenido!");
            Console.opcionAdmin();
        } else {
            System.out.println("Credenciales incorrectas. Inicio de sesión fallido.");
        }
    }
    }




