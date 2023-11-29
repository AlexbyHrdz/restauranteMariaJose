package co.com.restaurante_majo.service;

import co.com.restaurante_majo.dao.MesasDao;
import co.com.restaurante_majo.dao.ProductoDao;
import co.com.restaurante_majo.mesas.Mesas;

import java.util.Scanner;

public class MesasService {
    MesasDao mesasDao = new MesasDao();
    static Scanner sc = new Scanner(System.in);
        public static void listasMesasDisponiblesBD(){
            MesasDao.ListarMesas();
        }
        public static void estadoMesaBD(){
            Mesas update = new Mesas();
            
            String estado = null;
            
            System.out.println("Selecione la id de la mesa a ocupar");
            int id = sc.nextInt();
            if(id == id){estado= "ocupado";}
            update.setEstado(estado);
            update.setId(id);
            MesasDao.estadoMesaDB(update);
        }
    public static void modificarNumMesa(){
       Mesas update = new Mesas();
        int id;
                System.out.println("Selecciono Modificar Numero mesas");
                System.out.println("Ingrese nuevo valor");
                int numMesa= sc.nextInt();
                System.out.println("Indique la id a actualizar");
                id = sc.nextInt();


                update.getNunMesas();
                update.setId(id);
                MesasDao.modificarNunMEsa(update);
        }
    public static void eliminarMesaDB (){
        System.out.println("Indidque la id de la mesa que quiere eliminar");
        int id = sc.nextInt();
        ProductoDao.eliminarProductoDB(id);
    }

    }


