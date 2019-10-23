/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.codepracticewbooleans;

/**
 *
 * @author zacharylineman
 */
public class GetDigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 67890;
        int place0, place1, place2, place3, place4;
        
                System.out.println("The modulo operator % can be used to "
                + "get digits from an integer: " + num);
        System.out.println("The rightmost digit is: "
                + (num % 10));

        System.out.print("The division operator / can be used to "
                + "strip off the rightmost digit,\nresulting in: ");
        num = num / 10;

        System.out.println(num);
        num = 67890;
        
        place4 = num % 10; // last Digit
        num = num / 10;

        place3 = num % 10; // fourth Digit
        num = num / 10;
        
        place2 = num % 10; // Third Digit
        num = num / 10;
        
        place1 = num % 10; // second Digit
        num = num / 10;
        
        place0 = num % 10; // first Digit
        num = num / 10;
        
        System.out.println("The first digit is: " + place0);
        System.out.println("The second digit is: " + place1);
        System.out.println("The third digit is: " + place2);
        System.out.println("The fourth digit is: " + place3);
        System.out.println("The rightmost digit is: " + place4);


        // using a combination of % and / division operators, print each digit
    }
    
}
