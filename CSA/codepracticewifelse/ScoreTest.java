/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.codepracticewifelse;

/**
 *
 * @author zacharylineman
 */
public class ScoreTest {

    public static void main(String[] args) {
        int score = 8;
        if (score <= 9) {
            System.out.println("Try for a higher score!");
        } else if (score > 9 && score < 20) {
            System.out.println("Good Job!!");

       } else if (score >= 20) {
            System.out.println("Excelent Job!!");

       }
    }
}

/*
Add an else statement to the if statement that prints out “Good job!” if the score is greater than 9. 
Change the value of score to test it.
Change the boolean test to print out “Excellent Job!” if the score is greater than or equal to 20. 
*/
