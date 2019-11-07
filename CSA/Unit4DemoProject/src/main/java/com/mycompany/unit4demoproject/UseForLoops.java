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
public class UseForLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        multipleOf3(1,3);
        System.out.println("");
        multof4not5(21);
        System.out.println("");
        printList(2,7);
    }
    
    public static void multipleOf3(int m, int n) {
        for (int i = m; i <= n; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }
    
    public static void multof4not5(int m) {
        if (m >= 4) {
            for (int i = 0; i <= m; i++) {
                if (i % 4 == 0 && i % 5 != 0) {
                    System.out.print(i + " ");
                }
            }
            
        }
    }
    public static void printList(int m, int n) {
        if (m < n) {
            for (int i = m; i <= n; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }   
        }
        if (m > n) {
            for (int i = n; i <= m; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            } 
        }
    }
    
}
//multipleOf3(1,3);// 3
//multipleOf3(3,22);// 3 6 9 12 15 18 21
//multiple4Not5(21); // 4 8 12 16
//multiple4Not5(4); // 4
//printList(2,7); // 2 4 6
//printList(9,3);  // 3 5 7 9
