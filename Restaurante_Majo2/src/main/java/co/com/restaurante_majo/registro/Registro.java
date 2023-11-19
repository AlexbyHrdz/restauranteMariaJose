package co.com.restaurante_majo.registro;

public class Registro {
    private int id ;
    private String nombre;
    private String apellido;
    private int nunTen;

    // Contructor
    public Registro (){}
    public Registro(int id, String nombre, String apellido, int nunTen) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nunTen = nunTen;
    }
    //getter and setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNunTen() {
        return nunTen;
    }

    public void setNunTen(int nunTen) {
        this.nunTen = nunTen;
    }
}
