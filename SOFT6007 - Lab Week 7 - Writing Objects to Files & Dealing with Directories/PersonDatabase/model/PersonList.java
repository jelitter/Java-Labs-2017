package model;
import java.io.Serializable;
import java.util.ArrayList;

public class PersonList implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private ArrayList<Person> list;
	
	public PersonList() {

		list = new ArrayList<Person> ();
	}
	
	public PersonList(int size) {
		list = new ArrayList<Person> (size);
	}

	public ArrayList<Person> getList() {
		return list;
	}

	public void setList(ArrayList<Person> list) {
		this.list = list;
	}
	
	public String toString() {
		
		String finalList = "";
		
		for (Person p : list) {
			finalList += p.toString() + "\n";
		}
		return finalList;
		
	}
	
}
