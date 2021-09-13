package by.stormnet.EllaS.Lesson13;

class Player implements Runnable {
	PlayingField playingField;
	String name;


	Player(PlayingField playingField, String name) {
		this.playingField = playingField;
		this.name = name;

	}

	public void run() {
		for (int i = 1; i < 10; i++) {
			playingField.get();
		}
	}

	public void setName(){


}


}


