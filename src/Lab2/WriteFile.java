package Lab2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


////question 4
public class WriteFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String path="C:\\Users\\nawar\\OneDrive\\Documents\\Eclipse_JAVA\\College_Lab_Report\\bin\\Lab2\\filename2.txt";
		File myObj  = new File(path);
				
		if(myObj.createNewFile()) {
			 System.out.println("File created: " + myObj .getName());
		}else {
	        System.out.println("File already exists.");
	      }
		
		System.out.println("Enter text: ");
		
		String data= new Scanner(System.in).nextLine();
		
		
		FileWriter myWriter = new FileWriter(path);
	      myWriter.write(data);
	      myWriter.close();

	}

}
