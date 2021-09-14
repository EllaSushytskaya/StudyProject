package by.stormnet.EllaS.Lesson13;

public class Main {
	public static void main(String[] args) {
		PlayingField playingField = new PlayingField();
		for (int i = 0; i < 2; i++) {
			Player player=new Player(playingField, "Игрок"+i);
			Moderator moderator=new Moderator(playingField);
			new Thread(player).start();
			new Thread(moderator).start();
		}
	}
}



