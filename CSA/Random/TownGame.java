/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mystuff;

import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author zacharylineman
 */
public class TownGame {
    
    static String customTownName;
    static int customResidents;
    static int customHouseCount;
    static int customPoliceStations;
    static int customPubs;
    static String customMayorName;
    
    TownGame() {
        JFrame f = new JFrame("Setup");
        //submit button
        JButton b = new JButton("Submit");
        b.setBounds(100, 100, 140, 40);
        //enter name label
        JLabel label = new JLabel();
        label.setText("Enter Town Name: ");
        label.setBounds(10, 10, 300, 100);
        //empty label which will show event after button clicked
        JLabel label1 = new JLabel();
        label1.setBounds(10, 110, 200, 100);
        //textfield to enter name
        JTextField textfield = new JTextField();
        textfield.setBounds(200, 47, 130, 30);
        //add to frame
        f.add(label1);
        f.add(textfield);
        f.add(label);
        f.add(b);
        f.setSize(600, 600);
        f.setLayout(null);
        //f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       
        //SETUP GAME SCREEN
        JFrame Game = new JFrame("Town Game");
        JButton nextTurn = new JButton("Next Turn");
        nextTurn.setBounds(250, 250, 100, 30);
        

        JLabel output = new JLabel();
        output.setText("Click Next Turn To Start Game. \n Every Turn will result in a new action happening to your town.");
        output.setBounds(250, 275, 500, 500);

        
        Game.setSize(600, 600);
        Game.setLayout(null);
        Game.add(nextTurn);
        Game.add(output);
        Game.setVisible(true);
        
        
        nextTurn.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
         
            }
            
            
        });

        b.addActionListener(new ActionListener() {

        Town CustomTown = new Town();

            @Override
            public void actionPerformed(ActionEvent arg0) {
                if (label.getText() == "Enter Town Name: ") { //TOWN NAME
                    customTownName = textfield.getText();
                    label1.setText("Town Name: " + customTownName);
                    label.setText("Enter Amount of Residents: ");
                    textfield.setBounds(200, 47, 130, 30);
                    CustomTown.townName = customTownName;
                    textfield.setText("");

                } else if (label.getText() == "Enter Amount of Residents: ") { //HOW MANY RESIDENTS
                    customResidents = Integer.valueOf(textfield.getText());
                    label1.setText("Enter Amount of Residents: " + customResidents);
                    label.setText("Enter How Many Houses: ");
                    textfield.setBounds(200, 47, 130, 30);
                    CustomTown.residents = customResidents;
                    textfield.setText("");
                    
                } else if (label.getText() == "Enter How Many Houses: ") { //HOW MANY HOUSES
                    customResidents = Integer.valueOf(textfield.getText());
                    label1.setText("Amount of Houses: " + customHouseCount);
                    label.setText("Enter How Many Police Stations: ");
                    textfield.setBounds(250, 47, 130, 30);
                    CustomTown.houseCount = customHouseCount;
                    textfield.setText("");

                } else if (label.getText() == "Enter How Many Police Stations: ") { //HOW MANY STATIONS
                    customPoliceStations = Integer.valueOf(textfield.getText());
                    label1.setText("Amount of Stations: " + customPoliceStations);
                    label.setText("Enter How Many Pubs: ");
                    textfield.setBounds(200, 47, 130, 30);
                    CustomTown.policeStations = customPoliceStations;
                    textfield.setText("");

                } else if (label.getText() == "Enter How Many Pubs: ") { //HOW MANY PUBS
                    customPubs = Integer.valueOf(textfield.getText());
                    label1.setText("Amount of Pubs: " + customPubs);
                    label.setText("Enter Your Mayors Name: ");
                    textfield.setBounds(200, 47, 130, 30);
                    CustomTown.pubs = customPubs;
                    textfield.setText("");

                } else if (label.getText() == "Enter Your Mayors Name: ") { //MAYORS NAME
                    customMayorName = textfield.getText();
                    label1.setText("Mayors Name: " + customMayorName);
                    label.setText("Town Built");
                    CustomTown.mayorName = customMayorName;
                    textfield.setText("");

                    f.remove(label1);
                    f.remove(textfield);
                    f.remove(label);
                    f.remove(b);
                    f.repaint();
                    
                    System.out.println(CustomTown.townName);
                    System.out.println(CustomTown.residents);
                    System.out.println(CustomTown.houseCount);
                    System.out.println(CustomTown.policeStations);
                    System.out.println(CustomTown.pubs);
                    System.out.println(CustomTown.mayorName);

                    f.setVisible(false);
                    Game.setVisible(true);
                }
            }
        });
       
        
        
    }
    
        public static void main(String[] args) {
            new TownGame();
    
        }
    

} 
class Town {  
    String townName;
    int residents;
    int houseCount;
    int policeStations;
    int pubs;
    String mayorName;
    boolean abandoned;

    public Town() {
        residents = 0;
        townName = "";
        houseCount = 0;
        policeStations = 0;
        pubs = 0;
        mayorName = "";
        abandoned = false;
        
        
    }
    
    public void RemoveResident() {
        residents--;
        
        if (residents <= 0) {
            abandoned = true;
        }
    }

}



