/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Snacks;

/**
 *
 * @author zacharylineman
 */
public class Food {
    
    //Varaibles
    private double calories,fat;
    private String name;
    
    //Constructers
    public Food(double c, double f, String n) {
        calories = c;
        fat = f;
        name = n;
        
    }
    
    //Methods
    public void nutrition() {
        System.out.println(name + "---"+" I contain " + calories + " calories and " + fat + " grams of fat");
        
    }
    
    public void clear() {
        calories = 0;
        fat = 0;
        
    }
    
    
}
