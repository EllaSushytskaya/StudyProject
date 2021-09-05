package by.stormnet.EllaS.Lesson10;

import java.util.ArrayList;
import java.util.List;

public class LineThroughComma {
	public static void main(String[] args) {
		ArrayList<String> stringArrayList = new ArrayList<>();
		stringArrayList.addAll(List.of("hello world", "hello java", "you are welcome"));
		System.out.println(String.join(",", stringArrayList));

	}


}
