package by.stormnet.EllaS.InOutSystem.TypesEmployee;

import by.stormnet.EllaS.InOutSystem.LocatedInOffice;
import by.stormnet.EllaS.InOutSystem.VIP;

public class AssistentDirector extends Manager implements VIP, LocatedInOffice {
	public AssistentDirector(String name, String lastName, String job, int idCard) {

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

