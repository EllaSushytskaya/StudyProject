package by.stormnet.EllaS.Lesson10;

public class SplitTextOnWord {
	public static void main(String[] args) {
		String str = "You are welcome";
		String[] splitWord = str.split(" ");
		for (String s : splitWord) {
			System.out.println(s);
		}
	}

}
