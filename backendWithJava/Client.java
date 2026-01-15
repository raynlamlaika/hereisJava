
// import java.net.*;
// import java.io.*;


// public class Client
// {
//     // private int Port = 8088;
//     private Socket s = null;
//     private DataInputStream in = null;
//     private DataOutputStream out = null;

//     public Client(String addr, int port)
//     {
//         try
//         {
//             s = new Socket(addr, port);
//             System.out.println("the Cnnection is establised");
//             // in = new BufferedReader(new InputStreamReader(s.getInputStream()));
//             // out = new DataOutputStream(s.getOutputStream());
//         }
//         catch (UnknownHostException u)
//         {
//             System.out.println("this is sthe exception Socket:" + u);
//             return;
//         }
//         catch (IOException i) {
//             System.out.println("this is sthe exception Socket:" + i);
//             return;
//         }

//         String m = "";

//         while (!m.equals("Over")) {
//             try {
//                 m = in.readLine();
//                 out.writeUTF(m);
//             }
//             catch (IOException i) {
//                 System.out.println("this is sthe exception reaad buffer:" + i);
//             }
//         }

//         //closing the connection
//         try {
//             in.close();
//             out.close();
//             s.close();
//         }
//         catch (IOException i) {
//             System.out.println("this is the exception close the socket:" + i);
//         }

//     }





// }




import java.net.Socket;
import java.io.*;

// public class Client {
//     private Socket s = null;
//     private BufferedReader in = null;
//     private DataOutputStream out = null;

//     public Client(String addr, int port) {
//         try {
//             s = new Socket(addr, port);
//             System.out.println("Connection established");

//             // Initialize streams
//             in = new BufferedReader(new InputStreamReader(s.getInputStream()));
//             out = new DataOutputStream(s.getOutputStream());

//             // Example: send a test message to the server
//             String message = "Hello Server";
//             out.writeUTF(message);
//             out.flush();
//             System.out.println("Sent to server: " + message);

//             // Read response from server
//             String response = in.readLine();
//             System.out.println("Received from server: " + response);

//             // Close connection
//             in.close();
//             out.close();
//             s.close();

//         } catch (IOException e) {
//             System.out.println("Socket exception: " + e);
//         }
//     }

//     public static void main(String[] args) {
//         new Client("localhost", 1234);  // connect to localhost:1234
//     }
// }

// 


import java.io.*;
import java.net.*;

public class Client {
    private Socket socket;
    private DataOutputStream out;
    private BufferedReader console;

    public Client(String addr, int port) {
        try {
            socket = new Socket(addr, port);
            System.out.println("Connected to server");

            out = new DataOutputStream(socket.getOutputStream());
            console = new BufferedReader(new InputStreamReader(System.in));

            String msg = "";
            while (!msg.equalsIgnoreCase("Over")) {
                System.out.print("Enter message: ");
                msg = console.readLine();
                out.writeUTF(msg);
            }

            System.out.println("Closing connection...");
            out.close();
            socket.close();
            console.close();
        } catch (IOException e) {
            System.out.println("Error1: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        new Client("127.0.0.1", 5000);
    }
}
