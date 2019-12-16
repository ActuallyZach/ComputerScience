/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.unit4demos;

/**
 *
 * @author zacharylineman
 */
public class PreReviewTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String TextToParse = "This was a terrible resturant! Very Bad. Did not enjoy";
        PrintWords(TextToParse);
        
    }

    
    public static void PrintWords(String inText) {
        int len = inText.length();
        int index = 0;
        String currentWord = "";
        
        while(index < len) {
            if(index == len - 1) {
                currentWord += inText.substring(index, index + 1);
                currentWord = removePuncuation(currentWord);
                
            } else if(!(inText.substring(index, index + 1).equals(" "))) {
                currentWord += inText.substring(index, index + 1);
            } else {
                currentWord = removePuncuation(currentWord);
                System.out.println(currentWord);
                currentWord = "";
            }
            index ++;
        }
    }
    
    public static String removePuncuation(String inText) {
        while (inText.length() > 0 && !Character.isAlphabetic(inText.charAt(0))) {
            inText = inText.substring(1);
        }
        while (inText.length() > 0 && !Character.isAlphabetic(inText.charAt(inText.length() - 1))) {
            inText = inText.substring(0, inText.length() - 1);

        }
        return inText;
    }
    
}
