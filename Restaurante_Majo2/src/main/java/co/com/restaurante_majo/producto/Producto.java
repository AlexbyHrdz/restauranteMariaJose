package co.com.restaurante_majo.producto;

public class Producto {
    private int id;
    private String nombreP;
    private int cantidad;
    private double precio;
    private String descripcion;

    private  int opc;

    //constructor
    public Producto (){}

    public Producto(String nombreP, int cantidad, double precio, String descripcion) {
        this.nombreP = nombreP;
        this.cantidad = cantidad;
        this.precio = precio;
        this.descripcion = descripcion;
    }
    //Getter and Setter


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getOpc() {
        return opc;
    }

    public void setOpc(int opc) {
        this.opc = opc;
    }
}
