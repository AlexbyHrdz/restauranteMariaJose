package co.com.restaurante_majo.service;

import co.com.restaurante_majo.dao.MesasDao;
import co.com.restaurante_majo.mesas.Mesas;

import java.util.Scanner;

public class MesasService {
    MesasDao mesasDao = new MesasDao();
    static Scanner sc = new Scanner(System.in);
        public static void listasMesasDisponiblesBD(){
            MesasDao.ListarProductoDB();
        }
        public static void modificarMesaBD(){
            Mesas update = new Mesas();
            
            String estado = null;
            
            System.out.println("Selecione la id de la mesa a ocupar");
            int id = sc.nextInt();
            if(id == id){estado= "ocupado";}
            update.setEstado(estado);
            update.setId(id);
            MesasDao.modificarMesaDB(update);


        }
    }

