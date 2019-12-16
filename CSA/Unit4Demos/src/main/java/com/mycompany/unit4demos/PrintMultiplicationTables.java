/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.unit4demos;

/**
 *
 * @author zacharylineman
 */
public class PrintMultiplicationTables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        printTable(100);
        
    }
    
    public static void printTable(int num) {
        int z = 1;
        while (z <= num) {
            for (int i = 1; i <= 10; i++) {
                System.out.print(i * z + "\t");
            }
            System.out.print("\n");

            z ++;
        }
    }
    
}
