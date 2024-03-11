/**************
Name: Jules Merrill
Date: 3/5/2024
Project: Election
 *********/

import java.util.*;

 public class election{
     public static void main(String[] args){
        int awbreyVote = 0;
        double awbreyPercentage;
        int martinezVote = 0;
        double martinezPercentage;
        int totalVotes;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of Awbrey's votes from New Y: ");
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
        awbreyPercentage = awbreyVote/totalVotes;
        awbreyPercentage = (double)awbreyVote/(double)totalVotes*100;
        martinezPercentage = (double)martinezVote/(double)totalVotes*100;
        /*System.out.println("Candidate\t\t Votes\t Percentage");
        System.out.println("Awbrey\t\t\t "+ awbreyVote); */
        System.out.println("\t\t Awbrey");
        System.out.println(awbreyVote);
        System.out.println(awbreyPercentage);

     }
 }