package by.stormnet.EllaS.InOutSystem;

public class Director extends Manager implements VIP {
	public Director(String Name, String LastName, String Job) {
		super(Name,LastName,Job);
	}

	@Override
	public void VIPAccess() {
		System.out.println("Open door");
	}

}

