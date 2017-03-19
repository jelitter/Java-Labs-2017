import view.*;
import controller.*;


public class PersonApp {

	private final static String DATABASE = "database.txt";


	public static void main(String[] args) {

		PersonView view = new PersonView(DATABASE);
		PersonFileController pfController = view.getFileController();	
        PersonController pController = null;

        pfController.loadFile();

		int opt;
		pController = pfController.getPController();
		do {
			opt = view.readOption();
            
			switch (opt) {
			case (PersonView.PRINT_OPTION):
				System.out.println(pController.getList());

			break;
			case (PersonView.ADD_OPTION):
				String name = view.readPersonName();
			int age = view.readPersonAge();
			pController.addPerson(name, age);
			System.out.println(pController.getList());
			break;
			case (PersonView.EXIT_OPTION):
				pfController.saveFile(pController.getList());
				System.out.println("File saved.");
				System.exit(0);
			break;
			default:
				break;
			}
		} while (opt <= PersonView.EXIT_OPTION || opt >= PersonView.PRINT_OPTION);

	}

}
