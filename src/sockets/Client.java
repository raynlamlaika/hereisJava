import java.net.*;
import java.io.*;
import java.util.*;
import java.nio.charset.StandardCharsets;






/*


    so right here in normal client that open socket for the server in local net
    open the socket stream and send in msg to it 


*/
public class Client
{

    public static void main(String[] args)
    {
        System.out.println("the program just start");


        // set up the sockets
        Socket  socket  = null;

        // is to store the biytes comming from the socket brage bytes -> chars
        InputStreamReader inputStreamReader = null;
        // uffer is to hold more data insteade of taking batch by batch
        BufferedReader buffR = null;
        // it do the same task but it revers the work from char to bytes brage char -> bytes
        OutputStreamWriter outputStreamWriter = null;
        BufferedWriter buffW = null;



        try
        {
            socket = new Socket("localhost", 9099);


            // in stream reader
            inputStreamReader =  new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8);
            // System.out.println("tis is the input -> " + inputStreamReader);

            // outputStreamWriter =  new OutputStreamWriter(socket.getOutputStream());
            outputStreamWriter = new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8);


            buffR = new BufferedReader(inputStreamReader);
            buffW = new BufferedWriter(outputStreamWriter);



            Scanner scan =  new Scanner(System.in);
            

            System.out.print("loop just start in\t");
            while (true)
            {
                // here we sen the msg to the io stream from the cli 
                String msg = scan.nextLine();
                buffW.write(msg);
                buffW.newLine();
                buffW.flush();
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