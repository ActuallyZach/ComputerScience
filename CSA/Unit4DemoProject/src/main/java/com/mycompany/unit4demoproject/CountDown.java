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
public class CountDown {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("T-minus ");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + ", ");
        }
        System.out.println("Blast off!");
        System.out.println("The end.");
    }
    
}
