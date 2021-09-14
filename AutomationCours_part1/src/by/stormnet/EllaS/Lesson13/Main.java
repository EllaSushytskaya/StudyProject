package by.stormnet.EllaS.Lesson13;

public class Main {
	public static void main(String[] args) {
		PlayingField playingField = new PlayingField();
		for (int i = 0; i < 1; i++) {
			Player player=new Player(playingField);
			Moderator moderator=new Moderator(playingField, "Игрок  "+ i);
			new Thread(player).start();
			new Thread(moderator).start();
		}
	}
}



