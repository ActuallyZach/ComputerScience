/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bankofcole;

/**
 *
 * @author zacharylineman
 */
public class Account {
    private String name;
    private int accNum;
    private double balance;
    
    
    public Account() {
        name = null;
        accNum = 0;
        balance = 0.0;
    }
    
    public Account(String name, int accNum, double balance) {
        this.name = name;
        this.accNum = accNum;
        this.balance = balance;
    }
    
    @Override
    public String toString() {
        return "Account name: " + this.name + ", Account number: " + this.accNum + ", Account balance: $" + this.balance;
   
    }
    
    public void withdraw(double amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
        } else {
            System.out.println("Not enough money in your account");
        }
    }
    
    public void deposit(double amount) {
        this.balance += amount;
    }
}