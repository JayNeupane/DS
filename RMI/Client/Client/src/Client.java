import java.rmi.*;
import java.rmi.Naming;

     

public class Client
{
    public static void main(String args[])
    {
        try 
        {
      
          AddServerInterface st=(AddServerInterface)Naming.lookup("rmi:localhost/AddService"); 
           System.out.println(st.sum(25,8)); 
        }
        catch(Exception e)
        {
             System.out.println(e);
        }
    }

    private static class AddServerInterface {

        public AddServerInterface() 
        
        {
            
        }

        private boolean sum(int i, int i0) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    
}


