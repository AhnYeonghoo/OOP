public class Refresh {
    public static void main(String[] args) {
        Point11[] p = new Point11[]{
                                new Point11(100, 100),
                                new Point11(140, 50),
                                new Point11(200, 100)
                            };
        Triangle11 t = new Triangle11(p);
        Circle11 c = new Circle11(new Point11(150, 150), 50);
        t.draw();
        c.draw();

        Deck1 d = new Deck1();
        Card11 firstCard = d.pick(0);
        System.out.println(firstCard);
        d.shuffle();
        firstCard = d.pick(0);
        System.out.println(firstCard);
    }

}

class Deck1 {
    final int CARD_NUM = 52; // 카드의 개수
    Card11 cardArr[] = new Card11[CARD_NUM]; // 배열 객체 참조변수에 52개의 배열 인스턴스 생성

    Deck1() {
        int i = 0;
        for (int k = Card11.KIND_MAX; k > 0; k--) {
            for (int n = 0; n < Card.NUM_MAX; n++) {
                cardArr[i++] = new Card11(k, n+1);
            }
        }
    }
    Card11 pick(int index) { // 오버로딩
        return cardArr[index];
    }
    Card11 pick() {
        int index = (int)(Math.random() * CARD_NUM);
        return pick(index);
    }

    void shuffle() {
        for (int i = 0; i < cardArr.length; i++) {
            int r = (int) (Math.random() * CARD_NUM);

            Card11 temp = cardArr[i];
            cardArr[i] = cardArr[r];
            cardArr[r] = temp;
        }
    }
}

class Card11 {
    static final int KIND_MAX = 4; //카드 무늬
    static final int NUM_MAX = 13; //카드 숫자
    static final int SPADE = 4;
    static final int DIAMOND = 3;
    static final int HEART = 2;
    static final int CLOVER = 1;
    int kind;
    int number;

    Card11() {
        this(SPADE, 1);
    }
    Card11(int kind, int number) {
        this.kind = kind;
        this.number = number;
    }
    public String toString() {
        String[] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"};
        String numbers = "0123456789XJQK";
        return "kind: " + kinds[this.kind] + ", number: " +numbers.charAt(this.number);
    }
}

class Shape1 {
    String color = "black";
    void draw() {
        System.out.printf("[color=%s]%n", color);
    }
}
class Point11 {
    int x, y;

    Point11(int x, int y) {
        this.x = x;
        this.y = y;
    }
    Point11() {
        this(0,0);
    }
    String getXY(){
        return "("+x+","+y+")";
    }
}
class Circle11 extends Shape1 {
    Point11 center;
    int r;

    Circle11() {
        this(new Point11(0,0),100);
    }
    Circle11(Point11 center, int r) {
        this.center = center;
        this.r = r;
    }
    void draw() {
        System.out.printf("[center=(%d, %d), r=%d, color=%s]%n", center.x, center.y, r, color);
    }
}

class Triangle11 extends Shape {
    Point11 [] p = new Point11[3];

    Triangle11(Point11[] p) {
        this.p = p;
    }
    void draw() {
        System.out.printf("[p1=%s, p2=%s, p3=%s, color=%s]%n", p[0].getXY(), p[1].getXY(), p[2].getXY(),color);
    }
}

