public class CastingTest1 {
    public static void main(String[] args) {


        Car car = null; // Car 타입의 참조변수 car는 생성하였으나 인스턴스는 아직 생성 x
        //참조변수가 가리키는 주소는 없고 null을 가리킴.
        FireEngine fe = new FireEngine();
        ;
        FireEngine fe2 = null;

        fe.water();
        car = fe; // 자손 -> 조상 형변환 생략 가능
        fe2 = (FireEngine) car; // 조상 -> 자손으로 형변환은 반드시 캐스팅 문법!
        fe2.water();
    }

}

class Car {
    String color;
    int door;
    void drive() {
        System.out.println("drive, brrrr~");
    }
    void stop() {
        System.out.println("stop!!");
    }
}

class FireEngine extends Car {
    void water() {
        System.out.println("water!!");
    }
}
