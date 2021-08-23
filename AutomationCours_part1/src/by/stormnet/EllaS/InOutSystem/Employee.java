package by.stormnet.EllaS.InOutSystem;

import by.stormnet.EllaS.InOutSystem.IDcard;

public abstract class Employee {
	protected String name = "";
	protected String last_name = "";


	public Employee(String name, String last_name) {
		this.name = name;
		this.last_name = last_name;

	}

	static class idCard {
		public static void getIDcard() {
		}
	}

	public enum Status {
		InOffice,
		InOfficeWithoutCard,
		OutOffice;
	}
}


//	public static String getStatus(String Status) {
//		for (int i = 0; i < Status.values().length; i++) {
//			if (Status.values()[i] == Status.valueOf("InOffice")) {
//				return Status.values()[i].name();
//			}
//		}





