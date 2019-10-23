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
public class StringReplace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declare Variables
        String aString = "Where are you books?";
        String amend = aString.replace("you", "your");

        //Print results
        System.out.println("Before replace: " + aString);
        System.out.println("After replace: " + amend);
        
        aString = ",Where, are; you; books?,"; //Set Strings
        System.out.println("Before replace: " + aString); //Print Varaible
        amend = aString.replace(",", ""); //remove commas
        amend = amend.replace(";", ""); // remove semi colan
        System.out.println("After replace: " + amend); //Print result
        
    }
    
}
