package by.stormnet.EllaS.InOutSystem.TypesEmployee;

import by.stormnet.EllaS.InOutSystem.Employee;
import by.stormnet.EllaS.InOutSystem.LocatedInOffice;

public class Staff extends Employee implements LocatedInOffice  {
	public Staff(String name, String lastName, String job, int idCard) {
		super(name,lastName,job, idCard);
	}

	@Override
	public void locatedInOffice() {

	}


}

