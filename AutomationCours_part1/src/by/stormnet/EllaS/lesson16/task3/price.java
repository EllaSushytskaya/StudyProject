package by.stormnet.EllaS.lesson16.task3;

import java.util.ArrayList;
import java.util.Collections;

public class price {
	private int value;

	private price(int value) {
		this.value = value;
	}

	public static void main(String[] args) {
		ArrayList<phone> phones = new ArrayList<>();
		Collections.addAll(phones,
				new phone("BB", 100),
				new phone("CCC", 200),
				new phone("A", 150));

	}
}
