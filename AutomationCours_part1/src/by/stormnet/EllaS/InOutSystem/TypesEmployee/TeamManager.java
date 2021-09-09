package by.stormnet.EllaS.InOutSystem.TypesEmployee;

import by.stormnet.EllaS.InOutSystem.LocatedInOffice;

public class TeamManager extends Manager implements LocatedInOffice {
	public TeamManager(String name, String lastName, String job, int idCard) {
		super(name, lastName, job, idCard);
	}

	@Override
	public void locatedInOffice() {

	}


}
