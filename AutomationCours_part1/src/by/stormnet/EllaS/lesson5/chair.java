package by.stormnet.EllaS.lesson5;


public class chair {
    private int weight;

    public chair (int weight){
        this.weight=weight;
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
        chair Stul = new chair(5);
        chair.legs Legs = Stul.new legs();
        chair.back Back = Stul.new back();
        chair.seat Seat = Stul.new seat();

        Legs.stend();
        Back.lean();
        Seat.seatdown();
    }
}