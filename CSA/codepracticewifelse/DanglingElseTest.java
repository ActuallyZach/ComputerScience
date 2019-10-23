/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.codepracticewifelse;

/**
 *
 * @author zacharylineman
 */
public class DanglingElseTest {

    public static void main(String[] args) {
        boolean sunny = true;
        boolean hot = false;
        if (sunny) {
            if (hot) {
                System.out.println("Head for the beach!");
            } 
        } else { // Which if is else attached to??
            System.out.println("Bring your umbrella!");

        }
        
    }
}
