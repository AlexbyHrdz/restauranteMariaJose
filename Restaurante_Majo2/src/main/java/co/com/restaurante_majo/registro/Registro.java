package co.com.restaurante_majo.registro;

public class Registro {
    private int id ;
    private String nombre;
    private int nunTen;
    private int numMesa;


    // Contructor
    public Registro (){}

    public Registro(int id, String nombre, int nunTen, int numMesa) {
        this.id = id;
        this.nombre = nombre;
        this.nunTen = nunTen;
        this.numMesa = numMesa;
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

    public int getNunTen() {
        return nunTen;
    }

    public void setNunTen(int nunTen) {
        this.nunTen = nunTen;
    }

    public int getNumMesa() {
        return numMesa;
    }

    public void setNumMesa(int numMesa) {
        this.numMesa = numMesa;
    }
}
