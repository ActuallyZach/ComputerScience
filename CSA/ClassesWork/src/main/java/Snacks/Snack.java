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
public class Snack {
    
    public static void main(String[] args) {
        Food leroysFood = new Food(100,15,"Leroy's food");
        
        Food tommysFood = new Food(130, 12, "Tommy's food");
        
        Beverage leroysBeverage = new Beverage(10, 12, "Leroys's Drink");
        
        Beverage tommysBeverage = new Beverage(15, 5, "Tommy's Drink");
        
        leroysFood.nutrition();
        leroysBeverage.nutrition();
        
        System.out.println();
        
        tommysFood.nutrition();
        tommysBeverage.nutrition();

        
    }
    
}
