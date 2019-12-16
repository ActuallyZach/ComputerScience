/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.song;

/**
 *
 * @author zacharylineman
 */
public class Song {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Song Ants = new Song();
        Ants.verse("one", "suck his thumb");
        Ants.verse("two", "tie his shoe");
        Ants.verse("three", "climb a tree");
    }
    
    public static void verse(String number, String rhyme) {
        System.out.println("The ants go marching " + number + " by " + number + ", hurrah, hurrah ");
        System.out.println("The ants go marching " + number + " by " + number + ", hurrah, hurrah ");
        System.out.println("The ants go marching " + number + " by " + number);
        System.out.println("The little one stops to " + rhyme);
        System.out.println("And they all go marching down to the ground");
    }
    
}

/*
II. Using NetBeans:
Create a new Java Project called  Song.    
Create a method or methods that take(s) parameters to print out a verse.  The method(s) should be abstract enough to work for all 3 verses.  
In the main method, create an object of the class and call the method(s) you created in step 2. To print out 3 verses of the song.  
*/