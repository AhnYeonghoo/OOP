public class interfaceTest2 {
    public static void main(String[] args) {
        A2 a2 = new A2();
        a2.methodA();
    }
}

class A2 {
    void methodA() {
        I2 i = InstanceManager.getInstance(); // 인터페이스 타입의 참조변수 i는 인스턴스 B2의 주소를 가리킴
        i.methodB();  //참조변수 i가 b2의 주소를 가리키기 때문에 메소드B를 실행
        System.out.println(i.toString()); //
    }
}

interface I2 {
    public abstract void methodB();
}

class B2 implements I2 {
    public void methodB() {
        System.out.println("methodB in B class");
    }
    public String toString() { return "class B";}
}
class InstanceManager {
    public static I2 getInstance() { //클래스 메서드 겟인스턴스는 반환타입이 인터페이스 I임
        return new B2();  //실제로 인터페이스 I2를 구현한 B2를 인스턴스로 반환
    }
}