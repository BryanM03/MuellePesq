package sql;
import getset.VariableII;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
public class CRUDsql extends conexionsql
{
    ResultSet rs;
    java.sql.Statement st;
    VariableII var = new VariableII();
  public void Insertar (String CI, String Nombre, String Apellido, String Trabajo, String ID, String Embar)
  {
     try{
     Connection conexion = Conexion();
     java.sql.Statement st= conexion.createStatement();
     String sql = "insert into trabajador (ci, id_trabajador, trabajo, id_embarcacion, nombre,apellido)values ('"+CI+"',"
             + "'"+ID+"','"+Trabajo+"','"+Embar+"','"+Nombre+"','"+Apellido+"');";
     st.execute(sql);
     st.close();
     conexion.close();
     JOptionPane.showMessageDialog(null,"Se guardo correctamente ","Mensaje", JOptionPane.INFORMATION_MESSAGE);
     }catch(Exception e){
     JOptionPane.showMessageDialog(null,"Registro no se guardo "+e,"Mensaje", JOptionPane.ERROR_MESSAGE);    
     } 
  }
  
    public void Eliminar (String ci) //String CI, String Nombre, String Apellido, String Trabajo, String ID, String Embar
    {
     try{
     Connection conexion = Conexion();
     st=conexion.createStatement();
     String sql = "delete from trabajador where ci = '"+ci+"';";
     st.executeUpdate(sql);
     st.close();
     conexion.close();
     JOptionPane.showMessageDialog(null,"Se elimino registro correctamente ","Eliminado", JOptionPane.INFORMATION_MESSAGE);
     }catch(Exception e){
     JOptionPane.showMessageDialog(null,"Error al eliminar registro "+e,"Error", JOptionPane.ERROR_MESSAGE);    
     } 
    }
    public void InsertarP (String ID_Proveedor,String Nombre , String Marca, String Modelo)
    {
        try{
        Connection conexion = Conexion();
        st= conexion.createStatement();
        String sql = "insert into proveedor (id_proveedor, nombre_proveedor, modelo, marca)values ('"+ID_Proveedor+"',"
                + "'"+Nombre+"','"+Modelo+"','"+Marca+"');";
        st.execute(sql);
        st.close();
        conexion.close();
        JOptionPane.showMessageDialog(null,"Se guardo correctamente ","Mensaje", JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception e){
        JOptionPane.showMessageDialog(null,"Registro no se guardo "+e,"Mensaje", JOptionPane.ERROR_MESSAGE);    
        } 
    }
    public void Mostrar (String ID_Proveedor)
    {
        try{        
        Connection conexion = Conexion();
        st= conexion.createStatement();
        String sql = "select * from proveedor where id_proveedor = '"+ID_Proveedor+"';";
        rs=st.executeQuery(sql);
        if(rs.next()){
          var.setid_proveedor(rs.getString("id_proveedor"));
          var.setnombre(rs.getString("nombre_proveedor"));
          var.setmodelo(rs.getString("modelo"));
          var.setmarca(rs.getString("marca"));
        }else{
            var.setid_proveedor("");
            var.setnombre("");
            var.setmarca("");
            var.setmodelo("");
          JOptionPane.showMessageDialog(null,"No se encontro registro ","Sin registro", JOptionPane.INFORMATION_MESSAGE);  
        }
        st.close();
        conexion.close();
        }catch(Exception e){
        JOptionPane.showMessageDialog(null,"Error registro "+e,"Error", JOptionPane.ERROR_MESSAGE);    
        } 
    }
}
