package by.stormnet.EllaS.Lesson13;

public class Moderator extends Thread {
	PlayingField playingField;

	public Moderator(PlayingField playingField) {
		this.playingField = playingField;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			playingField.put();
		}
	}
}

