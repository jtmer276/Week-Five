/*****
Name: Jules Merrill
Date: March 13th, 2024
Project: Geometry
 ***/

import java.util.*;

public class Geometry {
    public static void main(String[] args){
        int integer_m;
        int integer_n = 0;
        double side_one = 0;
        double side_two;
        double hypotenuse;
        double cost;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the greater integer: ");
        integer_m = input.nextInt();
        System.out.print("Enter the lesser integer: ");
        integer_n = input.nextInt();

        side_one = (integer_m*integer_m) - (integer_n*integer_n);
        side_two = (2*integer_m*integer_n);
        hypotenuse = (integer_m*integer_m) = (integer_n*integer_n);
        cost = (2.412 * side_one) + (3.767 * side_two) + (15.758 * hypotenuse);

        System.out.println(cost);
    }

}
