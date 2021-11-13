/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcpClient;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 *
 * @author Anar
 */
public class TCPClient {
    public static void main(String[] args)throws Exception{
        String URL = getInfo.GetURL.getFileLocationURL();
        String IP = getIpAndPort.GetIPAndPort.getIp();
        int port = getIpAndPort.GetIPAndPort.getPort();
        
        Socket socket = new Socket(IP,port);
        OutputStream outPutStream = socket.getOutputStream();
        DataOutputStream dataOutPutStream = new DataOutputStream(outPutStream);
        byte [] bytes = fileWriter.FileWriter.readFromFile(URL); // you must write location URL where you take file
        dataOutPutStream.writeInt(bytes.length);
        dataOutPutStream.write(bytes);
        socket.close();
        
        System.out.println("File sent successfully");
        
    }
}
