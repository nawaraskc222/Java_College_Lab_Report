package Lab2;

///question 5
import java.io.*;

import java.util.Scanner;
public class ReadAndWriteAnother {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String pathRead="C:\\Users\\nawar\\OneDrive\\Documents\\Eclipse_JAVA\\College_Lab_Report\\bin\\Lab2\\filename2.txt";
		String pathWrite="C:\\Users\\nawar\\OneDrive\\Documents\\Eclipse_JAVA\\College_Lab_Report\\bin\\Lab2\\filename3.txt";
		FileWriter fw;
		File file= new File(pathRead);		
		Scanner sc = new Scanner(file);
		
		while(sc.hasNextLine()) {
			String data = sc.nextLine();
			System.out.println(data);
			fw= new FileWriter(pathWrite);
			fw.write(data);
			fw.close();
		}		
		System.out.println("____________________");
				
		File file2= new File(pathWrite);
		Scanner sc2 = new Scanner(file2);
		
		while(sc2.hasNextLine()) {			
			String data= sc2.nextLine();			
						System.out.println(data);
			
		}
		sc.close();		
		
	}

}
