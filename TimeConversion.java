/***
Name: Jules Merrill
Project: Time Conversion
***/

import java.util.*;

public class TimeConversion{
    public static void main(String[] args){
        int mins_initial = 0;
        int hours = 0;
        int minutes = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the time in minutes: ");
        mins_initial = input.nextInt();

        minutes = (mins_initial%60);
        hours = (mins_initial-minutes)/60;

        if(minutes < 10){
            System.out.println("The time is: " + hours +":0"+ minutes);
        }
        else{
            System.out.println("The time is: " + hours +":"+ minutes);
        }

        input.close();

    }

}