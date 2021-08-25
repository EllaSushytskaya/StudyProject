package by.stormnet.EllaS.InOutSystem;

public class DevOps extends Employee implements VIP {
	public DevOps(String Name, String LastName) {
		super(Name, LastName);
	}

	@Override
	public void VIPAccess() {
		System.out.println("Open door");
	}

}

