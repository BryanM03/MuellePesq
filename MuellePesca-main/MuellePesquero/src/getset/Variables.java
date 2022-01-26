package getset;
public class Variables 
{
 public static String ci;   
 public static String id_trabajador; 
 public static String nombre; 
 public static String apellido; 
 public static String id_embarcacion; 
 public static String trabajo; 
 
 public String getCI()
 {
     return ci;
 }
  public String getIDtrabajador()
 {
     return id_trabajador;
 } 
   public String getNombre()
 {
     return nombre;
 }
  public String getApellido()
 {
     return apellido;
 }
   public String getIDembarcacion()
 {
     return id_embarcacion;
 }
   public String getTrabajador()
 {
    return trabajo;
 }
    public void setCI(String ci)
 {
    this.ci=ci;
 }
  public void setIDtrabajador(String id_trabajador)
 {
    this.id_trabajador=id_trabajador;
 } 
   public void setNombre(String nombre)
 {
    this.nombre=nombre;
 }
  public void setApellido(String apellido)
 {
    this.apellido=apellido;
 }
   public void setIDembarcacion(String id_embarcacion)
 {
    this.id_embarcacion=id_embarcacion;
 }
   public void setTrabajador(String trabajo)
 {
    this.trabajo=trabajo;
 }
}

