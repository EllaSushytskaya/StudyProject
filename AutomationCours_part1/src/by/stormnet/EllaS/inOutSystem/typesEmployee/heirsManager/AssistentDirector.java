package by.stormnet.EllaS.inOutSystem.typesEmployee.heirsManager;

import by.stormnet.EllaS.inOutSystem.VIP;

public class AssistentDirector extends Manager implements VIP {
	public AssistentDirector(String name, String lastName) {

		super(name, lastName);
	}


	@Override
	public void pressOnKnob() {
	}
}

