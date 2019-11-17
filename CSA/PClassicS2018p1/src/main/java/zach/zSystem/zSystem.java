/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zach.zSystem;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author zacharylineman
 */
public class zSystem {
    
    public static void checkTriangle(int side1, int side2, int side3) {
        if (side1 + side2 > side3 && side1 + side3 > side2 && side3 + side2 > side1) {
            System.out.println("This triangle is valid");
            if (side1 == side2 && side1 == side3) {
                System.out.println("This triangle is equillateral");
            } else if (side1 == side2 && side1 != side3) {
                System.out.println("This triangle is Isoceles");

            } else if (side1 == side3 && side1 != side2) {
                System.out.println("This triangle is Isoceles");

            } else if (side2 == side3 && side1 != side2) {
                System.out.println("This triangle is Isoceles");

            } else if (side1 != side2 && side1 != side3 && side2 != side3) {
                System.out.println("This triangle is Scalene");

            }

        } else {
            System.out.println("This triangle is not valid");

        }
    }
    
    public static void print(String input) {
        System.out.print(input);
    }
    
    public static void println(String input) {
        System.out.print(input);
    }
    
    public static ArrayList createStringArr(String[] arr) {
        ArrayList<String> array = new ArrayList<>();
        array.addAll(Arrays.asList(arr));

        return array;
    }
    
    public static ArrayList createIntArr(int[] arr) {
        ArrayList<Integer> array = new ArrayList<>();
        for (Integer arr1 : arr) {
            array.add(arr1);
        }
        
        return array;
    }
    
    public static int max3(int x, int y, int z) {
        int max = 0;
        if (x > y && x > z) {

            return x;
        } else if (y > z) {

            return y;
        } else {

            return z;
        }
        
    }
    public static void reverse(String input) {
        String result = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            result += input.charAt(i);

        }
        System.out.println(result);
    }
    
}
