package rpc;
import java.io.*;
import java.net.*;

public class RPCClient {
    public static void main(String[] args) {
        try (
            Socket socket = new Socket("localhost", 5000);
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        ) {
            //Invoking the method
            dos.writeUTF("sumar");
            dos.writeInt(5);
            dos.writeInt(3);

            // receive the result
            int result = dis.readInt();
            System.out.println("Resultado de la suma: " + result);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
