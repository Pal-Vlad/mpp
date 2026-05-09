package eu.ase.httpserver;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class HTTPMultiServer {

    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        boolean listening = true;

        try {
            int port = Integer.parseInt(args[0]);
            serverSocket = new ServerSocket(port);

            while(listening) {
                Socket client = serverSocket.accept();
                HTTPMultiServerThread objClient = new HTTPMultiServerThread(client);
                objClient.start();

            }
        } catch (IOException ie) {
            ie.printStackTrace();

        }
        if(serverSocket!= null) {
            try{
                serverSocket.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
