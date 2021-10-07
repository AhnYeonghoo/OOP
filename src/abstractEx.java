public class abstractEx {
    public static void main(String[] args) {

    }
}
abstract class Player {
    boolean pause;
    int currentPos;

    Player() {
        pause = false;
        currentPos = 0;
    }
    /* 지정된 위치에서 재생을 시작하는 기능을 구현하라 */
    abstract void play(int pos);
    /* 재생을 즉시 멈추는 기능을 구현하라 */
    abstract void stop();

    void play() {
        play(currentPos);
    }
    void pause() {
        if (pause) {
            pause = !pause;
            play(currentPos);
        } else {
            pause = true;
            stop();
        }
    }
}

class CDPlayer extends Player {
    void play(int currentPos) {
        /* 조상의 추상메서드 기능을 구현 */
    }
    void stop() {
        /* 조상의 추상메서드를 구현 */
    }

    int currentTrack; // 현재 재생중인 트랙
    void nextTrack() {
        currentTrack++;
    }
    void preTrack() {
        if (currentTrack > 1) {
            currentTrack--;
        } else {
            System.out.println("첫 번째 곡 입니다.");
        }
    }
}
