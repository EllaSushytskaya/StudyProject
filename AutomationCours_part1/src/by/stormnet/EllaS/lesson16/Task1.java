package by.stormnet.EllaS.lesson16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Task1 {
	public static void main(String[] args) {
		ArrayList<String> word = new ArrayList<>();
		Collections.addAll(word, "served", "seriously", "sold", "sever", "service", "robotics");

		word.stream()
				.filter(wordWithoutSer -> !wordWithoutSer.contains("ser"))
				.sorted(Comparator.comparing(x -> x.length()))
				.forEach(System.out::println);
	}
}

