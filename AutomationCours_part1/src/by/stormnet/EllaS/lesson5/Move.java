package by.stormnet.EllaS.lesson5;
public class Move {

    public void auto() {
        System.out.println("Врум-Врум");
    }

    public void bycicle() {
        System.out.println("Шарк-Шарк");
    }
    public void snail() {
        System.out.println("Шлеп");
    }

    public static void main(String[] args) {
        Move go = new Move();
        go.auto();
        go.bycicle();
        go.snail();



    }
}










