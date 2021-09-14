package by.stormnet.EllaS.Lesson13;

public class PlayingField {
	private int card = 10;
	String name=" ";

	synchronized void put() {
		while (card > 10) {
			try {
				wait(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		card--;
		System.out.println("Скинули 1 карту");
		System.out.println("Карт осталось: " + card);
		notify();
	}
	synchronized void get() {
		while (card >= 10) {
			try {
				wait(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		card++;
		System.out.println("Ведущий забрал 1 карту");
		System.out.println("Карт стало: " + card);
		notify();
	}



}









