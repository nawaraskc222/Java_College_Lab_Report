package Lab1;
////question 6
import java.util.Scanner;

public class EventHandle {

	public static void main(String[] args) {
			
		System.out.println("Enter number in a: ");
		int a= new Scanner(System.in).nextInt();
		System.out.println("Enter number in b: ");
		int b= new Scanner(System.in).nextInt();
		int c;
		
		try {
			c= a/b;
			System.out.println(a);
			throw new Exception("Done");
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Done to Execute");
		}
	}

}
