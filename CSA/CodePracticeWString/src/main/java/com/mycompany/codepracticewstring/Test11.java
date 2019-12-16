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
public class Test11 {
    
    public static void main(String[] args) {
        String temp = "comp";
        System.out.print(temp.substring(0) + " "
                + temp.substring(1) + " "
                + temp.substring(2) + " "
                + temp.substring(3));
    }
    
}

/*
The code should remove the word “very ” (and following space) from the message and print the new message.
You can use indexOf to find the position of a substring in your string. 
You can use substring to create a new string removing the word.
String message = "I am very happy!";
        String target = "very ";
        String message3 = message.substring(0,message.indexOf(target)) + message.substring(message.indexOf("h"));
        
        System.out.println(message3);
*/