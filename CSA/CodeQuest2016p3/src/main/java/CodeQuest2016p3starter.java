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

public class CodeQuest2016p3starter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        int side1 = 0, side2 = 0, side3 = 0;
        System.out.print("Enter 3 side lengths in format ##,##,## : ");
        String inLine = keyboard.nextLine();
        int commaPos;
        // get first side length
        if (inLine.length() < 5) {
            System.out.println("This is not a valid triangle");

        } else {
            commaPos = inLine.indexOf(",");
            String side1Str = inLine.substring(0, commaPos);
            side1Str = side1Str.trim();
            side1 = Integer.parseInt(side1Str);
            inLine = inLine.substring(commaPos + 1 ); 

            commaPos = inLine.indexOf(",");
            String side2Str = inLine.substring(0, commaPos);
            side2 = Integer.parseInt(side2Str);
            inLine = inLine.substring(commaPos + 1);

            side3 = Integer.parseInt(inLine);

            if (side1 + side2 > side3 && side1 + side3 > side2 && side3 + side2 > side1) {
                System.out.println("This triangle is valid");
                if (side1 == side2 && side1 == side3) {
                    System.out.println("This triangle is equillateral");
                } else if (side1 == side2 && side1 != side3) {
                    System.out.println("This triangle is Isoceles");

                } else if (side1 == side3 && side1 != side2) {
                    System.out.println("This triangle is Isoceles");

                } else if (side2 == side3 && side1 != side2) {
                    System.out.println("This triangle is Isoceles");

                } else if (side1 != side2 && side1 != side3 && side2 != side3) {
                    System.out.println("This triangle is Scalene");

                }

            } else {
                System.out.println("This triangle is not valid");

            }
        }       
    }
    
}
