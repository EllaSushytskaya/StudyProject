package by.stormnet.EllaS.InOutSystem;

import java.util.Arrays;
import java.util.Random;

public class IDcard {
	// TODO: 9/1/2021 This field can be final [Pavel.Chachotkin]
	// TODO: 9/1/2021 Fix field name [Pavel.Chachotkin]
	private int idCard;

	public IDcard(int idcard) {
		this.idCard = idcard;
	}


	// TODO: 9/1/2021 Method action does not according to method name [Pavel.Chachotkin]
	public static void isHasIDcard() {
		int[] idCardNumber = new int[10];
		for (int i = 0; i < idCardNumber.length; i++) {
			idCardNumber[i] = new Random().nextInt(10);
		}
		String generalIDCard = Arrays.toString(idCardNumber);
		System.out.println(generalIDCard);

	}





}

