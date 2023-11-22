package co.com.restaurante_majo.service;

import co.com.restaurante_majo.dao.FacturaDao;


import java.util.Scanner;

public class FacturaService {
    static Scanner sc = new Scanner(System.in);

    public static void ListarFacturaDB(){

        FacturaDao.ListarFacturaDB();
    }


}
