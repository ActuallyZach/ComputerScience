/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.labs;

/**
 *
 * @author zacharylineman
 */import java.util.Scanner;
import java.text.NumberFormat;

public class ComputeRaise {

    public static void main(String[] args) {
        double currentSalary; 
        // employee's current  salary 
        double raise = 0;      
        // amount of the raise 
        double newSalary;   
        // new salary for the employee   
        String rating;         
        // performance rating   
        Scanner scan = new Scanner(System.in); 
        System.out.print ("Enter the current salary: ");  
        currentSalary = scan.nextDouble();     
        System.out.print ("Enter the performance rating (Excellent, Good, or Poor): ");  
        rating = scan.next();       
        
        // Compute the raise using if ...
        if ("Excellent".equals(rating)) {
            raise = currentSalary * 0.06;
            
        } else if ("Good".equals(rating)) {
            raise = currentSalary * 0.04;

        } else if ("Poor".equals(rating)) {
            raise = currentSalary * 0.015;

        } else {
            System.out.println("You did not enter a valid rating");
        }
        
        
        newSalary = currentSalary + raise;    
        
        // Print the results     
        NumberFormat money = NumberFormat.getCurrencyInstance();     
        System.out.println();       System.out.println("Current Salary:   " + "    " + money.format(currentSalary));     
        System.out.println("Amount of your raise: " + money.format(raise));      
        System.out.println("Your new salary:      " + money.format(newSalary));    
        
    }
}
