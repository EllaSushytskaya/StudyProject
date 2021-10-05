package by.stormnet.EllaS.inOutSystem.typesEmployee.heirsManager;

import by.stormnet.EllaS.inOutSystem.VIP;

public class Director extends Manager implements VIP {
	public Director(String name, String lastName) {

		super(name, lastName);
	}


	@Override
	public void pressOnKnob() {
	}

}

