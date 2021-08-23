package by.stormnet.EllaS.InOutSystem;

public abstract class Manager {
	protected String name = "";
	protected String last_name = "";
	protected boolean noteAboutPass;
	protected boolean noteAboutPass123;

	public Manager(String name, String last_name, boolean noteAboutPass, boolean noteAboutPass123) {
		this.name = name;
		this.last_name = last_name;
		this.noteAboutPass = noteAboutPass;
		this.noteAboutPass123 = noteAboutPass123;
	}


}




