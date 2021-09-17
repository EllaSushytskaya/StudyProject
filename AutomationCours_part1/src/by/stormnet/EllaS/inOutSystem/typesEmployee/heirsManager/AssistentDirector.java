package by.stormnet.EllaS.inOutSystem.typesEmployee.heirsManager;

import by.stormnet.EllaS.inOutSystem.VIP;

public class AssistentDirector extends Manager implements VIP {
	public AssistentDirector(String name, String lastName,  int idCard, String status) {

		super(name, lastName, idCard, status);
	}




	@Override
	public void VIPAccess() {
		System.out.println("Open door");
	}
}

