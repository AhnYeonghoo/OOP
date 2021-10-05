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
       LgTv[] tvArr = new LgTv[3];
       for (int i = 0; i < tvArr.length; i++) {
           tvArr[i] =  new LgTv();
           tvArr[i].channel = i+10;
       }
       for (int i = 0; i < tvArr.length; i++) {
           tvArr[i].channelUp();
           System.out.printf("tvArr[%d].channel = %d%n", i, tvArr[i].channel);
       }


    }



}
