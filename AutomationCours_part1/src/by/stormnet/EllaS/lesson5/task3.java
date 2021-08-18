package by.stormnet.EllaS.lesson5;


public class task3 {
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
        task3 move = new task3(5);
        task3.Auto auto = move.new Auto();
        task3.Bicycle bicycle = move.new Bicycle();
        task3.Snail snail = move.new Snail();

        Auto.exemple.go();
        Bicycle.exemple.go();
        Snail.exemple.go();



    }





    }





























