public class FinalCardTest {
    public static void main(String[] args) {
        Card1 c = new Card1("HEART", 10);
        System.out.println(c.KIND);
        System.out.println(c.NUMBER);;
        System.out.println(c);


    }

}
class Card1 {
    final int NUMBER;
    final String KIND;
    static int width = 100;
    static int height = 250;

    Card1(String kind, int num) {
        super();
        this.KIND = kind;
        this.NUMBER = num;
    }
    Card1() {
        this("HEART", 1);
    }

    public String toString() {
        return KIND + " " + NUMBER;
    }
}

