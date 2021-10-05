public class DeckTest {
    public static void main(String[] args) {
        Deck d = new Deck();
        Card c = d.pick(0);
        System.out.println(c);
        d.shuffle();
        c = d.pick(0);
        System.out.println(c);


    }
}

class Deck {
    final int CARD_NUM = 52; //카드의 개수
    Card[] cardArr = new Card[CARD_NUM];  // Card 객체 배열을 포함 52개의 카드 객체의 배열 생성

    Deck() { //생성자
        int i = 0; // i = 0
        for (int k=Card.KIND_MAX; k >0; k--) { // K는 4부터 1까지 총 4번 반복
            for (int n = 0; n < Card.NUM_MAX; n++) { // n은 0부터 12까지 총 13번 반복
                cardArr[i++] = new Card(k, n+1); // 처음에 객체배열[0] = Card(4, 1)ㄹ
                // 부터 시작해서 객체배열 초기화
            }
        }
    }

    Card pick (int index) {
        return cardArr[index];
    }
    Card pick() {
        int index = (int)(Math.random() * CARD_NUM); // 0~51까지 랜덤 숫자
        return pick(index);
    }

    void shuffle() {
        for (int i = 0; i < cardArr.length; i++) {
            int r = (int)(Math.random() * CARD_NUM);

            Card temp = cardArr[i];
            cardArr[i] = cardArr[r];
            cardArr[r] = temp;
        }
    }

}

class Card {
    static final int KIND_MAX = 4; //카드 무늬의 수
    static final int NUM_MAX = 13; // 무늬별 카드 수

    static final int SPADE = 4;
    static final int DIAMOND = 3;
    static final int HEART = 2;
    static final int CLOVER = 1;
    int kind;
    int number;

    Card() { this(SPADE, 1); }  //기본 생성자 생성자 지정 안할시 종류는 스페이드, 수는 1
    Card(int kind, int number) { // 생성자
        this.kind = kind;
        this.number = number;
    };
    public String toString() {
        String[] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"}; // 문자열 배열 생성.
        String numbers = "0123456789XJQK"; //숫자 10은 X로 표현
        return "kind : " + kinds[this.kind] + ", number : " + numbers.charAt(this.number);
    }
}
