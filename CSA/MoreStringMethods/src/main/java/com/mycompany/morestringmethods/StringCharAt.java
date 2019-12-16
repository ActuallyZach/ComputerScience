/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.morestringmethods;

/**
 *
 * @author zacharylineman
 */
import java.util.Scanner;

public class StringCharAt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declare Variables
        Scanner user_input = new Scanner(System.in);
        String email_address = "meme@me.com";
        char aChar = email_address.charAt(4); //Get character at index of 4
        
        System.out.println(aChar); // Print that char
        
        System.out.println("Quit Y/N");
        String aString = user_input.next();
        aChar = aString.charAt(0); // Get chracter at index 0
        
        // Check what aChar is equal to
        if (aChar == 'Y') { 
            System.out.println("OK, BYE BYE");
        } else {
            System.out.println("Not Quitting");
        }
        
    }
    
}
