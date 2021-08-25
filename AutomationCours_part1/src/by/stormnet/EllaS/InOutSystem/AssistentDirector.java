package by.stormnet.EllaS.InOutSystem;

public class AssistentDirector extends Manager implements VIP {
	public AssistentDirector(String Name, String LastName) {
		super(Name, LastName);
	}

	@Override
	public void VIPAccess() {
		System.out.println("Open door");
	}
}

