package com.mycompany.acsl_99;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 *
 * @author zacharylineman
 */
public class ACSL_99 {

    public static void main(String[] args) {
        String inString;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the input");
        System.out.println("Enter string --> ");
        inString = keyboard.nextLine();
        inString = inString.replace(" ", "");
        
        play(inString);
        


    }
    public static void play(String inString) {
        ArrayList<Integer> hand = new ArrayList<Integer>();
        int commaPos, value = 0, max, loop = 0;
        String[] arr;
        String winner = "Error", temp;
        
        commaPos = inString.indexOf(",");
        temp = inString.substring(0, commaPos);
        temp = temp.trim();
        value = Integer.parseInt(temp);
        inString = inString.substring(commaPos + 1);
        arr = inString.split(",");
        
        for (int y = 0; y < arr.length; y++) {
            switch (arr[y]) {
                case "T":
                    hand.add(10);
                    break;
                case "J":
                    hand.add(11);
                    break;
                case "Q":
                    hand.add(12);
                    break;
                case "K":
                    hand.add(13);
                    break;
                case "A":
                    if ((value + 14) > 99) {
                        hand.add(1);
                    } else {
                        hand.add(14);
                    }
                    break;
                default:
                    hand.add(Integer.parseInt(arr[y]));
            }
        }
              
        //Loop's until the value is over 99
        while (value < 99) {
            //Players Turn
            value += getValue(getMax(hand.get(0), hand.get(1), hand.get(2)), value);
            hand.remove(hand.indexOf(getMax(hand.get(0), hand.get(1), hand.get(2))));

            if (value > 99) {
                winner = "Dealer";

                break;
            }
            //END
            
            //Dealer's Turn
            value += getValue(hand.get(3), value);
            hand.remove(3);
            
            if (value > 99) {
                winner = "Player";

                break;
            }
            //END
            
            loop++;

        }
        System.out.println(value + "," + winner);
    }

    public static int getValue(int num, int value) {
        //Get's the special value for whatever number is inputed.
        int change;
        switch (num) {
            case 9:
                change = 0;
                break;
            case 10:
                change = -10;
                break;
            case 14:
                if ((value + 14) > 99) {
                    change = 1;
                } else {
                    change = 14;
                }
                break;
            default:
                change = num;
               
        }

        return change;
    }
    
    public static int getMax(int x, int y, int z) {
        //Gets the max of the three numbers provided.
        if (x > y && x > z) {

            return x;
        } else if (y > z) {

            return y;
        } else {

            return z;
        }
    }

}
