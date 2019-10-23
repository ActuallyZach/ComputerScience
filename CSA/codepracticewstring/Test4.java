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
public class Test4 {
    
    public static void main(String[] args) {
        String message = "Meet me by the bridge";
        String part = message.substring(0, 3);
        String lower = part.toLowerCase();
        System.out.println(lower);
    }
}

/*
The code should print the first 3 letters of the string message all in lowercase letters.
However, the code has errors. Fix the errors so that the code runs as intended.
*/