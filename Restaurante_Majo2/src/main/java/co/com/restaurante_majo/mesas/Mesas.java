package co.com.restaurante_majo.mesas;

public class Mesas {
    private int id;
    private int nunMesas;
    private String estado;


    //Constructor
    public Mesas() {

    }


    public Mesas(int id, int nunMesas, String estado) {
        this.id = id;
        this.nunMesas = nunMesas;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNunMesas() {
        return nunMesas;
    }

    public void setNunMesas(int nunMesas) {
        this.nunMesas = nunMesas;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
