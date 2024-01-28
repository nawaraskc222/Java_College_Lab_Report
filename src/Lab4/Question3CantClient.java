package Lab4;



import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Question3CantClient {
    public static void main(String[] args) throws UnknownHostException, IOException {
        try (Socket s = new Socket("localhost", 1234);
             PrintWriter out = new PrintWriter(s.getOutputStream(), true);
             Scanner sc = new Scanner(s.getInputStream())) {

            out.println("I'm from Client");
            String data = sc.nextLine();
            System.out.println("Server is working and said: " + data);
        }
    }
}
