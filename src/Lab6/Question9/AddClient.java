package Lab6.Question9;

import java.net.MalformedURLException;

import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;



public class AddClient {

	
	public static void main(String args[])  {
					
		
		   try {
	            // Lookup the remote object from the registry
			   Addition a = (Addition) Naming.lookup("rmi://localhost:1099/localService");

	            int sum = a.AddValue(3, 4);
	            System.out.println("Sum is " + sum);
	        } catch (Exception e) {
	            System.out.println("Error in ClientAdd: " + e.getMessage());
	        }
		
		
	}
}
