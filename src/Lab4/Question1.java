package Lab4;

import java.net.MalformedURLException;
import java.net.URL;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "http://example.com:80/docs/books/tutorial" +
		        "/index.html?name=networking#\r\n" + "DOWNLOADING";

		try {
			URL uname= new URL(name);
			System.out.println("Authority"+ uname.getAuthority());
			System.out.println("Host:"+uname.getHost());			
			System.out.println("PORT:"+uname.getPort());
			System.out.println("Path: "+ uname.getPath());
			System.out.println("Query: "+ uname.getQuery());
			System.out.println("File:"+uname.getFile());
			System.out.println("Protocol:"+uname.getProtocol());
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

}
