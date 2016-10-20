package main;

public class CountryOperations {
	
	// CountryOperations should have three methods which do the following:
	// 	- A public method called calculateAverageCountryLength which calculates the average country name length and take the countryArray as a parameter and returns an int.
	// 	- A public method called getNumberOfCountriesBeginingWithLetterwhich counts the number of countries beginning with a letter or letters. It should take a String and the countryArrayas a parameters and return an int
	// 	- A public method called printMenu which prints the menu to user and takes no parameter and returns nothing.
	// getNumberOfCountriesBeginngWithLetter should output a sentence like "The number of countries beginning with Sp is 5"
	
	public int calculateAverageCountryLength (String[] countryNames) {
		int sum = 0;
	
		for(int i=0; i < countryNames.length; i++) {
			sum += countryNames[i].length();
		}
		return Math.round(sum/countryNames.length);
	}
	
	public int getNumberOfCountriesBeginningWithLetter (String[] countryNames, String str) {
		int numberCountries = 0;
		for(int i=0; i < countryNames.length; i++)
		{
			if (countryNames[i].toLowerCase().startsWith(str.toLowerCase(),0))
			{
				numberCountries++;
			}
		}
		System.out.println("The number of countries beginning with \"" + str + "\" is " + numberCountries);
		return numberCountries;
	}
	
	public void printMenu () {
		System.out.println("\n1. Calculate the average country length");
		System.out.println("2. Find the number of countries beginning with a letter sequence.");
		System.out.println("3. Exit.");
		System.out.print("Enter option: ");
		return;
	}
}
