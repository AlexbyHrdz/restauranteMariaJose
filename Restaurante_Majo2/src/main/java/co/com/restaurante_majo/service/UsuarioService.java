package co.com.restaurante_majo.service;

import co.com.restaurante_majo.dao.UsuarioDao;
import co.com.restaurante_majo.registro.Registro;

import java.util.Scanner;

public class UsuarioService {
    static Scanner sc = new Scanner(System.in);
    public static void crearUsuarioDB (){
        System.out.println("Ingrese el nombre de Usuario: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el numero telefonico: ");
        int nunTel = sc.nextInt();
        System.out.println("Ingrese el numero de mesa");
        int numMesa = sc.nextInt();


        Registro dato = new Registro();

        dato.setNombre(nombre);
        dato.setNunTen(nunTel);
        dato.setNumMesa(numMesa);

        UsuarioDao.crearUsuarioBD(dato);
    }

}
