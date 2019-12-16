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

public class StringSubstring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Declare Varaibles
        String FullName = "Bill Gates";
        String FirstNameChars = "";
        String LastNameChars = "";
        int spacePos = FullName.indexOf(" ");
        Scanner user_input = new Scanner(System.in);
        String NewName = "";
        String OtherFirstChars = "";
        String SurNameChars = "";

        //Get first two characters and print it out
        FirstNameChars = FullName.substring(0, 2);
        System.out.println(FirstNameChars);
        System.out.println("Space is at pos " + spacePos);
        
        //Get last name first two characters
        SurNameChars = FullName.substring(spacePos + 1, (spacePos + 1) + 2);
        System.out.println(SurNameChars);

        //Other characters in names
        OtherFirstChars = FullName.substring(2, spacePos);
        System.out.println("Other first: " + OtherFirstChars);
        String OtherSurNameChars = "";
        OtherSurNameChars = FullName.substring((spacePos + 1) + 2, FullName.length());
        System.out.println("Other second: " + OtherSurNameChars);
 
        //Prints out the new name that was created
        NewName = SurNameChars + OtherFirstChars + " " + FirstNameChars + OtherSurNameChars;
        System.out.println("New Name = " + NewName);
        
        //Prompt user to enter new name
        System.out.println("Enter a First Name and Surname: ");
        FullName = user_input.nextLine(); // Set varaibles ot what user entered
        FirstNameChars = "";
        FirstNameChars = FullName.substring(0, 2); //Get substrings
        spacePos = FullName.indexOf(" ");
        SurNameChars = "";
        SurNameChars = FullName.substring(spacePos + 1, (spacePos + 1) + 2); //Get substring
        OtherFirstChars = "";
        OtherFirstChars = FullName.substring(2, spacePos);
        OtherSurNameChars = "";
        OtherSurNameChars = FullName.substring((spacePos + 1) + 2, FullName.length());
        NewName = "";
        NewName = SurNameChars + OtherFirstChars + " " + FirstNameChars + OtherSurNameChars; //Set new name
        System.out.println("You are: " + NewName); //Print out new name
    }
    
}
