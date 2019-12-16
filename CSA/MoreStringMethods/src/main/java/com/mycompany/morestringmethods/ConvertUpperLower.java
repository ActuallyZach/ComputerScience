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
public class ConvertUpperLower {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declare Variables
        String changeToUpper = "text to change to uppercase";
        String result;
        
        //Print Out Varaible before it is changed
        System.out.println("Before: " + changeToUpper);
        result = changeToUpper.toUpperCase(); //Set result to uppercase changeToUpper
        System.out.println("After: " + result);
        
        //Declare Varaibles
        String changeToLower = "TeXT To ChAnGE To LoWeRCASE";
        
        System.out.println("Before: " + changeToLower); //Print Original string   
        System.out.println("After: " +  changeToLower.toLowerCase()); //Change string to lowercase.
        
        
    }
    
}
