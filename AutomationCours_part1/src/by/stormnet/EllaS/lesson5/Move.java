package by.stormnet.EllaS.lesson5;


public class Move {
    private int weight2;
    public Move(int weight) {

        this.weight2 = weight;
    }

    public class Auto  {
        public class exemple {
            public void go() {
                System.out.println("Врум-Врум");
            }
        }
    }
    public class Bicycle  {
        public class exemple {
            public void go() {
                System.out.println("Шарк-Шарк");
            }
        }
    }
    public class Snail  {
        public class exemple {
            public void go() {
                System.out.println("шлеп");
            }
        }
    }
    public static void main(String[] args) {
        Move move = new Move(5);
        Move.Auto auto = move.new Auto();
        Move.Bicycle bicycle = move.new Bicycle();
        Move.Snail snail = move.new Snail();


        Auto.exemple.go();
        Bicycle.exemple.go();
        Snail.exemple.go();


    }





    }





























