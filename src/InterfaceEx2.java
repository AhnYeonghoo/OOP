public class InterfaceEx2 {
    public static void main(String[] args) {
        Fighter f = new Fighter();

        if (f instanceof Unit)
            System.out.println("Fighter는  Unit 클래스의 자손입니다.");
        if (f instanceof Fightable)
            System.out.println("Fighter는 Fightable 인터페이스를 구현하였습니다.");
        if (f instanceof Movable)
            System.out.println("f는 Movable 인터페이스를 구현하였다.");
        if (f instanceof  Attackable)
            System.out.println("f는 Attackable 인터페이스를 구현했다.");
        if (f instanceof Object)
            System.out.println("f는 Object 클래스의 자손클래스입니다.");
    }
}
//Fighter 클래스는 유닛 클래스를 상속받은 자손 클래스이자 인터페이스 파이터블을 구현하는 클래스이다.
//즉 파이터블 인터페이스까지도 상속받는 격
class Fighter extends Unit implements Fightable {
    public void move(int x, int y) { /* 내용 생략 */}
    public void attack(Unit2 u) { /* 내용 생략 */ }
}


class Unit2 {
    int currentHP;
    int x, y;
}

interface Fightable extends Movable, Attackable { }
//인터페이스는 오직 추상메서드와 상수만을 가질 수 있음.
interface Movable { abstract public void move(int x, int y); }
interface Attackable { abstract public void attack(Unit2 u); }

