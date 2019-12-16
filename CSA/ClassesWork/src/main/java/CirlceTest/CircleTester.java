/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CirlceTest;

/**
 *
 * @author zacharylineman
 */

import java.util.Scanner;
        
public class CircleTester {
    
    public static void main(String[] args) {
        int radiusEntered;
        double areaChange, circumferenceChange;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a raduis: ");
    
        radiusEntered = keyboard.nextInt();
        
        Circle Leeroy = new Circle(radiusEntered);
        
        System.out.println("Area of circle with radius " + Leeroy.getRadius() + " Is " + Leeroy.getArea());
        
        System.out.println("Circumference of circle with radius " + Leeroy.getRadius() + " Is " + Leeroy.getCircumference());
        
        Circle Jenkins = new Circle(radiusEntered*2);

        System.out.println("Area of circle with radius " + Jenkins.getRadius() + " Is " + Jenkins.getArea());

        System.out.println("Circumference of circle with radius " + Jenkins.getRadius() + " Is " + Jenkins.getCircumference());
        
    }
    
}
