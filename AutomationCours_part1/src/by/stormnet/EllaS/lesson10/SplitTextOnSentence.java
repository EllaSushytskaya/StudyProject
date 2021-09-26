package by.stormnet.EllaS.lesson10;


public class SplitTextOnSentence {
	public static void main(String[] args) {
		String string = "Hello word. Hello Java.";
		String[] splitText = string.split("\\. ");
		for (String ss : splitText) {
			System.out.println(ss);
		}
	}

}
