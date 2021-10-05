class Cardd {
    String kind;
    int number;
    static int width = 100;
    static int height = 250;
}
public class ivlv {
    public static void main(String[] args) {
        System.out.println(Cardd.width + Cardd.height);
        Cardd c1 = new Cardd();
        c1.kind = "Heart";
        c1.number = 6;

        Cardd c2 = new Cardd();
        c2.kind = "Spade";
        c2.number = 4;
        System.out.println(c1.kind);
        System.out.println(c1.number);
        System.out.println(c2.kind);
        System.out.println(c2.number);
        c1.width = 20;
        c1.height = 30;
        System.out.println(c2.width + c2.height);

    }
}
