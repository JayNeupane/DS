
package thread;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class ClsConnecction 

{
    
 private static String driverName = "org.apache.hive.jdbc.HiveDriver";
        public static void main(String[] args) throws SQLException 
        {
           try 
           {
               // Register driver and create driver instance
                Class.forName(driverName);
            } catch (ClassNotFoundException ex) {
                      ex.printStackTrace();
            }

                // get connection
                System.out.println("before trying to connect");
                Connection con = DriverManager.getConnection("jdbc:hive2://[192.168.10.241]:10000/", "hive", "");
                System.out.println("connected");

                // create statement
                Statement stmt = con.createStatement();

                // execute statement
                stmt.executeQuery("show tables");

                con.close();
        }
}

    
    
