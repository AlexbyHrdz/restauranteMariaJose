package co.com.restaurante_majo.service;

import co.com.restaurante_majo.dao.MesasDao;

public class MesasService {
    MesasDao mesasDao = new MesasDao();
        public static void listasMesasDisponiblesBD(){
            MesasDao.ListarProductoDB();
        }

    }

