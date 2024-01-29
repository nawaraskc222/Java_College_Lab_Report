package Lab6.RMI;

import java.net.MalformedURLException;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;

public class AddServer {	
	public static void main(String args[]) throws RemoteException, MalformedURLException {

		try {
			System.out.println("server running ............");
			Addition ad = new AdditionImp();
	        LocateRegistry.createRegistry(1099);
	         Naming.rebind("localService", ad);
	         System.out.println("server running ............");
		} catch (Exception e) {
			// TODO: handle exception			
			System.out.println(e.getMessage());
		}			
		
	}
}