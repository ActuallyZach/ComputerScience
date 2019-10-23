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
public class Tests {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 7;
        int y = 4;
        boolean a = false;
        boolean b = false;
        if (x > y) {
            if (x % y >= 3) {
                a = true;
                x -= y;
            } else {
                x += y;
            }
        }
        if (x < y) {
            if (y % x >= 3) {
                b = true;
                x -= y;
            } else {
                x += y;
            }
        }
        System.out.println("A " + a);
        System.out.println("x " + x);
        System.out.println("B " + b);
        System.out.println("Y " + y);

    }
    
}
