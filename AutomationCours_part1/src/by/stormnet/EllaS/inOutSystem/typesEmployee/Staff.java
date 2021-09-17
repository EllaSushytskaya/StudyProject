package by.stormnet.EllaS.inOutSystem.typesEmployee;

import by.stormnet.EllaS.inOutSystem.Employee;

public class Staff extends Employee implements LocatedInOffice {
	public Staff(String name, String lastName, int idCard, String status) {
		super(name, lastName, idCard, status);
	}

	@Override
	public void locatedInOffice() {

	}


}

