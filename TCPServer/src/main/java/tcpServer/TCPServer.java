/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcpServer;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Anar
 */
public class TCPServer {
    public static void main(String[] args) throws Exception{
        getInfo.GetNameAndSurname.gettingNameAndSurname();
        readAsByte();
    }
    public static void readAsByte()throws Exception{
        ServerSocket ss = new ServerSocket(5678);
        while(true){
            System.out.println("waiting for a new client");
        Socket connection = ss.accept();
            System.out.println("a new client has come");
            
            DataInputStream dataStream = new DataInputStream(connection.getInputStream());
            byte [] arr = readMessage(dataStream); 
            fileWriter.FileWriter.writeIntoFile("C:\\Users\\Anar\\Desktop\\Anar2.jpg", arr);
            
        }
    }
    
    public static byte[] readMessage(DataInputStream dis)throws Exception{
        int msglen = dis.readInt();
        byte[] msg = new byte[msglen];
        dis.readFully(msg);
        return msg;
    }
}
