/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.acsljr0102c1wifelse;
import java.util.Scanner;

/**
 *
 * @author zacharylineman
 */
public class ACSLjr0102wifelse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       String StringLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
       String inString;
       int numVal;
       int encodeVal = 0;
        
       Scanner keyboard = new Scanner(System.in);
       System.out.print("Enter a single capital letter: ");    
       inString = keyboard.nextLine();
       numVal = 1 + StringLetters.indexOf(inString);
       // determine encode value
       if (numVal >= 1 && numVal <= 5) { // A - E

           System.out.println("A-E");
 
           numVal = numVal * 2;
           encodeVal = numVal;
           
       } else if (numVal >= 6 && numVal <= 10) { // F - J
           numVal = numVal % 3;

           encodeVal = numVal * 5;
           
       } else if (numVal >= 11 && numVal <= 15) { // K - O
           numVal = numVal / 4;
           
           encodeVal = numVal * 8;
           
       } else if (numVal >= 16 && numVal <= 20)  { // P - T
           encodeVal = ((numVal % 10) + (numVal / 10)) * 10; // first Digit
           
       } else if (numVal >= 21 && numVal <= 26) { // U - Z
           
           if (numVal % 2 == 0) {
               encodeVal = (numVal / 2) * 12;
               
           }  else if (numVal % 5 == 0) {
               encodeVal = (numVal / 5) * 12;
               
           }  else if (numVal % 3 == 0) {
               encodeVal = (numVal / 3) * 12;

           } else if (numVal == 23) {
               encodeVal = (numVal / 23) * 12;

           }
           
           while (encodeVal > 26) {
               encodeVal -= 26;
               
           }
           
       }       
       // print encoded letter
        
       if (encodeVal > 0) {
           System.out.println(StringLetters.charAt(encodeVal - 1));

       } else if (encodeVal == 0) {
           
           System.out.println("#");

       }
    }

    
}

/*
Complete the code for letters A-E, test and fix any errors before moving onto the next step

*/
