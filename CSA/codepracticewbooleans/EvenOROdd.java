/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.codepracticewbooleans;

/**
 *
 * @author zacharylineman
 */
public class EvenOROdd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int num4 = 4;
        
        System.out.println("A number is odd if the remainder is 1 "
                + " when dividing the number by 2.");
        System.out.print("Is " + num1 + " odd? ");
        System.out.println(num1 % 2 == 1);
        
        System.out.print("Is " + num2 + " odd? ");
        System.out.println(num2 % 2 == 1);
        
        System.out.print("Is " + num3 + " odd? ");
        System.out.println(num3 % 2 == 1);
        
        System.out.print("Is " + num4 + " odd? ");
        System.out.println(num4 % 2 == 1);
        
        System.out.println("A number is even if the remainder is 0 "
                + " when dividing the number by 2.");
        System.out.print("Is " + num1 + " even? ");
        System.out.println(num1 % 2 == 0);
        
        System.out.print("Is " + num2 + " even? ");
        System.out.println(num2 % 2 == 0);
        
        System.out.print("Is " + num3 + " even? ");
        System.out.println(num3 % 2 == 0);
        
        System.out.print("Is " + num4 + " even? ");
        System.out.println(num4 % 2 == 0);
    }
}
