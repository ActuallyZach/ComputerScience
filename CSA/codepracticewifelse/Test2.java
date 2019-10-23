/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.codepracticewifelse;

/**
 *
 * @author zacharylineman
 */
public class Test2 {

    public static void main(String[] args) {
        // Get a random number from -10 up to 10.
        int number = (int) (Math.random() * 20 - 10);
        System.out.println("The number is " + number);

        // is it positive?
        if (number > 0) {
            System.out.println(number + " is positive!");
        }
        // is it 0?
         if (number == 0) {
            System.out.println(number + " is zero!");
        }
         
         if (number < 0) {
             System.out.println(number + " is negative!");
         }
    }
}
