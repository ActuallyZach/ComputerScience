

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

public class RevTimeConverter {
    
    
    public static void main(String[] args) {
        final int secondsHour = 3600;
        final int secondsMinute = 60;

        int seconds = 0;
        int minutes = 0;
        int hours = 0;
        int totalSeconds = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Total Seconds --- ");
        totalSeconds = sc.nextInt();
        System.out.println("Total Seconds: " + totalSeconds);
        
        hours = totalSeconds/3600;
        totalSeconds = totalSeconds - hours*3600;
        
        minutes = totalSeconds/60;
        totalSeconds = totalSeconds - minutes * 60;

        seconds = totalSeconds;
        
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);

        
        
    }
}
