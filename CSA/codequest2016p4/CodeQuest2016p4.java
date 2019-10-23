/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.codequest2016p4;

import java.util.Scanner;

/**
 *
 * @author zacharylineman
 */
public class CodeQuest2016p4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your speed (integer), then a space followed by true or false depending if it is your birthday");
        System.out.print("Enter --> ");
        String inLine = keyboard.nextLine(); 
        // get the integer speed    
        int spacePos = inLine.indexOf(" ");
        String speedStr = inLine.substring(0,spacePos); 
        int speed = Integer.parseInt(speedStr);     
        // get true or false     
        inLine = inLine.substring(spacePos+1);    
        boolean birthday = Boolean.parseBoolean(inLine);
        // use logical and relational operators to print the appropriate ticket
        if (birthday == false) {
            if (speed <= 60) {
                System.out.println("No ticket");

            } else if (speed > 60 && speed <= 80) {
                System.out.println("Small ticket");

            } else if (speed > 80) {
                System.out.println("Big ticket");

            }
        } else {
            if (speed <= 65) {
                System.out.println("No ticket");

            } else if (speed > 65 && speed <= 85) {
                System.out.println("Small ticket");

            } else if (speed > 85) {
                System.out.println("Big ticket");
            }
        }
        
    }
    
}
