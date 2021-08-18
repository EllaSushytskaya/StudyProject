package by.stormnet.EllaS.lesson5;


public class task2 {
    private int weight;

    public chair(int weight) {

        this.weight = weight;
    }

    public class legs {
        public void stend() {
            System.out.println("Nogka");
        }

    }

    public class back {
        public void lean() {
            System.out.println("Spinka");
        }

    }

    public class seat {
        public void seatdown() {
            System.out.println("Sedushka");
        }

    }

    public static void main(String[] args) {
        task2 Stul = new task2(5);
        task2.legs Legs = Stul.new legs();
        task2.back Back = Stul.new back();
        task2.seat Seat = Stul.new seat();

        Legs.stend();
        Back.lean();
        Seat.seatdown();
    }
}