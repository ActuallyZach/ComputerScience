
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zacharylineman
 */
public class PClassicF2017p3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a street name: ");
        String inLine = keyboard.nextLine();
        System.out.println(reverse(inLine));
    }
    
    public static String reverse(String input) {
        String result = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            result += input.charAt(i);

        }
        return result.toLowerCase();
    }
    
}
