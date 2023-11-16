package sdf.task02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Main {

    public static void main(String[] args) throws Exception {

        
        //connect to server
        if (args.length == 0) {
            int port = 3000;
            String host = "localhost";
        } else if (args.length > 0) {
            int port = Integer.parseInt(args[0]);
            String host = "localhost";
        } else if (args.length == 3) {
            int port = Integer.parseInt(args[1]);
            String host = args[2];
        }
        //System.out.println("Connected to server" + socket);

        Socket socket = new Socket(host, port);

        //getting streams from server
        final InputStreamReader isr = new InputStreamReader(socket.getInputStream());
        final BufferedReader br = new BufferedReader(isr);
        final OutputStreamWriter osw = new OutputStreamWriter(socket.getOutputStream());
        final BufferedWriter bw = new BufferedWriter(osw);






    




        // Close the stream
        bw.flush();
        osw.flush();
        osw.close();
        isr.close();
        socket.close();

    }

}