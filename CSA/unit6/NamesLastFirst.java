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
public class NamesLastFirst {

    /*
    Original Arrays
        String[] last = {"Alastname", "Blastname", "Clastname", "Dlastname", "Elastname", "Flastname", "Glastname", "Hlastname", "Ilastname", "Jlastname"};
        String[] first = {"Amy", "Bill", "Cathy", "Don", "Ellie", "Fred", "Gail", "Hank", "Ida", "Joe"};
    */
    
    
    public static void main(String[] args) {
        String[] last = {"Alastname", "Blastname", "Clastname", "Dlastname", "Elastname", "Flastname", "Glastname", "Hlastname", "Ilastname", "Jlastname"};
        String[] first = {"Amy", "Bill", "Cathy", "Don", "Ellie", "Fred", "Gail", "Hank", "Ida", "Joe"};
        
        Name[] names2 = new Name[last.length];
        
        for (int index = 0; index < names2.length; index++) {
            names2[index] = new Name(first[index], last[index]);
            System.out.println(names2[index].getBoth());

        }
        

    }

}
