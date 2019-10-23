/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.labs;

/**
 *
 * @author zacharylineman
 */

import java.util.Scanner;

public class LazyDays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Temperature: ");
        int temp = input.nextInt();
        
        if (temp >= 80 && temp < 95) {
            System.out.println("Go swimming");
        } else if (temp >= 60 && temp < 80) {
            System.out.println("Go play tennis");

        } else if (temp >= 40 && temp < 60) {
            System.out.println("Go play golf");

        } else if (temp < 40 && temp > 20) {
            System.out.println("Go skiing");

        } else if (temp >= 95 || temp <= 20) {
            System.out.println("Go Visit our shops");

        }
    }
    
}
