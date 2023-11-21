package co.com.restaurante_majo.factura;

public class Factura {
    private  int id;
    private String nombreUsuario;
    private int mesa;
    private  String nombreProducto;
    private  double precioProductos;
    private int cantidadProductos;
    private double totalCompra;

    //Constructores
    public void Factura(){}

    public Factura(int id, String nombreUsuario, int mesa, String nombreProducto, double precioProductos, int cantidadProductos, double totalCompra) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.mesa = mesa;
        this.nombreProducto = nombreProducto;
        this.precioProductos = precioProductos;
        this.cantidadProductos = cantidadProductos;
        this.totalCompra = totalCompra;
    }
    //Getter and Setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioProductos() {
        return precioProductos;
    }

    public void setPrecioProductos(double precioProductos) {
        this.precioProductos = precioProductos;
    }

    public int getCantidadProductos() {
        return cantidadProductos;
    }

    public void setCantidadProductos(int cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }

    public double getTotalCompra() {
        return totalCompra;
    }

    public void setTotalCompra(double totalCompra) {
        this.totalCompra = totalCompra;
    }
}
