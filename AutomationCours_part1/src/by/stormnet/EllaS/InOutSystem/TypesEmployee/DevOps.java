package by.stormnet.EllaS.InOutSystem.TypesEmployee;

import by.stormnet.EllaS.InOutSystem.Employee;
import by.stormnet.EllaS.InOutSystem.VIP;

public class DevOps extends Employee implements VIP {
	public DevOps(String name, String lastName, String job, int idCard) {
		super(name, lastName, job, idCard);
	}

	@Override
	public void locatedInOffice() {
	}



	@Override
	public void VIPAccess() {
		System.out.println("Open door");
	}


}

