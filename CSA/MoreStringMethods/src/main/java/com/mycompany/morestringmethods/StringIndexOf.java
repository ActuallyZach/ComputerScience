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
public class StringIndexOf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Set Varaibles
        char ampersand = '@';
        String email_address = "meme@me.com";
        int result;
        result = email_address.indexOf(ampersand); //Find index of the ampersand
        //Print Results
        System.out.print("in email: " + email_address + ",");
        System.out.println(" the index of @ is " + result);
        
        String email_address2 = "youyouyou.com";  // Create second email
        result = email_address2.indexOf(ampersand); // Find Ampersand
        //Print results
        System.out.print("in email: " + email_address2 + ",");
        System.out.println(" the index of @ is " + result);
        //Check if result is -1 and tell the user, check if ampersand is present
        if (result == -1) {
            System.out.println("Invalid Email Address");
        } else {
            System.out.println("Email Address OK");
        }
        
        //Set variables
        String dotCom = ".com";
        result = email_address.indexOf(dotCom); // Get index of dotCom
        
        //Check if result is -1, check if dotCom is present
        if (result == -1) {
            System.out.println("Invalid Email Address");
        } else {
            System.out.println("Email Address OK");
        }
        
        // Create new atPos varaible
        int atPos = email_address.indexOf(ampersand);
        result = email_address.indexOf(dotCom, atPos); // Get position of dotCom after the ampersand
        System.out.print("Start searching after the @ symbol: ");
        if (result == -1) { // Check if dotCom is their after the @ symbol
            System.out.println("Invalid Email Address");
        } else {
            System.out.println("Email Address OK");
        }
        
        
    }
    
}
