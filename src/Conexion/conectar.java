

package Conexion;
import java.sql.*;
import javax.swing.JOptionPane;


public class conectar {
    Connection con=null;
    
    public Connection conexion(){
       try{
       //cargar nuestro driver
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           con=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-3NJV3AU\\SQLEXPRESS:1433;database=Hospital;user=sa;password=123;");
           //JOptionPane.showMessageDialog(null, "Conecxion Establecida.");
           System.out.println("Conexion Establecida.");
           
       }catch(ClassNotFoundException | SQLException e){
        System.out.println("error conexion");
        
       }
     return con;
    }
    
    public static void main(String[] args ) {
                
            conectar c = new conectar();
            c.conexion();
            
            
        }
}

