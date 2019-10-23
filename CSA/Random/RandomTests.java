/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mystuff;

/**
 *
 * @author zacharylineman
 */
import java.util.Random;

public class RandomTests {

    public static void main(String[] args) {

        Random generator = new Random();
        int num1;
        double num2;

        num1 = generator.nextInt(10);
        System.out.println("From 0 to 9: " + num1);

        num1 = generator.nextInt(10) + 1;
        System.out.println("From 1 to 10: " + num1);

        num1 = generator.nextInt(15) + 20;
        System.out.println("From 20 to 34: " + num1);

        num1 = generator.nextInt(20) - 10;
        System.out.println("From -10 to 9: " + num1);

        num2 = generator.nextDouble();
        System.out.println("A random double [between 0-1]: " + num2);

        num2 = generator.nextDouble() * 6;
        num1 = (int) num2 + 1;
        System.out.println("From 1 to 6: " + num1);

    }
}
