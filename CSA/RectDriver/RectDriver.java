/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RectDriver;

/**
 *
 * @author zacharylineman
 */
public class RectDriver {
    
    public static void main(String[] args) {
        
        Rectangle LeroysRectangle = new Rectangle(10,20);
        System.out.println(LeroysRectangle);
        System.out.println("Area: " + LeroysRectangle.getArea());

        Rectangle TommysRectangle = new Rectangle(12);
        System.out.println(TommysRectangle);
        System.out.println("Area: " + TommysRectangle.getArea());

        Rectangle JessRectangle = new Rectangle(112, 3);
        System.out.println(JessRectangle);
        System.out.println("Area: " + JessRectangle.getArea());

        Rectangle ColesRectangle = new Rectangle();
        System.out.println(ColesRectangle);
        System.out.println("Area: " + ColesRectangle.getArea());

        Rectangle OopsieRectangle = new Rectangle((int)25.5);
        System.out.println(OopsieRectangle);
        System.out.println("Area: " + OopsieRectangle.getArea());
        
        Rectangle BlankRectangle;
        BlankRectangle = new Rectangle(99);
        System.out.println(BlankRectangle);
        System.out.println("Area: " + BlankRectangle.getArea());

        OopsieRectangle.setLength(12);
        System.out.println("OopsieRecatngle: " + OopsieRectangle);
        OopsieRectangle.setWidth(100000);
        System.out.println("OopsieRecatngle: " + OopsieRectangle);


        double num = 9 / 4;
        System.out.print(num);
        System.out.print(" ");
        System.out.print((int) num);
    }

}
