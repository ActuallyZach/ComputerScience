/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.codequest2018p2;

import java.util.Scanner;

/**
 *
 * @author zacharylineman
 */
public class CodeQuest2018p2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        System.out.print("How many lines will you enter? -->");
        int lines = keyboard.nextInt(), count = 0;        
        System.out.print("\n");

        for(int x = 1; x <= lines; x++) {
            Scanner yeet = new Scanner(System.in);

            System.out.print("Enter a single line with a series of lowercase words separated by spaces -->");
            String line = yeet.nextLine();
            // find the vowels         
            for (int i = 0; i < line.length(); i++) {
                if (line.substring(i, i + 1).equals("a")) {
                    count ++;

                }
                if (line.substring(i, i + 1).equals("e")) {
                    count++;

                }
                if (line.substring(i, i + 1).equals("i")) {
                    count++;

                }
                if (line.substring(i, i + 1).equals("o")) {
                    count++;

                }
                if (line.substring(i, i + 1).equals("u")) {
                    count++;

                }
            }
            System.out.println(count);
            count = 0;
        }
        
        // print the answer
    }
    
}
