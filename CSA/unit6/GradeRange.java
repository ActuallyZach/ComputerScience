package com.mycompany.unit6;


public class GradeRange {

    public static void main(String[] args) {
        String[] grades = {"A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "F"};
        int[] cutoff = {95, 90, 87, 83, 80, 77, 73, 70, 67, 63, 60, 0};
        
        Grade[] grades2 = new Grade[grades.length];
        
        for (int level = 0; level < grades.length; level++) {
            grades2[level] = new Grade(grades[level], cutoff[level]);
            System.out.println(grades2[level].getBoth());
        }

    }
    
}