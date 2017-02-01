import java.util.Scanner;

public class WaterTankView {
	
	private Scanner keyboard;
	
	//constructor
	public WaterTankView() {
		 keyboard = new Scanner(System.in);
	}
	
	public void printMenu() {
		System.out.println("\n\nWater Tank");
		System.out.println("=========================");
		System.out.println("1. Add to Tank.");
		System.out.println("2. Remove from Tank");
		System.out.println("3. Display Current Volume");
		System.out.println("4. Exit");
		System.out.println("=========================");
		System.out.print("Enter option: ");
	}
	
	public int readOption() {
		return keyboard.nextInt();
	}

	public int addWater() {
		System.out.print("Add how many litres: ");
		return readOption();
	}

	public int removeWater() {
		System.out.print("Remove how many litres: ");
		return readOption();
	}

	public void print(String string) {
		System.out.println(string);
	}

	public void exitApp() {
		print("Exiting program.");		
	}
}
