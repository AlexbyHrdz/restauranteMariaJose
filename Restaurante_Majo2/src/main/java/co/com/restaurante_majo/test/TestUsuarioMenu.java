package co.com.restaurante_majo.test;

import co.com.restaurante_majo.service.MesasService;
import co.com.restaurante_majo.service.UsuarioService;

public class TestUsuarioMenu {
    public static void main(String[] args) {

        UsuarioService.crearUsuarioDB();
        MesasService.listasMesasDisponiblesBD();
        MesasService.modificarMesaBD();
    }
}
