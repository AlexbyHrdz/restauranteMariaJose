package co.com.restaurante_majo.service;

import co.com.restaurante_majo.dao.UsuarioDao;
import co.com.restaurante_majo.registro.Registro;

import java.util.Scanner;

public class UsuarioService {
    static Scanner sc = new Scanner(System.in);
    public static void crearProductoDB (){
        System.out.println("Ingrese el nombre de Usuario: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el apellido: ");
        String apellido = sc.nextLine();
        System.out.println("Ingrese el numero telefonico: ");
        int nunTel = sc.nextInt();
        System.out.println("Ingrese el correo: ");
        String email = sc.next();
        System.out.println("Ingrese la Contraseña: ");
        String password = sc.next();

        Registro dato = new Registro();

        dato.setNombre(nombre);
        dato.setApellido(apellido);
        dato.setNunTen(nunTel);
        dato.setEmail(email);
        dato.setPassWord(password);

        UsuarioDao.crearUsuarioBD(dato);
    }

}
