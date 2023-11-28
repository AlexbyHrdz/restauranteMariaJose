package co.com.restaurante_majo.administrador;

import co.com.restaurante_majo.service.ProductoService;

import java.util.Scanner;

public class Admin {


    private String email = "MajoRestaurante@gmail.com";
    private String password = "123456789";

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
}


