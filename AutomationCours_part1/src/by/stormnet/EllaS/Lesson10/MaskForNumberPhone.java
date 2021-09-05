package by.stormnet.EllaS.Lesson10;

import java.util.regex.Pattern;

public class MaskForNumberPhone {
	public static void main(String[] args) {
		String numb1="\\d[\\d-]{1,7}\\d";
		String numb2="\\d \\(\\d{3}\\) [\\d]{3}-[\\d]{2}-[\\d]{2}";
		String numb3="\\+\\d{3}\\(\\d{2}\\)[\\d]{3}-[\\d]{2}-[\\d]{2}";
		Pattern pattern=Pattern.compile("");
		System.out.println(Pattern.matches(numb1, "123-45-67"));
		System.out.println(Pattern.matches(numb2, "8 (025) 123-45-67"));
		System.out.println(Pattern.matches(numb3, "+375(25)123-45-67"));
	}
}
