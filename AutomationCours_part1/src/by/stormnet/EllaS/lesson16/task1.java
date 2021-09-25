package by.stormnet.EllaS.lesson16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class task1 {
	public static void main(String[] args) {
		ArrayList<String> word = new ArrayList<>();
		Collections.addAll(word, "serviz", "servant", "loser", "sever", "server");

		word.stream()
				.filter(wordWithoutSer -> wordWithoutSer.contains("ser"))
				.sorted()
				.forEach(System.out::println);
	}
}

