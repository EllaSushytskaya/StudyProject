package by.stormnet.EllaS.inOutSystem;

import java.util.UUID;

public class IDcard {
	private String number;

	public IDcard() {
		this.number = generateIDcard();
	}

	// FIXME: 9/14/2021 This method only print idCard number and don't set it to field
	private String generateIDcard() {
		String number;
		number = UUID.randomUUID().toString().substring(0, 10);
		return number;
	}


	public String getNumber() {
		return number;
	}
}










