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
public class ArrayLab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] test = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(average(test));
        System.out.println(countAboveAve(test));
        System.out.println(largest(test));
        System.out.println(indexOfSmallest(test));

        
    }
    
    public static double average(int[] array) {
        double average;
        double sum = 0.0;
        double count = 0.0;
        
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
            count += 1;
        }
        
        average = sum / count;
        return average;
    }
    
    public static int countAboveAve(int[] array) {
        double average = average(array);
        int count = 0;
        
        for(int i = 0; i < array.length; i ++) {
            if(array[i] > average) {
                count ++;
            }
        }
        
        return count;
    }
    
    public static int largest(int[] array) {
        int largest = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }
        
        return largest;
    }
    
    public static int indexOfSmallest(int[] array) {
        int smallest = Integer.MAX_VALUE;
        int index = -1;
        
        for (int i = 0; i < array.length; i++) {
            if(array[i] < smallest) {
                smallest = array[i];
                index = i;
            }
        }
        
        return index;
    }
}

/*
1.  Write the method  average  which accepts an int array and returns the average of the values.
2.  Write the method  countAboveAve  which accepts an int array and returns the number of values that are above the average. You must call  average.
3.  Write the method  largest  which accepts an int array and returns the largest value of the array.
4.  Write the method  indexOfsmallest  which accepts an int array and returns the index of the smallest value. 
If there are multiple smallest values, return the index pf the first one.
5.  Write the main method with an array and check to make sure your methods work!

public static double average (int [ ] array) {
public static double average (int [ ] array) { 
public static double average (int [ ] array) {
public static double average (int [ ] array) {

*/