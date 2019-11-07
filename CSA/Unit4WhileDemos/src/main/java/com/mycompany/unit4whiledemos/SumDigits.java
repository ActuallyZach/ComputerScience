/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.unit4whiledemos;

import java.util.Scanner;

/**
 *
 * @author zacharylineman
 */
public class SumDigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Number");
        System.out.print("--> ");
        int digit, value = input.nextInt(), sum = 0;
        
        if (value != 0) {
            while (value > 0) {
                digit = value % 10;
                sum += digit;
                value = value/10;
            }
        }

        System.out.println("Sum of digits: " + sum);
    }
    
}
