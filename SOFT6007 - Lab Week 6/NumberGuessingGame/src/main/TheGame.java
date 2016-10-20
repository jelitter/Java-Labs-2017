package main;
import java.util.Random;
import java.util.Scanner;

//	TheGame should declare and instantiate the following variables at class level
//	
//	An int variable to store the randomly generated number
//	An int variable to store the number of correct guesses in a row
//	A Random variable to store the instance of the Random class.
//	A public static final int constant to store the MAX_NUMBER random number which is possible in the game
//	TheGameshould also have three methods which do the following
//	
//	A public method called playTheGame which starts the game for the user. It should prompt them for their guess, generate a random number and print out a result.
//	A public method called printNoOfGuessesInARowwhich prints the number of guesses which they have guessed correctly in a row AND also prints the last number which they guessed correctly
//	A public method called printMenu which prints the menu to user and takes no parameter and returns nothing.

public class TheGame {

	public static final int MAX_NUMBER = 5;

	private Scanner myScanner = new Scanner(System.in);
	private int numberToGuess = 0;
	private int guessedNumber = 0;
	private int lastCorrectNumber = 0;
	private int numberofGuesses = 0;
	private Random rng = new Random();

	public void playTheGame() {		
		numberToGuess = rng.nextInt(MAX_NUMBER+1);

		System.out.print("Guess a number between 1 and " + MAX_NUMBER + ": ");
		guessedNumber = myScanner.nextInt();
		if (guessedNumber == numberToGuess) {
			numberofGuesses++;
			lastCorrectNumber = guessedNumber;
			System.out.println("You are right! The number is " + numberToGuess);			
		} else {
			numberofGuesses = 0;
			System.out.println("Incorrect guess! The number is not " + guessedNumber);
		}
	}

	public void printNoOfGuessesInARow() {		
		System.out.println("You guessed " + numberofGuesses + " numbers in a row!");
		if (lastCorrectNumber > 0)
			System.out.println("Your last guessed number is " + lastCorrectNumber);
		else
			System.out.println("You need to play the game first!");
	}

	public void printMenu() {
		System.out.println("\n1. Play the game.");
		System.out.println("2. Print Highscore.");
		System.out.println("3. Exit.");
		System.out.print("Enter option: ");
	}
}
