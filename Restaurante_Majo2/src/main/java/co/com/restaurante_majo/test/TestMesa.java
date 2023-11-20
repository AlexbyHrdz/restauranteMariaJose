package co.com.restaurante_majo.test;

import co.com.restaurante_majo.service.MesasService;

public class TestMesa {
    public static void main(String[] args) {

        MesasService.listasMesasDisponiblesBD();
        MesasService.modificarMesaBD();
    }
}
