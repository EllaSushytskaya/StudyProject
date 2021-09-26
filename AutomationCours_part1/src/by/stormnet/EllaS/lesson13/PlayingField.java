package by.stormnet.EllaS.lesson13;

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
		System.out.println("Скинул 1 карту");
		System.out.println("Карт осталось: " + card);
		System.out.println();
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
		System.out.println();
		notify();
	}



}









