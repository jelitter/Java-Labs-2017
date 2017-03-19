package view;
import java.util.Scanner;

import controller.*;

public class PersonView {

	public static final int PRINT_OPTION = 1;
	public static final int ADD_OPTION = 2;
	public static final int EXIT_OPTION = 3;
	private PersonFileController fileController;
	
	private Scanner sc;
	
	public PersonView(String fileName) {
		fileController = new PersonFileController(fileName);
		sc = new Scanner(System.in);
	}
	
	public void printMenu() {
		System.out.println("==================");
		System.out.println(" 1. Print all people.");
		System.out.println(" 2. Add person.");
		System.out.println(" 3. Save & Exit.");
		System.out.println(" Enter option: ");
	}
	
	public int readOption() {
		int option = 0;
		do {
			printMenu();
			option = sc.nextInt();
		} while (option > EXIT_OPTION || option < PRINT_OPTION);
//		sc.close();
		return option;
	}
	
	public String readPersonName() {
		System.out.println("Enter person's name: ");
		return sc.next();
	}

	public int readPersonAge() {
		int a = 0;
		do {
			System.out.println("Enter person's age: ");
			a = sc.nextInt();
		} while (a <= 0);
		return a;
	}

	public PersonFileController getFileController() {
		return fileController;
	}

	public void setFileController(PersonFileController fileController) {
		this.fileController = fileController;
	}
	
	
}
