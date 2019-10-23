

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

public class Trace {

     public static void main(String[] args) {
        int one, two, three;
        double what;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        one = scan.nextInt();
        two = scan.nextInt();
        
        System.out.print("Enter a  floating point number: ");
        what = scan.nextDouble();
        three = 4 * one + 5 * two;
        two = 2 * one;
        System.out.println("one " + two +  ";" + three);
        three = one + two;
        one = 46 / 5 * 2 + 19 % 4;
        what = (what + 2.5) / 2;
        System.out.println(what + " is what!");
        
        
    }
}
