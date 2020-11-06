import java.rmi.*;
public class Client 
{
   public static void main(String args[])
   {
    try
    {
        AddServerInterface st = (AddServerInterface)Naming.lookup("rmi://localhost/addService");
       int res = st.sum(40, 80);
        System.out.println("Ourput :"+res);
        
    }
    catch(Exception e)
    {
        
    }
    
    
   }
}



