package Lab2;

///question 2
import java.util.Scanner;
//import java.io.Execption;
import java.io.IOException;

public class Calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Enter number a: ");
		int a = new Scanner(System.in).nextInt();
		
		System.out.println("Enter number b: ");
		int b = new Scanner(System.in).nextInt();
		
		try {
			
			int add=a+b;
			int sub=a-b;
			float div= a/b;
			int mul= a*b;
			
			System.out.println("Add: "+add);
			System.out.println("Sub"+sub);
			System.out.println("Div: "+div);
			System.out.println("Mul"+mul);
			
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}

	}

}
