/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bankofcole;

/**
 *
 * @author zacharylineman
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Account cole = new Account("Cole", 13249, 100.20);
        System.out.println(cole.toString());
        cole.withdraw(100.19);
        System.out.println(cole.toString());
        cole.deposit(2032020.22);
        System.out.println(cole.toString());
        System.out.println(cole.name);
    }
    
}
