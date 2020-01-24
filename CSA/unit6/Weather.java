/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.unit6;

import java.util.Scanner;

/**
 *
 * @author zacharylineman
 */
public class Weather {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sum = 0;
        int min = 0, max = 0;
        int count = 0;
        double average;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("How many day's will you be entering?: ");
        int days = keyboard.nextInt();

        int[] temps = new int[days];

        for (int x = 0; x < days; x++) {
            System.out.print("Day " + (x + 1) + "'s highest temperature: ");
            temps[x] = keyboard.nextInt();

            sum += temps[x];
            if (x == 0) {
                min = temps[x];
            }
            if (temps[x] < min) {
                min = temps[x];
            }

            if (temps[x] > max) {
                max = temps[x];
            }
        }

        average = (double) sum / days;

        for (int i = 0; i < days; i++) {
            if (temps[i] > average) {
                count++;
            }
        }

        System.out.printf("Average temp = " + average);
        System.out.println("Minimum temp: " + min);
        System.out.println("Maximum temp: " + max);
    }
}