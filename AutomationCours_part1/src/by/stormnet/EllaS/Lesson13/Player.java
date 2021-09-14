package by.stormnet.EllaS.Lesson13;

public class Player extends Thread {
		PlayingField playingField;
		String name;


		public Player(PlayingField playingField, String name) {
			this.playingField = playingField;
			this.name = name;
		}

		public void run() {
			for (int i = 0; i < 10; i++) {
				playingField.get();
			}
		}
	}





