/**************
Name: Jules Merrill
Date: 3/5/2024
Project: Election
 *********/

import java.util.*;
import java.text.NumberFormat;

 public class election{
     public static void main(String[] args){
        int awbreyVote = 0;
        double awbreyPercentage;
        int martinezVote = 0;
        double martinezPercentage;
        int totalVotes;
        NumberFormat percent= NumberFormat.getPercentInstance();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of Awbrey's votes from New York: ");
        awbreyVote += input.nextInt();
        System.out.print("Enter the number of Awbrey's votes from New Jersey: ");
        awbreyVote += input.nextInt();
        System.out.print("Enter the number of Awbrey's votes from Connecticut: ");
        awbreyVote += input.nextInt();
        System.out.print("Enter the number of Martinez's votes from New York: ");
        martinezVote += input.nextInt();
        System.out.print("Enter the number of Martinez's votes from New Jersey: ");
        martinezVote += input.nextInt();
        System.out.print("Enter the number of Martinez's votes from Connecticut: ");
        martinezVote += input.nextInt();
        totalVotes = (martinezVote + awbreyVote);
        awbreyPercentage = ((double)awbreyVote/(double)totalVotes);
        martinezPercentage = ((double)martinezVote/(double)totalVotes);
        /*System.out.println("Candidate\t\t Votes\t Percentage");
        System.out.println("Awbrey\t\t\t "+ awbreyVote); */
        System.out.println("Candidate\t \t " + "Votes   " + "Percentage");
        System.out.println("Awbrey\t \t \t" + (awbreyVote)+"\t\t"+percent.format(awbreyPercentage));
        System.out.println("Martinez\t \t" + (martinezVote)+"\t\t"+percent.format(martinezPercentage));
        System.out.println("\nTOTAL VOTES: " + (totalVotes));
        System.out.println(" ");

        input.close();
         }
 }
