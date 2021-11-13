/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getIpAndPort;

import java.util.Scanner;

/**
 *
 * @author Anar
 */
public class GetIPAndPort {
    public static String getIp(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter IP");   // you can enter your own created IP
        String IP = sc.nextLine();
        return IP;
    }
    
    public static int getPort(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter port number");  //you must create any port number by yourself
        int port = sc.nextInt();
        return port;
    }
}
