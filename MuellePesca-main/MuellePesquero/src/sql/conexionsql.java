package sql;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class conexionsql {
    Connection conn = null;
    String url = "jdbc:postgresql://localhost/REAL";
    String usuario = "postgres";
    String contraseña = "Bmejia123";
    
    public Connection Conexion (){
        try{
        Class.forName("org.postgresql.Driver");
        conn=DriverManager.getConnection(url,usuario,contraseña);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error al conectar"+e,"Error",JOptionPane.ERROR_MESSAGE);
        }
        return conn;
    }    
}
