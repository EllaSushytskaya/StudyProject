package by.stormnet.EllaS.lesson16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;


public class task1 {
	public static void main(String[] args) {
		ArrayList<String> word = new ArrayList<>();
		Collections.addAll(word, "served", "seriously", "sold", "sever", "service");

		word.stream()
				.filter(wordWithoutSer -> wordWithoutSer.contains("ser"))
				.sorted(Comparator.comparing(x -> x.length()))
				.forEach(System.out::println);
	}
}

