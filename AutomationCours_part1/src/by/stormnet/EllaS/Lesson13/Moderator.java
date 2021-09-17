package by.stormnet.EllaS.Lesson13;

public class Moderator extends Thread {
	PlayingField playingField;
	String name;

	public Moderator(PlayingField playingField, String name) {
		this.playingField = playingField;
		this.name=name;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Имя игрока: "+name);
			playingField.put();

		}
	}
}

