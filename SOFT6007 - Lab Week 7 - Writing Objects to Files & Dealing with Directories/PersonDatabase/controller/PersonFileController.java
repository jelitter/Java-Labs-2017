package controller;
import java.io.*;
import model.PersonList;

public class PersonFileController implements Serializable {

	private static final long serialVersionUID = 1L;
	private File file;
	private PersonController pController;

	public PersonFileController(String fileName) {
		file = new File(fileName);
		pController = new PersonController();

	}
	public PersonList loadFile() {
		PersonList peopleList = null;
		try {
			if (!file.exists()) 
				file.createNewFile();
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			peopleList = (PersonList) ois.readObject();
			pController.setList(peopleList);
			ois.close();
			
		}
		catch (IOException e) {
			e.printStackTrace();
		} 
		catch (ClassNotFoundException ec) {
			ec.printStackTrace();
		}
		return peopleList;
	}
	
	public void saveFile(PersonList pl) {
		
		try {
			if (!file.exists()) 
				file.createNewFile();
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(pl);
			oos.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public PersonController getPController()
	{ return pController;
	}
}
