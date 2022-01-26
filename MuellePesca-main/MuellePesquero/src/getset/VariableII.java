package getset;
public class VariableII {
 public static String nombre_proveedor;   
 public static String id_proveedor; 
 public static String modelo; 
 public static String marca; 
 public String getnombre() {
     return nombre_proveedor;
 }
  public String getid_proveedor() {
     return id_proveedor;
 } 
   public String getmodelo() {
     return modelo;
 }
  public String getmarca() {
     return marca;
 }
 
    public void setnombre(String nombre_proveedor) {
    this.nombre_proveedor=nombre_proveedor;
 }
  public void setid_proveedor(String id_proveedor) {
    this.id_proveedor=id_proveedor;
 } 
   public void setmodelo(String modelo) {
    this.modelo=modelo;
 }
  public void setmarca(String marca) {
    this.marca=marca;
 }
}
