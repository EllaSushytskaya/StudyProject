package by.stormnet.EllaS.InOutSystem;

import java.util.Arrays;
import java.util.Random;

public class IDcard {
	private final int idCard;

	public IDcard(int idCard) {
		this.idCard = idCard;
	}

	// FIXME: 9/14/2021 This method only print idCard number and don't set it to field
	public static void generateIDcard() {
		int[] idCardNumber = new int[10];
		for (int i = 0; i < idCardNumber.length; i++) {
			idCardNumber[i] = new Random().nextInt(10);
		}
		String generalIDCard = Arrays.toString(idCardNumber);
		System.out.println(generalIDCard);
	}


}







