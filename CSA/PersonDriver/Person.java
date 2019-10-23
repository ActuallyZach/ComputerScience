/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersonDriver;

/**
 *
 * @author zacharylineman
 */
public class Person {
    //Fields
    private String name;
    private String cell;
    
    //Constructers
    public Person(String theName, String theCell) {
        
        name = theName;
        cell = theCell;
        
    }
    
    //METHODS
    public void hideCell() {
        cell = "XXX-XXX-XXX";
        
    }
    
    
    //OVERIDES TO STRING. TO STRING IS FROM JAVA ITSELF
    public String toString() {
        
        return "Name: " + name + ", Cell: " + cell; 
    }
    
}
