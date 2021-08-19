package by.stormnet.EllaS.lesson5.Task2;

import by.stormnet.EllaS.lesson5.Chair;

public class Main {
	public static void main(String[] args) {

		Chair Stul = new Chair();
		Chair.Legs legs = Stul.new Legs();
		Chair.Back back = Stul.new Back();
		Chair.Seat seat = Stul.new Seat();

		legs.stend();
		back.lean();
		seat.seatdown();
	}
}