package Lab2;
////question 3
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		String path="C:\\Users\\nawar\\OneDrive\\Documents\\Eclipse_JAVA\\College_Lab_Report\\bin\\Lab2\\filename.txt";
		File file= new File(path);
		Scanner myReader= new Scanner(file);
		while (myReader.hasNextLine()) {
	        String data = myReader.nextLine();
	        System.out.println(data);
	      }

	}

}
