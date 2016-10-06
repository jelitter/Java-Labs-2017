import java.util.Scanner;


public class CountryRater {

	public static void main(String[] args)
	{
		//Declare all your variables
		int numberOfCountries = 0;
		//NOTE : The arrays are declared here but at this point we don't know how many slots we want in the arrays. 
		//Therefore we declare here and allocate the space later when we know how many countries we will be dealing with.
		String[] countryNames = null;
		int[] countryScores = null;
		int runningTotal = 0;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many countries have you visited ?");
		numberOfCountries = keyboard.nextInt();
		
		//Allocate the country names array to have the same amount of spaces as countries.
		countryNames = new String[numberOfCountries];
		//Allocate the country scores array to have the same amount of spaces as countries.
		countryScores = new int[numberOfCountries];

		
		//Now ask for the country names
		for(int i=0; i<countryNames.length; i++)
		{
			System.out.println("What is the name of country "+(i+1)+" : ");
			//As you receive each country name store it in the next position in the String[] countryNames.
			//Remember i points at the position in the array that we are currently interested in filling.
			countryNames[i] = keyboard.next();
		}
				
		//Now ask for the scores for each country.
		for(int i=0; i<countryScores.length; i++)
		{
			//countryNames is already populated (from above) so use this to fill in the name of each country.
			System.out.println("What is the score for "+countryNames[i] + " ? ");
			//As you receive each country score store it in the next position in the int[] countryScores
			//Remember again that i points at the position in the array that we are currently interested in filling.
			countryScores[i] = keyboard.nextInt();			
		}
		
		//Total up all the scroes in countryScores array.
		for(int i=0; i<countryScores.length; i++)
		{
			runningTotal += countryScores[i];
		}
		
		//Print the final message and concatenate the average calculation on the end.
		System.out.println("You have visited "+numberOfCountries+" countries and the average rating is "+runningTotal/numberOfCountries);
		
	}
	
}