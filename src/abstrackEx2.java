public class abstrackEx2 {
    public static void main(String[] args) {
        Unit[] group = new Unit[4];
        group[0] = new Marine();
        group[1] = new Tank();
        group[2] = new Marine();
        group[3] = new DropShip();
        //모든 유닛들을 공통적으로 이동시킬 수 있다.
        for (int i = 0; i < group.length; i++)
            group[i].move(100,200);

    }

}

abstract class Unit {
    int x, y;
    abstract void move(int x, int y);
    void stop() { /* 현재 위치에 정지 */ }
}
class Marine  extends Unit{
    int x, y;
    void move(int x, int y) { /* 지정된 위치로 이동하는 메서드 */}
    void stop() { /*현재 위치에 정지 */ }
    void stimPack() { /* 스팀팩을 사용한다 */ }
}
class Tank extends Unit{
    int x, y;
    void move(int x, int y) { /* 지정된 위치로 이동하는 메서드 */ }
    void stop() { /*현재 위치에 정지 */ }
    void changeMode() {/*공격 모드를 전환한다. */}
}
class DropShip extends Unit{
    int x, y;
    void move(int x, int y) { /* 지정된 위치로 이동하는 메서드(중복 메서드 3) */}
    void stop() { /* 현재 위치에 정지 */ }
    void load() { /* 선택된 대상을 픽업 */ }
    void unload() {/* 내리게 하기 */ }
}


