/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getInfo;

import java.util.Scanner;

/**
 *
 * @author Anar
 */
public class GetURL {
    public static String getFileLocationURL(){
        System.out.println("enter URL of file location");
        Scanner sc = new Scanner(System.in);
        String URL = sc.nextLine();
        return URL;
    }
}
