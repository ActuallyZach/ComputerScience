 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.acslint0102c1;

import java.util.Scanner;

/**
 *
 * @author zacharylineman
 */
public class ACSLint0102c1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String inString;  
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please Seperate Letters with commas and end string with $");
        System.out.println("Format @,@,@,$");
        System.out.print("Enter string --> ");
        inString = keyboard.nextLine();
        inString = inString.substring(0, inString.length() - 1);
        inString = inString.replaceAll(",", "");
        
        //System.out.println(inString);
        //System.out.println("Instring Length: " + inString.length());

        encrypt(inString);
        
    }
  
    public static void encrypt(String inString) {
        String StringLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        int numVal;
        int encodeVal = 0;
        int loop = 0;
        int lastVal = 0;
        
        while (inString.length() >= 1) {
            loop++;
            numVal = 1 + StringLetters.indexOf(inString.substring(0, 1));

            if (numVal >= 1 && numVal <= 5) { // A - E
                numVal = numVal * 2;

                encodeVal = numVal;

            } else if (numVal >= 6 && numVal <= 10) { // F - J
                numVal = numVal % 3;

                encodeVal = numVal * 5;

            } else if (numVal >= 11 && numVal <= 15) { // K - O
                numVal = numVal / 4;

                encodeVal = numVal * 8;

            } else if (numVal >= 16 && numVal <= 20) { // P - T
                encodeVal = ((numVal % 10) + (numVal / 10)) * 10; // first Digit

            } else if (numVal >= 21 && numVal <= 26) { // U - Z

                if (numVal % 2 == 0) {
                    encodeVal = (numVal / 2) * 12;

                } else if (numVal % 5 == 0) {
                    encodeVal = (numVal / 5) * 12;

                } else if (numVal % 3 == 0) {
                    encodeVal = (numVal / 3) * 12;

                } else if (numVal == 23) {
                    encodeVal = (numVal / 23) * 12;

                }

            }
            
            encodeVal += lastVal;

            while (encodeVal > 26) {
                encodeVal -= 26;

            }

            if (encodeVal > 0) {
                if (encodeVal < 26) {
                    System.out.print(StringLetters.charAt(encodeVal) + " ");

                } else {
                    encodeVal -= 26;
                    System.out.print(StringLetters.charAt(encodeVal) + " ");

                }

            } else if (encodeVal == 0) {

                System.out.print("#");

            }
            inString = inString.substring(1);

            lastVal = encodeVal;
            //System.out.print("Loop: " + loop);
            //System.out.println(" Last Val: " + lastVal);

        }
    }
}