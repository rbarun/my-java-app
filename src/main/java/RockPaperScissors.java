/*
 * Adharsh Babu
 * Rock Paper Scissors Program
 */

import java.util.Scanner;
import java.lang.Math;

public class RockPaperScissors {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		System.out.println("RockPaperScissors Game");
		System.out.println("Rock, Paper, Scissors, Shoot!");
		System.out.println("\tRock = 1");
		System.out.println("\tPaper = 2");
		System.out.println("\tScissors = 3");
		System.out.println("What is your decision?");
	
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		
		
		int random = (int) ((3)*Math.random() + 1);
		//System.out.println(random);
		
		if (choice == random){
		System.out.println("Tie! No one Wins!");
			
		}else if (choice == 1 && random == 3){
//rock vs. scissors
			System.out.println("The Computer's Option was Scissors! You Win!");
		}else if(choice == 1 && random == 2){
//rock vs. paper
			System.out.println("The Computer's Decision was Paper! You Lose!");
		
			
		}else if (choice == 2 && random ==1){
//paper vs. rock
		System.out.println("The Computer's Decision was Rock! You Win!");
		}else if (choice == 2 && random == 3){
//paper vs. scissors
		System.out.println("The Computer's Decision was Scissors! You Lose!");
		
		
		}else if (choice == 3 && random ==1){
//scissors vs. rock
		System.out.println("The Computer's Decision was Rock! You Lose!");
		}else if (choice == 3 && random == 2){
//scissors vs. paper
		System.out.println("The Computer's Decision was Paper! You Win!"); 
		
		}else{
			int comment = (int) ((3)*Math.random() + 1);
			switch (comment){
			case 1: System.out.println("Come on! That doesn't even exist!"); break;
			case 2: System.out.println("No Cheating!"); break;
			case 3: System.out.println("Huh? What's that!"); break;
			}
		}
		
	}

}


		
		
		



