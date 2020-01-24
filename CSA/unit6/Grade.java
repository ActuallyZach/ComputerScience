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
public class Grade {
    private String GradeLetter;
    private int number;

    public Grade(String L, int n) {
        GradeLetter = L;
        number = n;
    }

    public String getLetter() {
        return GradeLetter;
    }

    public String getNumber() {
        return "" + number;
    }

    public String getBoth() {
        return GradeLetter + "\t" + number;
    }
}
