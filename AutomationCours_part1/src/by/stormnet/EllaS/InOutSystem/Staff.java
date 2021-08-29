package by.stormnet.EllaS.InOutSystem;

public class Staff extends Employee implements LocatedInOffice,RegisterEmployee {
	public Staff(String Name, String LastName, String Job) {
		super(Name,LastName,Job);
	}

	@Override
	public void locatedInOffice() {

	}

	@Override
	public void registerEmployee() {

	}
}

