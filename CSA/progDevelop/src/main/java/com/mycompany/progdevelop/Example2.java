/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.progdevelop;

import java.util.Scanner;

/**
 *
 * @author zacharylineman
 */
public class Example2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int max = 0;
        Scanner keyboard = new Scanner(System.in);
        
        for (int i = 1; i < 5; i++) {
            System.out.println("Enter Number");
            int m1 = keyboard.nextInt();  
            if (m1 > max) {
                max = m1;
            }
        }
        System.out.println("The Largest number is: " + max);
    }
    
}
/*
Prompt user to enter a number and read number
•max number •for ( i = 1; i < 5; i++) {
prompt user to enter a number and read number        
if ( number > max )max  number   
}
•Print “The largest number is “ max
*/
