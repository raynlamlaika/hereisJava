import java.net.Socket;
import java.net.*;
import java.io.*;



// lets speak and work some with sockets
// classicly sockets creat in fd to can have in comminecation with tow diveces
// in java we can have acces to creat in socket by calling   java.net package
// the socket func take tow params "IP address in all our case localhost" and the port



// for exchanging data we user:

        // to read data
        // InputStream input = socket.getInputStream(); 

        // to read data
        // InputStream input = socket.getInputStream();  

import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(5000);
        System.out.println("Server started, waiting for client...");

        Socket client = server.accept();
        System.out.println("Client connected!");

        DataInputStream in = new DataInputStream(client.getInputStream());
        String msg = "";

        while (!msg.equalsIgnoreCase("Over")) {
            msg = in.readUTF();
            System.out.println("Client says: " + msg);
        }

        System.out.println("Closing connection...");
        in.close();
        client.close();
        server.close();
    }
}
