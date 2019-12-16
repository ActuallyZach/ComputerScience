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
public class Beverage {
    
    //Varaibles
    private double Fiber, Protein;
    private String name;

    //Constructers
    public Beverage(double f, double p, String n) {
        Fiber = f;
        Protein = p;
        name = n;

    }

    //Methods
    public void nutrition() {
        System.out.println(name + "---" + " I contain " + Fiber + " grams of fiber and " + Protein + " grams of protein");

    }

    public void clear() {
        Protein = 0;
        Fiber = 0;

    }
}
