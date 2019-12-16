/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pclassics2017p4;

import java.util.Scanner;

/**
 *
 * @author zacharylineman
 */
public class PClassics2017p4 {

    public static void main(String[] args) { 
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter starting letter: ");
        String inLine = keyboard.nextLine();       
        String letter = inLine.substring(0,1);        
        System.out.print("Enter first string: ");       
        String string1 = keyboard.nextLine();       
        System.out.print("Enter second string: ");       
        String string2 = keyboard.nextLine();
        System.out.println(modifiedLcs(letter, string1, string2));
    }
    
    static String modifiedLcs(String letter, String string1, String string2) {
        String lcs = "";
        // find and print the longest common substring
        for(int i = 0; i < string1.length() - 1; i ++) {
            if(string1.substring(i, i + 1).equals(letter)) {
                
            }
        }
        
        return lcs;
    }

}
