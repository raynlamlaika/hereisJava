//
//
//// the back end i will work on  with springboot
//
//public class Main
//{
//
//    static public void main (String[] args)
//    {
//        // right here im learning how to manage the back-end with java with just my basic synatx knowlage
//
//
//        // first run the server
//
//
//        // take  the requiests
//
//
//        //manage the respoense
//
//
//
//    }
//}
//
//


import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class Main {
    public static void main(String[] args) throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);

        server.createContext("/hello", new HttpHandler() {
            @Override
            public void handle(HttpExchange exchange) throws IOException {
                String response = "Hello from Java Server";
                exchange.sendResponseHeaders(200, response.length());
                OutputStream os = exchange.getResponseBody();
                os.write(response.getBytes());
                os.close();
            }
        });

        server.start();
        System.out.println("Server running on http://localhost:8080");
    }
}
