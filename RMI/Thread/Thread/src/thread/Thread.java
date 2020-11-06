
package thread;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class Thread {

   
    public static void main(String[] args)
    {
        
       int port = 8000;
       
       try 
       {
            ServerSocket server = new ServerSocket(port);
            System.out.println("Server is running on port :" + port);
            
            while(true)
            {
                Socket  client = server.accept();
                               
                                
            }
            
            
       }
       catch(IOException ex)
       {
           System.out.println("Error Occured : "+ ex);
       }
      
        
       
    }
    
}
