package com.assignment2;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
	
public static void main(String[] args) {
		GuessingGame gg = new GuessingGame();
		  gg.getRandom();
	}

//define global variables
	Scanner scan = new Scanner(System.in);	
	Scanner playAgain = new Scanner(System.in);	
	boolean win = false;
	int counter=0;	
	boolean again = false;
	
//get a random number
	public double getRandom(){
		Random rndNumbers = new Random();
          int max=500;
		int min=1;
		double rndNumber = rndNumbers.nextInt(max - min) + min;
		// TODO Auto-generated method stub
		  displayRandom(rndNumber);
		return rndNumber;	
		 }

//prompt the user for a guess
	private double  getGuess(double rndNumber){
		  System.out.println("Enter your guess");
		  double guess = scan.nextDouble();
//		  System.out.println(guess);
		  playGame(guess, rndNumber);
		  return guess;
		 }
	
//check to see if their guess matches the random number and increment the counter each time they enter the wrong guess
	private void playGame(double guess, double rndNumber){
		
		while(win==false){
		counter++;
		if (guess==rndNumber) {
			win=true;
			System.out.println("You got it! and it only took you " + counter + " tries");
			playAgain(rndNumber);
		}else if(guess>rndNumber){
			System.out.println("Lower");
			getGuess(rndNumber);
			
		}else if(guess<rndNumber){
			System.out.println("Higher");
			getGuess(rndNumber);
			
		}
		}//end while
	}
	
	
		//show the random number for debugging 
	private void displayRandom(double rndNumber){
		  System.out.println("Your number is " + rndNumber);
		getGuess(rndNumber);
		 }
	
	//ask the user if they want to play again, if yes then reinstantiate the getRandom() class to start the game over
	private void playAgain(double rndNumber){
		System.out.println("Wanna play again? Enter Y to play again");
		String playAgain = scan.next().toLowerCase().trim().toString();
//		System.out.println(newgame);
		System.out.println(playAgain);
		if(playAgain.equals("y")){
			GuessingGame gg = new GuessingGame();
			  gg.getRandom();
		}else{
			System.out.println("See ya!");
		}
	
		
	}
}
