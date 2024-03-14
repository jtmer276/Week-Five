/*****
Name: Jules Merrill
Date: March 13th, 2024
Project: Concrete

import java.util.*;

public class Building {
    public static void main(String[] args){
        double cost;
        int poles;
        double cylindrical_poles;
        double cubic_yards;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of poles:");
        poles = input.nextInt();


        cylindrical_poles = poles*(3.1459*1.5*1.5*5);
        cubic_yards = cylindrical_poles/27;
        cubic_yards = cubic_yards*12.98;

        System.out.println("It will cost" + " $" +(cubic_yards));
    }

}
 ***/