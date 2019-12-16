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
public class Circle {
    private final double PI = 3.14159;
    
    private int radius;
    
    public Circle(int r) {
        radius = r;
        
    }
    
    public int getRadius() {
        
        return radius;
    }
    
    public double getCircumference() {
        
        return 2*PI*radius;
    }
    
    public double getArea() {
    
        return PI*radius*radius;
    }
}
