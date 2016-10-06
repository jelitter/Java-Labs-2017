/*
	Part 2 - Name lengths
	Write a program which does the following
	
	Asks a user for their name
	Asks a second user for their name
	Print out the length of both names in the format - "John your name has 4 letters".
*/

import java.util.Scanner;

public class NameLengths
{
	public static void main (String[] args)
	{
		String  nameOne    = "";
		String  nameTwo    = "";
		Scanner myKeyboard = new Scanner(System.in);

		System.out.print("Enter name of the FIRST person: ");
		nameOne = myKeyboard.next();
		System.out.print("Enter name of the SECOND person: ");
		nameTwo = myKeyboard.next();
		
		System.out.println(nameOne + ", your name has " +nameOne.length()+ " letters." );
		System.out.println(nameTwo + ", your name has " +nameTwo.length()+ " letters." );
		System.out.println("Both together, your names have " + (nameOne.length()+nameTwo.length()) + " letters." );
	}
}
