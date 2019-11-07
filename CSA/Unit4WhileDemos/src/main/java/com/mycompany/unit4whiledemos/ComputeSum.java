/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.unit4whiledemos;

/**
 *
 * @author zacharylineman
 */
public class ComputeSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sum =0, number = 1;
        
        while(number <= 100) {
            sum += number;
            number ++;
        }
        System.out.println("Sum is: " + sum);

    }
    
}
