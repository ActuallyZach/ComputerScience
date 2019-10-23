/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.codequest2016p2;

/**
 *
 * @author zacharylineman
 */
import java.util.Scanner;

public class CodeQuest2016Starterp2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        int quarters = 0, dimes = 0, nickels = 0, pennies = 0;
        System.out.print("Enter a dollar amount $#.## : ");
        String inLine = keyboard.nextLine();
        System.out.println(inLine);
        // strip the $ 
        inLine = inLine.substring(1);
        int decimalPos = inLine.indexOf(".");
        String dollarStr = inLine.substring(0, decimalPos);
        String changeStr = inLine.substring(decimalPos + 1, inLine.length());
        
        int dollars = Integer.parseInt(dollarStr);
        int cents = Integer.parseInt(changeStr);

        quarters = (int) (dollars / .25); // Get amount of quarters in dollars

        while (cents != 0) {
            if (cents - 25 >= 0) { // Get amount of quarters in cents
                cents -= 25;
                quarters ++;
                
            } else if (cents - 10 >= 0) { // Get amount of dimes in cents
                cents -= 10;
                dimes ++;
                
            } else if (cents - 5 >= 0) { // Get amount of nickels in cents
                cents -= 5;
                nickels ++;
 
            } else if (cents - 1 >= 0) { // Get amount of pennies in cents
                cents -= 1;
                pennies ++;

            }
 
        }

        System.out.println("quarters=" + quarters);
        System.out.println("dimes=" + dimes);
        System.out.println("nickels=" + nickels);
        System.out.println("pennies=" + pennies);
        
       
 
    }
    
}
