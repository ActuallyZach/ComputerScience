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
public class Rectangle {
    
    private int length,width;
    
    public Rectangle(int L, int W) {
        length = L;
        width = W;
        
    }
    
    public Rectangle(int S) {
        length = S;
        width = S;
        
    }
      
    public Rectangle() {
        length = 0;
        width = 0;

    }
    
    public void setLength(int L) {
        length = L; 
    }
    
    public void setWidth(int W) {
        width = W;
    }
    
    public int getLength() {
    
        return length;
    }
    
    public int getWidth() {

        return width;
    }
    
    public String toString() {
        
        return "Length: " + length + " ,Width: " + width;
    }
    
    public int getArea() {
        return length*width;
        
    }
}
