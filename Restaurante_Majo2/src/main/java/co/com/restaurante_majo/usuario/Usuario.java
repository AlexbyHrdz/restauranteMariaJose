package co.com.restaurante_majo.usuario;

public class Usuario {
    private  int id_registro;
    //constructor
    public Usuario (){

    }

    public Usuario(int id_registro) {
        this.id_registro = id_registro;
    }
// getter and setter
    public int getId_registro() {
        return id_registro;
    }

    public void setId_registro(int id_registro) {
        this.id_registro = id_registro;
    }
}
