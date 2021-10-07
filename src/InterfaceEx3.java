public class InterfaceEx3 {
    public static void main(String[] args) {
        TVCR2 tvcr2 = new TVCR2();
        tvcr2.play();
        tvcr2.setCounter(5);
        tvcr2.getCounter();
        tvcr2.stop();
        tvcr2.power();
        tvcr2.channel = 10;
        tvcr2.channelUp();
        System.out.println(tvcr2.channel);

    }
}

class Tv4 {
    protected boolean power;
    protected int channel;
    protected int volume;

    public void power() { power = !power; }
    public void channelUp() { channel++; }
    public void channelDown() { channel--; }
    public void volumeeUp() { volume++; }
    public void volumeDown() { volume--; }
}
class VCR2 {
    protected int counter;
    public void play() {
        System.out.println("재생");
    }
    public void stop() {
        System.out.println("스탑");
    }
    public void reset() {
        System.out.println("리셋");
    }
    public void setCounter(){ counter = 0;}
    public int getCounter() { return counter; }
    public void setCounter(int c) { counter = c;}
}

interface IVCR2 {
    public void play();
    public void stop() ;
    public void reset() ;
    public int getCounter() ;
    public void setCounter(int c);
}
class TVCR2 extends Tv4 implements IVCR2 {
    VCR2 vcr = new VCR2();
    public void play() {
        vcr.play();
    }
    public void stop() {
        vcr.stop();
    }
    public void reset() {
        vcr.reset();
    }
    public int getCounter() {
        return vcr.getCounter();
    }
    public void setCounter(int c) {
        vcr.setCounter();
    }


}

