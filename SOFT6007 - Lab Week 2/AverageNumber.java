/*
	Part 1 - Calculate the average number
	Write a program which asks the user for three numeric values
	It should output the average of the three numbers to the user at the end.
*/

import java.util.Scanner;

public class AverageNumber
{
	public static void main (String[] args)
	{
		int firstNumber   = 0;
		int secondNumber  = 0;
		int thirdNumber   = 0;
		Scanner myScanner = new Scanner(System.in);

		System.out.print("Enter first number: ");
		firstNumber = myScanner.nextInt();
		System.out.print("Enter second number: ");
		secondNumber = myScanner.nextInt();
		System.out.print("Enter third number: ");
		thirdNumber = myScanner.nextInt();
		
		System.out.println("The average of " + firstNumber + ", " + secondNumber + " and " + thirdNumber + " is " + (float) (firstNumber+secondNumber+thirdNumber)/3 + ".");
	}
}
