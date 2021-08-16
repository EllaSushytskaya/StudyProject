package by.stormnet.EllaS.lesson5;

public class birds {

    String type;
    double weigh;
    double sumweight;

    {
        this.type = "Undefined";
        this.weigh = 0;
    }
    public double getSumweight(){
        return sumweight;
    }
    public final String getType(){
        return type;
    }
    public final double getWeigh(){
        return weigh;
    }

    public static void main(String[] args) {
        birds Yas = new birds();
        Yas.type = "Yastreb";
        Yas.weigh = 5;

        System.out.println(Yas.type + " " + Yas.weigh);

        birds Vor = new birds();
        Vor.type = "Vorobey";
        Vor.weigh = 0.3;
        System.out.println(Vor.type + " " + Vor.weigh);

        birds Pin = new birds();
        Pin.type = "Pingvin";
        Pin.weigh = 15.7;
        System.out.println(Pin.type + " " + Pin.weigh);

    }

}