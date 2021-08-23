package by.stormnet.EllaS.InOutSystem;

public class AssistentDirector extends Manager implements VIP {
	public AssistentDirector(String name, String last_name) {
		super(name, last_name);
	}

	@Override
	public void VIPaccess(){
		System.out.println("Open door");
	}
}

