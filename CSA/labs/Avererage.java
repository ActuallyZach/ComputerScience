/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author zacharylineman
 */
import java.util.Scanner;

public class Avererage {
    
    public static void main(String[] args) {
        int val1, val2, val3;
        double average;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter three integers and "
                + "I will compute their average");
        
        System.out.print("Enter First Int: "); val1 = scan.nextInt();
        
        System.out.print("Enter Second Int: "); val2 = scan.nextInt();
        
        System.out.print("Enter Thrid Int: "); val3 = scan.nextInt();
        
        average = (val1 + val2 + val3)/3;
        
        System.out.println("Average: " + average);
        
    }
}
