class LgTv {
    String color;
    int channel;
    boolean power;
    void power() { power = !power; }
    void channelUp() { ++channel; }
    void channelDown() { -- channel; }
}
public class TvTest {
    public static void main(String[] args) {
       LgTv[] t = new LgTv[3]; // 참조변수 t를 3개 생성한 것 뿐 아직 인스턴스는 생성 x 즉 맴버에 접근 불가
       for (int i = 0; i < t.length; i++) {
           t[i] = new LgTv(); // 이렇게 인덱스를 통해 직접 참조변수의 요소 하나하나 직접 인스턴스 생성
           t[i].channel = i+1;
           t[i].power = true;
       }
       for (int i = 0; i < t.length; i++) {
           System.out.println(t[i].channel);
           System.out.println(t[i].power);
       }


    }



}
