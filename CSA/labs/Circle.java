/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 * @author zacharylineman
 */

import java.util.Scanner;

public class Circle {
    

    public static void main(String[] args) {
        final double PI = 3.14159;

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a value for the radius --- ");
        int radius = sc.nextInt();
        double area = PI * radius * radius;
        double circumference = 2 *(PI * radius);
        double area1 = 0;
        double circumference1 = 0;


        System.out.println("The area of a circle with radius " + radius
                + " is " + area);
        System.out.println("The circumference is " + circumference);
        area1 = area;
        circumference1 = circumference;
        
        radius = radius * 2;
        area = PI * radius * radius;
        circumference = 2 * (PI * radius);

        System.out.println("The area of a circle with radius " + radius
                + " is " + area + " The circumference is " + circumference);
        System.out.println("The circumference is " + circumference);

        double areaDifference = area1 / area;
        double circumferenceDifference = circumference1 / circumference;

        System.out.println("The difference between areas is: " + areaDifference);
        System.out.println("The difference between circumference is: " + circumferenceDifference);
        
    
    
    }
    
}
