/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.progdevelop;

import java.util.Scanner;

/**
 *
 * @author zacharylineman
 */
public class PseudocodeNAlgorithms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int max = 0, lowest = 100, average = 0, sum = 0, amount = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the test grades. To stop entering test scores enter -1");
        Boolean incomplete = true;
        while (incomplete) {
            System.out.println("Grade: ");
            int input = keyboard.nextInt();
           
            if (input == -1) {
                incomplete = false;
                break;
            }
            
            if (input > max) {
                max = input;
            }
            if (input < lowest) {
                lowest = input;

            }
            sum += input;
            amount++;

        }
        
        average = sum / amount;
        System.out.println("Your Average was: " + average + " Your highest grade was: " + max + " Your lowest grade was " + lowest);
        
    }

}

/*
Accept a series of test scores as input
Compute the average test score
Determine the highest and lowest test scores 
Display the average, highest, and lowest test scores
*/
