package by.stormnet.EllaS.InOutSystem;

public class DevOps extends Employee implements VIP {
	public DevOps(String name, String last_name) {
		super(name, last_name);
	}

	@Override
	public void VIPaccess() {
		System.out.println("Open door");
	}

}

