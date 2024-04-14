/***
 Jules Merrill
 3/14/2024
 Geometry
 */

import java.util.*;
import java.text.NumberFormat;

public class geometry {
    public static void main(String[] args){
        int m = 0;
        int n = 0;
        int side_one = 0;
        int side_two = 0;
        int hypotenuse = 0;

        NumberFormat currency= NumberFormat.getCurrencyInstance();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first greater integer: ");
        m = input.nextInt();
        System.out.print("Enter the second lesser integer: ");
        n = input.nextInt();

        side_one = (m*m)-(n*n);
        side_two = (2*m)*n;
        hypotenuse = (m*m)+(n*n);

        System.out.println("Side one: " +(side_one));
        System.out.println("Side two: " +(side_two));
        System.out.println("Hypotenuse: " +(hypotenuse));

        double cost = (2.412*(side_one))+(3.767*(side_two))+(15.758*(hypotenuse));
        System.out.println("The price is: " + currency.format(cost));       

        input.close();

    }
    
}
