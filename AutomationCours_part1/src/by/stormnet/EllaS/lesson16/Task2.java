package by.stormnet.EllaS.lesson16;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;

public class Task2 {
	public static void main(String[] args) {
		ArrayList<String> word = new ArrayList<>();
		Collections.addAll(word, "voin", "lavor", "voron", "beg", "vory");


		Optional<String> first = word.stream()
				.filter(wordWithoutSer -> wordWithoutSer.contains("vor"))
				.findFirst();
		first.ifPresentOrElse(
				v -> System.out.println("first word with vor- " + first),
				() -> System.out.println("No elements")
		);


	}

}




