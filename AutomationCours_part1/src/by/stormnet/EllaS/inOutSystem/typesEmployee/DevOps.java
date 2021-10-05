package by.stormnet.EllaS.inOutSystem.typesEmployee;

import by.stormnet.EllaS.inOutSystem.Employee;
import by.stormnet.EllaS.inOutSystem.VIP;

public class DevOps extends Employee implements VIP {
	public DevOps(String name, String lastName) {
		super(name, lastName);
	}



	@Override
	public void pressOnKnob() {
	}


}

