/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.progdevelop;

/**
 *
 * @author zacharylineman
 */

import java.util.Scanner;

public class Example1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard  = new Scanner(System.in);
        System.out.println("Enter Number");
        int m1 = keyboard.nextInt();
        
        System.out.println("Enter Number");
        int m2 = keyboard.nextInt();

        System.out.println("Enter Number");
        int m3 = keyboard.nextInt();

        System.out.println("Enter Number");
        int m4 = keyboard.nextInt();

        double grade = (m1 + m2 + m3 + m4)/4.0;
        
        if (grade < 65) {
            System.out.println("Fail");
           
        } else {
            System.out.println("Pass");

        }
            
    }
    
}
