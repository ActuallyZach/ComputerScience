/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.codequest2018p3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author zacharylineman
 */
public class CodeQuest2018p3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a single line with a potentially " + "incorrect ordinal ");
        System.out.println("number: an integer followed by the letters \"th\".");
        
        System.out.print("How many lines will you enter? --> ");
        int lines = keyboard.nextInt();
        System.out.print("\n");
        ArrayList<String> yeetArr = new ArrayList<>();

        String result;
        String keep;
        for (int x = 1; x <= lines; x++) {
            Scanner yeet = new Scanner(System.in);

            System.out.print("Enter number with th --> ");
            String line = yeet.nextLine();
            keep = line;
            line = line.replace("th", "");
            int num = Integer.parseInt(line);
            if (num % 10 == 1 && !(num / 10 == 1)) {
                   result = "" + num + "st";
            } else if (num % 10 == 2 && !(num / 10 == 1)) {
                result = "" + num + "nd";

            } else if (num % 10 == 3 && !(num / 10 == 1)) {
                result = "" + num + "rd";

            } else {
                result = keep;
            }
            yeetArr.add(result);
        }
        
        for(String yeet: yeetArr) {
            System.out.println(yeet);
        }
    }
    
}
