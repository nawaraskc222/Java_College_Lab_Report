package Lab4;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {
    public static void main(String[] args) throws IOException {
        try (Socket socket = new Socket("localhost", 1234);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             Scanner in = new Scanner(socket.getInputStream());
             Scanner scanner = new Scanner(System.in)) {

            Thread receiveThread = new Thread(() -> {
                while (in.hasNextLine()) {
                    System.out.println("Server: " + in.nextLine());
                }
            });
            receiveThread.start();

            System.out.println("Enter your name:");
            String name = scanner.nextLine();
            out.println(name + " has joined the chat.");

            System.out.println("Start typing your messages (Type 'exit' to leave):");
            while (true) {
                String message = scanner.nextLine();
                if ("exit".equalsIgnoreCase(message)) {
                    break;
                }
                out.println(name + ": " + message);
            }
        }
    }
}
