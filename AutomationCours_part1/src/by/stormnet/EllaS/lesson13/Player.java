package by.stormnet.EllaS.lesson13;

public class Player extends Thread {
	PlayingField playingField;


	public Player(PlayingField playingField) {
		this.playingField = playingField;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			playingField.get();
		}
	}
}





