package by.stormnet.EllaS.Lesson13;


public class PlayingField {
	private int card = 10;


	public synchronized void get() {
		while (card < 1) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		card--;
		System.out.println("Скинули 1 карту");
		System.out.println("Игрок 1");
		System.out.println("Карт осталось: " + card);
		notify();
	}


}




