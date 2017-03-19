package controller;
import model.*;

public class PersonController  {
	
	private PersonList list;
	
	public PersonController() {
		list = new PersonList();
	}
	
	public void addPerson(Person p) {
		list.getList().add(p);
	}
	
	public void addPerson(String _name, int _age) {
		list.getList().add(new Person(_name, _age));
	}

	public PersonList getList() {
		return list;
	}

	public void setList(PersonList list) {
		this.list = list;
	}

	


}
