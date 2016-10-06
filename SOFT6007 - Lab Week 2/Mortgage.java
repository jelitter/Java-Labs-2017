/*
	Part 3 - Simple Mortgage Calculator
	Write a program which does the following

	.
	Asks a user how much money they want to borrow
	Asks a user how many years they want to borrow it over
	Assuming an interest rate of 1% calculate how much they will have to pay back each month
*/

import java.util.Scanner;

public class Mortgage
{
	public static void main (String[] args)
	{
		int moneyAmount     = 0;
		int numberOfYears   = 0;
		double interestRate = 1.0;
		double monthlyFee   = 0.0;
		Scanner myKeyboard  = new Scanner(System.in);

		System.out.print("How much money do you want to borrow?: ");
		moneyAmount = myKeyboard.nextInt();

		System.out.print("In how many years do you want to pay back?: ");
		numberOfYears = myKeyboard.nextInt();

		monthlyFee = (moneyAmount*(100+interestRate )/100) / (numberOfYears*12);
		System.out.println("Your monthly fee will be " + (double) Math.round(monthlyFee * 100) / 100 + " EUR per month." );
	}
}

