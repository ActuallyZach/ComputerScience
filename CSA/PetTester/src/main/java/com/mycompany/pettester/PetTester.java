/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pettester;

/**
 *
 * @author zacharylineman
 */
public class PetTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pet Cole = new Pet("Cole", "Human", "Caucasian", 125.0, 16);
        Pet Michael = new Pet("Michael", "Human", "Caucasian", 135.0, 17);
        Pet Lerroy = new Pet("Lerroy", "Parrot", "Screchy", 125.0, 16);
        
        System.out.println(Lerroy.getBreed());
        System.out.println(Michael.getType());
        System.out.println(Cole.getName());
        System.out.println(Cole.toString());
        
        Lerroy.setName("Terrence");
        Cole.setWeight(10000000);
        Michael.setAge(123);
        System.out.println(Lerroy.getName());
        System.out.println(Michael.getAge());
        System.out.println(Cole.getWeight());
    }
    
}

/*
public Pet(String n,String t,String b, double w, int a) {

In your main method, create 3 pet objects and call their constructors, accessor methods,
and toString methods to test all of your methods.

*/