/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mystuff;

/**
 *
 * @author zacharylineman
 */
import java.util.Scanner;

public class ScannerTests {

     public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // String input 
            System.out.print("Enter your First name --- ");
            String firstName = sc.nextLine();
            System.out.println("First Name: " + firstName);

            System.out.print("Enter your Last name --- ");
            String lastName = sc.nextLine();
            System.out.println("Last Name: " + lastName);

            System.out.print("Enter age --- ");
            String age = sc.nextLine();
            System.out.println("Age: " + age);

            System.out.print("Your name is " + firstName);
            System.out.print(" " + lastName);
            System.out.print(" And you are " + age);
            System.out.println(" years old");

    }
}
