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
public class Pet {
    private String name, type, breed;
    private double weight;
    private int age;
    
    public Pet() {
        name = null;
        type = null;
        breed = null;
        weight = 0.0;
        age = 0;
        
    }
    public Pet(String n,String t,String b, double w, int a) {
        name = n;
        type = t;
        breed = b;
        weight = w;
        age = a;
    }
    
    public String getName() {
        return name;
        
    }
    public String getType() {
        return type;
        
    }
    public String getBreed() {
        return breed;
        
    }
    public double getWeight() {
        return weight;
        
    }
    public int getAge() {
        return age;

    }
    @Override
    public String toString() {
        return "Your pet " + name + " is a " + type + " it's breed is " + breed + ". It's age is " + age + " It's weight is " + weight; 
    }
    
    public void setName(String n) {
        name = n;
        
    }
    public void setType(String t) {
        type = t;
        
    }
    public void setBreed(String b) {
        breed = b;
        
    }
    public void setWeight(double w) {
        weight = w;
        
    }
    public void setAge(int a) {
        age = a;
        
    }
}

/*
*/