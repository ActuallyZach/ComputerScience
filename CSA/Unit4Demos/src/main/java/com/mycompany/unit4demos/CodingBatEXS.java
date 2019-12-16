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
public class CodingBatEXS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String output = Repeat("Hello World!", 3);
        System.out.println(output);
        System.out.println(countExclaim(output));
        String string = "Once there was this girl name:Angel: and a dude :tony:";
        printNames(string);
        
    }
    
    public static String Repeat(String origString, int repeatCount) {
        String result = "";
        for(int x = 0; x < repeatCount; x++) {
            result += origString;
        }
        return result;
    }
    
    public static int countExclaim(String string) {
        int count = 0;
        for(int x = 0; x < string.length(); x++) {
            if (string.substring(x, x+1).equals("!")) {
                count++;

            }
        }
        return count;
    }
    
    public static void printNames(String string) {
        int i = 0;
        boolean notDone = true;
        while(notDone) {
            int found = string.indexOf("name:", i);
            if (found == -1) {
                notDone = false;
            } else {
                int start = found + 5;
                int end = string.indexOf(":", start);
                System.out.println(string.substring(start,end));
                i = end + 1;

            }
        }
        
    }
}
