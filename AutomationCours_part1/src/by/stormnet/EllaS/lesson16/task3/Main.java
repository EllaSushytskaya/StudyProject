package by.stormnet.EllaS.lesson16.task3;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		ArrayList<Phone> phones = new ArrayList<>();
		Collections.addAll(phones,
				new Phone("BB", 100),
				new Phone("CCC", 200),
				new Phone("A", 150));


		phones.stream()
				.sorted((p1, p2) -> {
					int compareByName = p1.getName().length() - p2.getName().length();
					if (compareByName == 0) {
						return p2.getPrice() - p1.getPrice();
					}
					return compareByName;
				})
				.forEach(System.out::println);
	}
}

