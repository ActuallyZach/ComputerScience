/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersonDriver;

/**
 *
 * @author zacharylineman
 */
public class PersonDriver {
    
    public static void main(String[] args) {
        Person p1 = new Person("Deja", "555-132-3253");
        System.out.println(p1);

        //Call Void Method
        p1.hideCell();
        System.out.println("After hiding cell:");
        System.out.println(p1);

        Person p2 = new Person("Avery", "552-112-1111");
        System.out.println(p2);

        p2.hideCell();
        System.out.println("After hiding cell:");
        System.out.println(p2);
        
        Dog d1 = new Dog("Larry");
        Dog d2 = new Dog("Leroy");

        System.out.println(d1);
        System.out.println(d2);

    }
    
}
