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
public class DeterFreq {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int count = 0, num = 1327;
        
        while(num <= 4542) {
            if (num % 3 == 0 && num % 5 != 0) {
                count ++;
            }
            num++;
        }
        System.out.println("Count is: " + count);
    }
    
}
