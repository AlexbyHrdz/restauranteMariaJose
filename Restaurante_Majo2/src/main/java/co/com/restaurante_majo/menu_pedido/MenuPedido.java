package co.com.restaurante_majo.menu_pedido;

public class MenuPedido {
    private int id;
    private int numeroMesa;
    private int numeroRegistro;
    private String nombreUsuario;
    private String nombreProducto;
    private String comentario;
    private int opc;
    //Constructor
    public MenuPedido(){}

    public MenuPedido(int id, int numeroMesa, int numeroRegistro, String nombreUsuario, String nombreProducto, String comentario, int opc) {
        this.id = id;
        this.numeroMesa = numeroMesa;
        this.numeroRegistro = numeroRegistro;
        this.nombreUsuario = nombreUsuario;
        this.nombreProducto = nombreProducto;
        this.comentario = comentario;
        this.opc = opc;
    }

    //Getter and Setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public int getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getOpc() {
        return opc;
    }

    public void setOpc(int opc) {
        this.opc = opc;
    }
}
