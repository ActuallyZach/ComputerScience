/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.unit6;

/**
 *
 * @author zacharylineman
 */
public class Countries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Arrays have a length of 10
        String[] countries = new String[]{ "China", "Egypt", "France", "Germany", "India", "Japan", "Kenya", "Mexico", "United Kingdom", "United States" };
        String[] capitals = new String[] { "Beijing", "Cairo", "Paris", "Berlin", "New Dehli", "Tokyo", "Nairobi", "Mexico City", "London", "Washington DC"};
        String[] languages = new String[] {"Chinese", "Arabic", "French", "German", "Hindi", "Japanese", "Swahili", "Spanish", "English", "English" };
        
        int rand = (int) (Math.random() * 10 - 0 + 1) + 0;

        System.out.println("Country Name: " + countries[rand] + " \nCountry Capital: " + capitals[rand] + " \nCountry Language: " + languages[rand]);
    }
    
}
