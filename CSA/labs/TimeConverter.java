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

public class TimeConverter {

    public static void main(String[] args) {
        final int secondsHour = 3600;
        final int secondsMinute = 60;

        int seconds = 0;
        int minutes = 0;
        int hours = 0;
        int totalSeconds = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter hours --- ");
        hours = sc.nextInt();
        System.out.println("Hours: " + hours);
        
        System.out.print("Enter minutes --- ");
        minutes = sc.nextInt();
        System.out.println("Minutes: " + minutes);

        System.out.print("Enter Seconds --- ");
        seconds = sc.nextInt();
        System.out.println("Seconds: " + seconds);

        totalSeconds = (hours*secondsHour) + (minutes*secondsMinute) + seconds;
        
        System.out.print("TOTALSECONDS: " +totalSeconds);
 
    }
}
