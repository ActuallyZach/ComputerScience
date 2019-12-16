/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.acsl_numbertransform;

/**
 *
 * @author zacharylineman
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/*
Make sure to place a txt file with the name Input within your project folder

296351  5
762184  3
45873216  7
19750418  6
386257914  5
*/


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here'
        ArrayList<String> inputArray = new ArrayList<String>();
        Scanner input = new Scanner(new File("Input.txt"));
        while (input.hasNextLine()) {
            inputArray.add(input.nextLine());
        }
        System.out.println("Solving Input file first...");
        solve(inputArray);
        inputArray.clear();
        
        System.out.println("\nEnter Custom input now -->");
        for (int i = 0; i < 5; i++) {
            System.out.println("Line " + (i + 1));
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Enter a first positive integer: ");
            int int1 = keyboard.nextInt();
            System.out.print("Enter a position: ");
            int int2 = keyboard.nextInt();
            inputArray.add(Integer.toString(int1) + Integer.toString(int2));
        }
        System.out.println("\nSolving...");
        solve(inputArray);

        
    }
    
    public static void solve(ArrayList<String> inputArray) {
        int lineCount = inputArray.size();
        String result = "";
        
        for(int i = 0; i < lineCount; i ++) {
            String currentLine = inputArray.get(i);
            int p = Integer.parseInt(currentLine.substring(currentLine.length() - 1));
            int n = Integer.parseInt(currentLine.substring(0, currentLine.length() - 1).trim());
            //Get the number to add
            String num1 = Integer.toString(n).substring(Integer.toString(n).length() - p, (Integer.toString(n).length() - p) + 1);
            int AddNum = Integer.parseInt(num1);

            //Time to add
            String[] nArray = Integer.toString(n).split("");
            for(int x = 0; x < nArray.length; x++) {
                int currentNum = Integer.parseInt(nArray[x]);
                int addNumPosition = Integer.toString(n).length() - p;
                
                if(x < addNumPosition) {
                    currentNum += AddNum;
                    if (currentNum > 9) {
                        result += Integer.toString(currentNum).substring(Integer.toString(currentNum).length() - 1);
                    } else {
                        result += Integer.toString(currentNum);
                    }
                } else if (x > addNumPosition) { 
                    result += Math.abs(AddNum - currentNum);
                } else if (x == addNumPosition) {
                    result += AddNum;
                }     
            }
            System.out.println(result);

            result = "";
            
        }
    }
}
