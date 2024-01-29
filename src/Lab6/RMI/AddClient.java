package Lab6.RMI;

import java.net.MalformedURLException;

import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.Scanner;


public class AddClient {
	
	public static void main(String args[])  {					
				   try {
	            // Lookup the remote object from the registry
			   Addition calc = (Addition) Naming.lookup("rmi://localhost:1099/localService");			   
			   System.out.println("Enter value for A:");
			   int a,b;			  
			   a=new Scanner(System.in).nextInt();			   			   
			   System.out.println("Enter value for B:");
			   b=new Scanner(System.in).nextInt();
			   	            int sum = calc.AddValue(a, b);	            
	            	            int sub = calc.SubValue(a, b);
	            System.out.println("Sum is : " + sum);
	            System.out.println("Difference is : " + sub);
	        } catch (Exception e) {
	            System.out.println("Error in ClientAdd: " + e.getMessage());
	        }		
			}
}