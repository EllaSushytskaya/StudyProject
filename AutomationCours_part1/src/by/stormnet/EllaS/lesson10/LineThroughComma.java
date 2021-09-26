package by.stormnet.EllaS.lesson10;

import java.util.ArrayList;
import java.util.List;

public class LineThroughComma {
	public static void main(String[] args) {
		// TODO: 9/8/2021 Where method catching list as parameter [Pavel.Chachotkin]
		ArrayList<String> stringArrayList = new ArrayList<>();
		stringArrayList.addAll(List.of("hello world", "hello java", "you are welcome"));
		System.out.println(String.join(",", stringArrayList));

	}


}
