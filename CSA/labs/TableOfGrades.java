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

public class TableOfGrades {

    public static void main(String[] args) {
        String name = "Jerry";
        
        int total = 0;
        int Score1 = 0;
        int Score2 = 0;

        System.out.println("///////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println("==          Student Points          ==");
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\///////////////////");
        System.out.println();
        System.out.println("Name\t\tLab\tBonus\tTotal");
        name = "Tom";
        Score1 = 80;
        Score2 = 3;
        
        System.out.println(name + "\t\t"+ Score1 +" \t" + Score2 + "\t" + (Score1 + Score2));
        name = "John";
        Score1 = 12;
        Score2 = 0;

        System.out.println(name + "\t\t" + Score1 + " \t" + Score2 + "\t" + (Score1 + Score2));
        name = "Tim";
        Score1 = 90;
        Score2 = 12;

        System.out.println(name + "\t\t" + Score1 + " \t" + Score2 + "\t" + (Score1 + Score2));
        name = "Larry";
        Score1 = 12;
        Score2 = 1;

        System.out.println(name + "\t\t" + Score1 + " \t" + Score2 + "\t" + (Score1 + Score2));
        name = "Jerry";
        Score1 = 99;
        Score2 = 3;

        System.out.println(name + "\t\t" + Score1 + " \t" + Score2 + "\t" + (Score1 + Score2));
        
    }

}
