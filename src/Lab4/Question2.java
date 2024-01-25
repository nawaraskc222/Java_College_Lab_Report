package Lab4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Question2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
        String urlString = "https://beta.openai.com/docs/";

		
		URL u= new URL(urlString);
		
		URLConnection con = u.openConnection();
		
		try {
			BufferedReader br= new BufferedReader(new InputStreamReader(con.getInputStream()));
			
			String line;
	        while ((line = br.readLine()) != null) {
	            System.out.println(line);
	        }
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		

	}

}
