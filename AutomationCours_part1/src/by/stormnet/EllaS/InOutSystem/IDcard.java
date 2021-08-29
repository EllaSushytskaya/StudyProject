package by.stormnet.EllaS.InOutSystem;

import java.util.Arrays;
import java.util.Random;

public class IDcard {
	private int idCard;

	public IDcard(int idcard) {
		this.idCard = idcard;
	}


	public static void isHasIDcard() {
		int[] idCardNumber = new int[10];
		for (int i = 0; i < idCardNumber.length; i++) {
			idCardNumber[i] = new Random().nextInt(10);
		}
		String generalIDCard = Arrays.toString(idCardNumber);
		System.out.println(generalIDCard);

	}





}

