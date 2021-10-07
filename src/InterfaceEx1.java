public class InterfaceEx1 {
}

interface PlayingCard {
    public static final int SPADE = 4;
    public static final int DIAMOND = 3;
    public static final int HEART = 2;
    public static final int CLOVER = 1;

    public abstract String getCardNumber();
    String getCardKind(); // 컴파일 시 public abstract이 자동으로 생성
    /* interface는 일종의 추상클래스이며 오직 추상메서드와 상수만을 허용한다.
    상수는 오로지 public static final 타입 변수명으로만 선언하여야 하며 생략 가능하고
    메서드는 오로지 public abstract 반환타입 메서드명으로만 선언 가능하며 선언부만 작성 가능하다.
    public abstract 또한 생략 가능하다 ** 컴파일러가 자동으로 생성해줌**
     */



}
