import java.util.Scanner;

public class FindCountries {

	// Part 2 - Find countries which contain a user supplied String                                                            
	// 1. Again uses the statically intialized array below.                                                                    
	// 2. Ask the user "Would you like to check how many countries begin with a String ?"                                      
	// 3. Then asks the user "What String do you want to check ?"                                                              
	// 4. A message should be printed out saying "The following countries begin with whatever string they entered"             
	// 5. The program should then go through all the countries and print each one which contains this String as it finds them  
	// 6. Once it has found all the countries it should ask the user "Do you want to check another String (y/n) ?"             
	// 7. If they answer 'y' then it should return to Step 3 above and allow them to check another String                      

	public static String[] countryNames = {"Afghanistan","Albania","Algeria","Andorra","Angola","Antigua and Barbuda","Argentina","Armenia","Aruba","Australia","Austria","Azerbaijan", "The Bahamas","Bahrain","Bangladesh","Barbados","Belarus","Belgium","Belize","Benin","Bhutan","Bolivia","Bosnia and Herzegovina","Botswana","Brazil", "Brunei", "Bulgaria", "Burkina Faso", "Burma", "Burundi", "Cambodia","Cameroon","Canada", "Cabo Verde","Central African Republic","Chad","Chile","China","Colombia","Comoros","Democratic Republic of the Congo", "Republic of the Congo","Costa Rica","Cote d'Ivoire","Croatia","Cuba","Curacao","Cyprus","Czech Republic", "Denmark","Djibouti","Dominica", "Dominican Republic", "East Timor","Ecuador","Egypt","El Salvador","Equatorial Guinea","Eritrea","Estonia","Ethiopia", "Fiji", "Finland", "France", "Gabon","Gambia, The","Georgia","Germany","Ghana","Greece","Grenada","Guatemala","Guinea","Guinea-Bissau","Guyana", "Haiti","Holy See","Honduras","Hong Kong","Hungary", "Iceland","India","Indonesia","Iran","Iraq","Ireland","Israel","Italy", "Jamaica","Japan","Jordan", "Kazakhstan","Kenya","Kiribati","North Korea","South Korea","Kosovo","Kuwait","Kyrgyzstan", "Laos","Latvia","Lebanon","Lesotho","Liberia","Libya","Liechtenstein","Lithuania","Luxembourg", "Macau","Macedonia","Madagascar","Malawi","Malaysia","Maldives","Mali","Malta","Marshall Islands","Mauritania","Mauritius","Mexico","Micronesia", "Moldova","Monaco","Mongolia","Montenegro","Morocco","Mozambique", "Namibia","Nauru","Nepal","Netherlands","New Zealand","Nicaragua","Niger","Nigeria","Norway", "Oman", "Pakistan","Palau","Palestinian Territories","Panama","Papua New Guinea","Paraguay","Peru","Philippines","Poland", "Portugal", "Qatar", "Romania","Russia", "Rwanda", "Saint Kitts and Nevis", "Saint Lucia","Saint Vincent and the Grenadines","Samoa","San Marino","Sao Tome and Principe","Saudi Arabia", "Senegal","Serbia","Seychelles","Sierra Leone","Singapore","Sint Maarten","Slovakia","Slovenia","Solomon Islands","Somalia","South Africa", "South Korea","South Sudan","Spain","Sri Lanka","Sudan","Suriname","Swaziland", "Sweden","Switzerland","Syria", "Taiwan","Tajikistan","Tanzania","Thailand","Timor-Leste","Togo","Tonga","Trinidad and Tobago","Tunisia","Turkey","Turkmenistan","Tuvalu", "Uganda","Ukraine","United Arab Emirates","United Kingdom","Uruguay","Uzbekistan", "Vanuatu","Venezuela","Vietnam", "Yemen", "Zambia","Zimbabwe"};

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.print("\nWould you like to check how many countries begin with a String? [y/n] : ");
		while (keyboard.next().toLowerCase().charAt(0) == 'y')
		{
			searchCountry();
			System.out.print("\nDo you want to check another String? [y/n] : ");
		}
		System.out.println("Bye!");
	}

	public static void searchCountry() 
	{
		Scanner search = new Scanner(System.in);
		String  needle = "";

		System.out.print("What String do you want to check? : ");
		needle = search.next();

		System.out.println("The following countries begin with: " + needle);
		for(int i=0; i < countryNames.length; i++)
		{
			if (countryNames[i].toLowerCase().startsWith(needle.toLowerCase(),0))
			{
				System.out.println("  -> " + countryNames[i].trim());
			}
		}
	}
}
