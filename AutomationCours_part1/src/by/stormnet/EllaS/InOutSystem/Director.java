package by.stormnet.EllaS.InOutSystem;

public class Director extends Manager implements VIP {
	public Director(String Name, String LastName) {
		super(Name,LastName);
	}

	@Override
	public void VIPAccess() {
		System.out.println("Open door");
	}

}

