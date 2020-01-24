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
public class Name {
    private String firstName;
    private String lastName;
    
    public Name(String f, String l) {
        firstName = f;
        lastName = l;
    }
    
    public String getFirst() {
        return firstName;
    }
    
    public String getLast() {
        return lastName;
    }
    
    public String getBoth() {
        return lastName + "," + firstName;
    }
}

