package by.stormnet.EllaS.inOutSystem;

import java.util.UUID;

public class IDcard {
	private String number;

	public IDcard() {
		this.number = generateIDcard();
	}

	private String generateIDcard() {
		String number;
		number = UUID.randomUUID().toString().substring(0, 10);
		return number;
	}


	public String getNumber() {
		return number;
	}
}










