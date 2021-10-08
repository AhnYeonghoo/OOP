public class RepairableTest {
    public static void main(String[] args) {
        Tank3 tank = new Tank3();
        Dropship dropship = new Dropship();
        Marine3 marine3 = new Marine3();
        SCV scv = new SCV();
        Factory factory = new Factory();
        Barrack barrack = new Barrack();
        Academy academy = new Academy();
        Bunker bunker = new Bunker();
        factory.build();
        barrack.build();
        academy.build();
        bunker.build();

        scv.repair(tank);
        scv.repair(dropship);
        /* scv.repair(marine3); 마린은 Refairable 인터페이스를 구현하지 않아서 수리하는 메서드와 공통점이 업승ㅁ */

    }
}

interface Refairable {}

class Unit3 {  //최고 조상클래스인 유닛
    int hitPoint;
    final int MAX_HP;
    Unit3(int hp) { // 생성자
        MAX_HP = hp;
    }
}

class GroundUnit extends Unit3 {  //지상유닛은 유닛을 상속 받음
    GroundUnit(int hp) {
        super(hp);
    }
}
class AirUnit extends Unit3 { //에어유닛도 유닛을 상속 받음
    AirUnit(int hp) {
        super(hp);
    }
}

class Tank3 extends GroundUnit implements Refairable { // 탱크는 지상유닛을 상속받고 수리 인터페이스를 구현함
    Tank3() {
        super(150);
        hitPoint = MAX_HP;
    }
    public String toString() {
        return "Tank";
    }
}

class Dropship extends AirUnit implements Refairable { // 드랍쉽은 에어유닛을 상속받고 수리 인터페이스를 구현함
    Dropship() {
        super(125);
        hitPoint = MAX_HP;
    }
    public String toString() {
        return "Dropship";
    }
}

class Marine3 extends GroundUnit { //마린은 지상유닛을 상속받지만 수리를 못하기 때문에 지상유닛 조상만 받음
    Marine3() {
        super(40);
        hitPoint = MAX_HP;
    }
}

class SCV extends GroundUnit implements Refairable { // SCV또한 지상유닛을 상속받고 수리가 가능하기 때매 수리를 구현함
    SCV() {
        super(60);
        hitPoint = MAX_HP;
    }
    void repair(Refairable r) { // 수리하는 메서드  인터페이스 타입의 참조변수 r을 매개변수로 받음
        if (r instanceof Unit3){ // 참조변수 r을 받아서 Unit3의 자손인지 확인
            Unit3 u = (Unit3)r; // 참조변수 r을 unit3로 캐스팅하여 unit3 타입의 참조변수 u가 그것을 재참조
            //자손-> 조상으로 형변환 ok but 조상-> 자손 형변환 불가 조상보다 자손의 맴버가 더 많기 때문
            while(u.hitPoint!=u.MAX_HP) { // 탱크 인스턴스의 힛포인트가 풀피가 될 때 까지 반복
                u.hitPoint++; // 힛포인트를 1씩 증가
            }
            System.out.println(u.toString() + "의 수리가 끝났습니다."); //풀피가 되면 출력
        }
    }
    public void build() {
        System.out.println("건물을 짓습니다.");
    }
}
interface Liftable {
    void liftOff();
    void move(int x, int y);
    void stop();
    void land();
}

class LiftableImpl implements Liftable {
    public void liftOff() {
        System.out.println("건물이 뜹니다.");
    }
    public void move(int x, int y) {
        System.out.println("x축으로 " + x + " 이동,  y축으로 " + y + " 이동 완료");
    }
    public void stop() {
        System.out.println("이동 중단");
    }
    public void land() {
        System.out.println("건물을 착륙시킵니다.");
    }
}

class Buliding extends SCV {
    final int HP;
    Buliding(int hp) {
        HP = hp;
    }
    //SCV의 bulid 메서드 사용 가능
}

class Factory extends Buliding implements Liftable {
    Factory() {
        super(200);
    }
    LiftableImpl l = new LiftableImpl();
    public void liftOff() { l.liftOff(); }
    public void land() { l.land(); }
    public void stop() { l.stop(); }
    public void move(int x, int y) { l.move(x,y); }

    @Override
    public void build() {
        System.out.println("팩토리를 짓습니다.");
    }
}

class Barrack extends Buliding implements Liftable {
    Barrack() {
        super(200);
    }
    LiftableImpl l = new LiftableImpl();
    public void liftOff() { l.liftOff(); }
    public void land() { l.land(); }
    public void stop() { l.stop(); }
    public void move(int x, int y) { l.move(x,y); }
    @Override
    public void build() {
        System.out.println("배럭을 짓습니다.");
    }
}

class Academy extends Buliding {
    Academy() {
        super(100);
    }
    public void stimpackUpgrade() {
        System.out.println("스팀팩 업그레이드가 완료되었습니다.");
    }
    public void stimPack() {
        System.out.println("콰아아아 스팀팩 발동!");
    }
    @Override
    public void build() {
        System.out.println("아카데미를 짓습니다.");
    }
}

class Bunker extends Buliding {
    Bunker() {
        super(80);
    }
    @Override
    public void build() {
        System.out.println("벙커를 짓습니다.");
    }
}
