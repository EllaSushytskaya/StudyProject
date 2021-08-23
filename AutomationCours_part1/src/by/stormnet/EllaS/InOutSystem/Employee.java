package by.stormnet.EllaS.InOutSystem;

import by.stormnet.EllaS.InOutSystem.IDcard;

public abstract class Employee {
	protected String name = "";
	protected String last_name = "";
	protected boolean noteAboutPass;


	public Employee(String name, String last_name, boolean noteAboutPass) {
		this.name = name;
		this.last_name = last_name;
		this.noteAboutPass = noteAboutPass;
	}

	static class idCard {
		public static void getIDcard () {
		}
	}


	public enum Status {
		InOffice,
		InOfficeWithoutCard,
		OutOffice;
	}


}


