package co.com.proyecto.registros;

public class Registro {
   protected int id;
   protected  String nombre;
   protected String apellido;

   public Registro(){

   }

   public Registro(int id, String nombre, String apellido) {
      this.id = id;
      this.nombre = nombre;
      this.apellido = apellido;
   }

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
}
