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
public class Test10 {
    
    public static void main(String[] args) {
        String firstNameCaps = "ALEX";
        String firstLetter = firstNameCaps.substring(0,1);
        String restName = firstNameCaps.substring(1, 4).toLowerCase();
        String firstNameFull = (firstLetter + restName);
        
        System.out.println(firstNameFull);
        
    }
}

/*
The code starts with String firstNameCaps = ALEX; and should print Alex.
Use the toLowerCase and substring methods to do accomplish this task.
*/