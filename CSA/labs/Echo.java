/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author zacharylineman
 */
import java.util.Scanner;

public class Echo {
    //-----------------------------------------------------------------
    //  Reads a character string from the user and prints it.
    //-----------------------------------------------------------------

    public static void main(String[] args) {
        String message;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a line of text:");
        message = scan.nextLine();
        System.out.println("You entered: \"" + message + "\"");
    }
}
