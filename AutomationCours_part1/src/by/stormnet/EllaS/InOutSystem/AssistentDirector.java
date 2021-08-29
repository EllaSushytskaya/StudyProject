package by.stormnet.EllaS.InOutSystem;

public class AssistentDirector extends Manager implements VIP,LocatedInOffice,RegisterEmployee {
	public AssistentDirector(String Name, String LastName, String Job) {
		super(Name, LastName, Job);
	}

	@Override
	public void locatedInOffice() {

	}

	@Override
	public void registerEmployee() {

	}

	@Override
	public void VIPAccess() {
		System.out.println("Open door");
	}
}

