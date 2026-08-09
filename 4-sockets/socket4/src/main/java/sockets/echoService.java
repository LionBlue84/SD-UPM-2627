package sockets;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class echoService implements Runnable {
    Socket socket = null;
    int id = 0;


    public echoService(Socket socket, int id) {
        // TODO: Initialisate the thread with the socket and the id connection

    }

    public void run() {
        String inputLine = null;

        try {
            //  2 Create BufferedReader for reading from the socket
            
            // 4 Create PrintWriter for writing to the socket
            
            // 5 Read lines from the socket until it receives an EOFException (end of file)
            
            // 6 Write each line received to the socket, including the echoed line
            

        } catch (IOException e) {

        } finally {
            try {
                // 7 Close the socket when done.
            } catch (IOException e) {
                System.out.println("Error closing socket: " + e.getMessage());
            }
        }
    
    
}
}
