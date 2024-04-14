/******
Jules Merrill
3/14/2023
Project: Building
 */

import java.util.*;
import java.text.NumberFormat;

 public class building{
     public static void main(String[] args){
        int poles = 0;
        double cylinders = 0;
        double pi = 3.14159;
        double radius = 1.5;
        double final_price = 0;

        NumberFormat currency= NumberFormat.getCurrencyInstance();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of the poles: ");
        poles = input.nextInt();

        cylinders = (double)poles*(pi*radius*radius*5);
        final_price = (cylinders*27)*12.98;
        final_price = (float)final_price;

        System.out.println("The final price is: " + currency.format(final_price));

        input.close();
     }

    }
