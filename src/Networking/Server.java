package Networking;

import java.io.*;
import java.net.*;

public class Server {

    public static void main(String[] args){
        try{
            ServerSocket serverSocket = new ServerSocket(6666);
            java.net.Socket socket = serverSocket.accept(); // establishes connection

            DataInputStream dis = new DataInputStream(socket.getInputStream());

            String str = dis.readUTF();
            System.out.println("message= " + str);

            serverSocket.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
