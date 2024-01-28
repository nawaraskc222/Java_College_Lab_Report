package Lab4;



import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Question3CantServer {

    public static void main(String[] args) throws IOException {
        try (ServerSocket ss = new ServerSocket(1234);
             Socket s = ss.accept();
             Scanner sc = new Scanner(s.getInputStream());
             PrintWriter out = new PrintWriter(s.getOutputStream(), true)) {

            out.println("I'm from Server");
            String data = sc.nextLine();
            System.out.println("Client is working and said: " + data);
        }
    }
}
