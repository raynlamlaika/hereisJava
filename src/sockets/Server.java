import java.net.*;
import java.io.*;
import java.util.*;
import java.nio.charset.StandardCharsets;






public class Client
{



    public static void main(String[] args)
    {

        Socket  socket  = null;
        InputStreamReader inputStreamReader = null;
        // uffer is to hold more data insteade of taking batch by batch
        BufferedReader buffR = null;
        // it do the same task but it revers the work from char to bytes brage char -> bytes
        OutputStreamWriter outputStreamWriter = null;
        BufferedWriter buffW = null;


        // the nly deffrent here is the server socket obj, is t listen and with for requiset
        // comment for the server
        ServerSocket serv = null;

        try
        {
            serv = new ServerSocket(9099);
            System.out.println("Server started on port 9099");
        }
        catch (IOException e)
        {
            System.out.println("Cannot start server on port 9099");
            e.printStackTrace();
            return;
        }
        while (true)
        {
            try
            {   
                // here we need to accept connect comming out of the server 
                socket  = serv.accept();
                inputStreamReader = new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8);
                outputStreamWriter = new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8);
                buffR = new BufferedReader(inputStreamReader);
                buffW = new BufferedWriter(outputStreamWriter);
                while (true)
                {
                    String  msgComming =  buffR.readLine();
                    System.out.println("this is msg come from the client :" + msgComming);
                    buffW.write("resv the msggggg : cool");
                    buffW.newLine();
                    buffW.flush();
                    if (msgComming.equalsIgnoreCase("bye"))
                        break ;
                }

            }
            catch (IOException e)
            {
                System.out.println("cant open socket for this port");
            }   
            finally
            {
                System.out.println("Closing client...");
                try {
                    if (buffR != null) buffR.close();
                    if (buffW != null) buffW.close();
                    if (socket != null) socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }



    }

}