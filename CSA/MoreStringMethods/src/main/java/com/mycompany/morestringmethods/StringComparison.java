/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.morestringmethods;

/**
 *
 * @author zacharylineman
 */
public class StringComparison {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String tv = "Bravia";
        String television = "Bravia";
        
        System.out.println("tv = " + tv + "; television = " + television);
        if (tv.equals(television)) {
            System.out.println("Both tv and television contain the same letters, in the same case, and are equal by the equals method of String");
            
        }
        
        // String compare example using equalsIgnoreCase
        System.out.println();
        System.out.println("tv = " + tv + "; television = " + television);
        if (tv.equalsIgnoreCase(television)) {
            System.out.println("Both tv and television contain the same letters,"
                    + " despite their case, and are equal by the equalsIgnoreCase " +  
                    "method of  String");
        } else { 
            System.out.println("Both tv and television DO NOT contain the same "
                    + "letters, despite case, so are NOT equal by the " 
                    + "equalsIgnoreCase method of String");              
        }
        
        int result;
        String word1 = "Ape";
        String word2 = "App";
        // String compare example using compareTo 
        result = word1.compareTo(word2); 
        System.out.println();           
        if (result < 0) {         
            System.out.println(word1 + " is less than " + word2);    
        } else if (result > 0) {           
            System.out.println(word1 + " is more than " + word2);
        } else if (result == 0) {          
            System.out.println(word1 + " and " + word2 + " contain the same word"); 
        }  
        
        // String compare example using compareToIgnoreCase 
        word1 = "ape";      
        result = word1.compareToIgnoreCase(word2);   
        System.out.println();            
        if (result < 0) {        
            System.out.println(word1 + " is less than " + word2);     
        } else if (result > 0) {         
            System.out.println(word1 + " is more than " + word2);   
        } else if (result == 0) {         
            System.out.println(word1 + " and " + word2 + " contain the same word");  
        }
        
    }
    
}
