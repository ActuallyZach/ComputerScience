/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.labs;

/**
 *
 * @author zacharylineman
 */
import java.util.Scanner;

public class LeapYear {

    //-------------------------------------------------------------
    // Reads an integer value representing a year.  Determines if the year
    // is a leap year
    //-------------------------------------------------------------
    public static void main(String[] args) {
        int year;   //date read in from user
        boolean leap = false;    //true if user's year is a leap year
        Scanner scan = new Scanner(System.in);

        //Get integer year from user]
        System.out.println("Enter Year: ");
        year = scan.nextInt();
        if (year < 1582) {
            System.out.println("Year to early");
            
        } else {
            if (year % 400 == 0) {
                leap = true;
            } else {
                if (year % 100 == 0) {
                    leap = false;
                } else {
                    if (year % 4 == 0) {
                        leap = true;
                    } else {
                        leap = false;
                    }
                }
            }
        }
        
        if (leap == true) {
            System.out.println("The year " + year + " is a leap year");
        } else {
            System.out.println("The year " + year + "is a leap year");

        }
    }
}

/*


*/