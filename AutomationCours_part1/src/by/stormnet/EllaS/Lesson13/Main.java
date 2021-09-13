package by.stormnet.EllaS.Lesson13;



public class Main {

	public static void main(String[] args) {
		PlayingField playingField = new PlayingField();
		for (int i = 0; i < 3; i++) {
			Thread t = new Thread(new Player(playingField, "Игрок" + i));
			t.setName("Игрок" + i);
			t.start();
		}

	}

}

