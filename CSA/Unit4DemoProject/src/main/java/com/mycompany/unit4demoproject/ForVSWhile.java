/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.unit4demoproject;

/**
 *
 * @author zacharylineman
 */
public class ForVSWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        whileLoop();
        forLoop();
    }
    
    public static void whileLoop() {
        int sum = 0, number = 1;
        while (number <= 100) {
            sum += number;
            number++;
            
        }
        System.out.println("While: sum is " + sum);
        
    }
    
    public static void forLoop() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("For: sum is " + sum);

    }
    
}
