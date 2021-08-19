package by.stormnet.EllaS;

import by.stormnet.EllaS.lesson5.Task1.Birds;


public class Main {

	public static void main(String[] args) {
		Birds Yas = new Birds();
		Yas.type = "Yastreb";
		Yas.weigh = 5;

		System.out.println(Yas.type + " " + Yas.weigh);

		Birds Vor = new Birds();
		Vor.type = "Vorobey";
		Vor.weigh = 0.3;
		System.out.println(Vor.type + " " + Vor.weigh);

		Birds Pin = new Birds();
		Pin.type = "Pingvin";
		Pin.weigh = 15.7;
		System.out.println(Pin.type + " " + Pin.weigh);
	}

}