package by.stormnet.EllaS.InOutSystem;

public class DevOps extends Employee implements VIP {
	public DevOps(String name, String last_name, boolean noteAboutPass) {
		super(name, last_name, noteAboutPass);
	}

	@Override
	public void VIPaccess() {
		System.out.println("Ручка нажата");
	}

}

