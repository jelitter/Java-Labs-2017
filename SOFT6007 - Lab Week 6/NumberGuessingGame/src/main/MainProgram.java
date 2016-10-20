package main;
import java.util.Scanner;

//	MainProgram should contain the have three private constants for the three menu options
//	
//	It should do the following :
//	
//	Display a menu to the user asking if they want to :
//		Play The Game
//		Print Highscore
//		Exit.
//	A Scanner should be used to capture the users input when choosing an option
//	A while loop should keep running allowing them to keep choosing 1 or 2 as they wish. Once they enter 3 the program should exit.
//	A switch statement should be provided within the while loop to process the users choice
//	It should create an instance of TheGame in main and call its methods as appropriate.
//	If the user enters an invalid option (i.e. Not 1,2 or 3) they should get this message "You have entered an invalid option."

public class MainProgram {
	
	public static final int PLAY_THE_GAME = 1;
	public static final int PRINT_HIGHSCORE = 2;
	public static final int EXIT_GAME = 3;

	public static void main(String[] args) {
		TheGame myGame = new TheGame();
		Scanner myScanner = new Scanner(System.in);
		int input = 0;

		while (input != 3)
		{
			myGame.printMenu();
			input = myScanner.nextInt();

			switch (input) 	{
			case PLAY_THE_GAME:
				myGame.playTheGame();
				break;
			case PRINT_HIGHSCORE:
				myGame.printNoOfGuessesInARow();
				break;
			case EXIT_GAME:
				System.out.println("Bye!");
				break;
			default:
				System.out.println("Incorrect option!");
				break;
			}
		}
		myScanner.close();
	}
}

