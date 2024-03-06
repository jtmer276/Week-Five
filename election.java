/**************
Name: Jules Merrill
Date: 3/5/2024
Project: Election
 *********/

 import java.util.*;

 public class election{
     public static void main(String[] args){
        int awbreyVote;
        double awbreyPercentage;
        int martinezVote;
        double martinezPercentage;
        int totalVotes;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of Awbrey's votes: ");
        awbreyVote = input.nextInt();
        System.out.print("Enter the number of Martinez's votes: ");
        martinezVote = input.nextInt();
        totalVotes = martinezVote + awbreyVote;
        awbreyPercentage = (awbreyVote/totalVotes)*100;
        martinezPercentage = (martinezVote/totalVotes)*100;
        System.out.println("Candidate\t\t Votes\t Percentage");
        System.out.println("Awbrey\t\t\t "+ awbreyVote + awbreyPercentage);


     }
 }