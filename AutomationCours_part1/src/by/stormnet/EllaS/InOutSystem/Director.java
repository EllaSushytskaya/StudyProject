package by.stormnet.EllaS.InOutSystem;

public class Director extends Manager implements VIP {
	public Director(String name, String last_name) {
		super(name, last_name);
	}

	@Override
	public void VIPaccess() {
		System.out.println("Open door");
	}

}

