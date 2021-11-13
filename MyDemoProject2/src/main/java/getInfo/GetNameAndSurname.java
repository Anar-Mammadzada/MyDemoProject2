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
public class GetNameAndSurname {
    public static void gettingNameAndSurname(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
        String name = sc.nextLine();
        sc = new Scanner(System.in);
        System.out.println("enter surname");
        String surname = sc.nextLine();
    }
}
