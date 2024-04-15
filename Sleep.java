/****
Name: Jules Merrill
Project: Sleep Application
***/

import java.util.*;
import java.text.NumberFormat;

public class Sleep{
    public static void main(String[] args){
        int birth_year = 0;
        int birth_month = 0;
        int birth_day = 0;
        int current_year = 0;
        int current_month = 0;
        int current_day = 0;
        int time_alive = 0;

        NumberFormat number = NumberFormat.getIntegerInstance();


        System.out.println("Enter your birthdate: ");
        Scanner input = new Scanner(System.in);
        System.out.print("Year: ");
        birth_year = input.nextInt();
        System.out.print("Month: ");
        birth_month = input.nextInt();
        System.out.print("Day: ");
        birth_day = input.nextInt();
        System.out.println("Enter today's date: ");
        System.out.print("Year: ");
        current_year = input.nextInt();
        System.out.print("Month: ");
        current_month = input.nextInt();
        System.out.print("Day: ");
        current_day = input.nextInt();
        
        time_alive += (current_year - birth_year)*365;
        time_alive += (current_month - birth_month)*30;
        time_alive += (current_day - birth_day);
        System.out.println("You have been alive for: " + number.format(time_alive) + " days");
        time_alive *= 8;
        System.out.println("You have slept for: " + number.format(time_alive) + " hours");

        input.close();
    }
}
