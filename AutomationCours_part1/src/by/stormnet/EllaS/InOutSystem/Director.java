package by.stormnet.EllaS.InOutSystem;

public class Director extends Manager implements VIP {
	public Director(String name, String last_name, boolean noteAboutPass, boolean noteAboutPass123) {
		super(name, last_name, noteAboutPass, noteAboutPass123);
	}

	@Override
	public void VIPaccess() {
		System.out.println("Ручка нажата");
	}

}

