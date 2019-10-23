/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.codepracticewstring;

/**
 *
 * @author zacharylineman
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s1 = "ABCDEFGHI";
        String s2 = s1.substring(6, 7);
        String s3 = new String("abcdefghi");
        String s4 = s3.substring(4, 5);
        String s5 = s3.substring(2, 3);
        System.out.print(s2 + s4 + s5);
        
    }
    
}
