public class InnerEx1 {
    class InstanceInner {
        int iv = 100; // 인스턴스 변수 반드시 객체 생성 필요!
        static int cv = 100; // 스태틱 변수 인스턴스 생성 불필요!
        //클래스 메서드는 인스턴스 맴버와 교류가 없을 때 사용할 것을 권장
        // 클래스 변수는 공통된 값을 유지해야 할 때, 인스턴스 변수는 각 각의 인스턴스들이
        //고유한 값을 유지해야 할 때 사용한다.
        final static int CONST = 100; // 클래스 상수 선언
    }

    static class StaticInner {
        int iv = 200;
        static int cv = 200;
    }
    void myMethod() {
        class LocalInner {
            int iv = 300;
            //static int cv = 300; static 변수 선언 불가
            final static int CONST = 300;
        }
    }

    public static void main(String[] args) {
        System.out.println(InstanceInner.CONST);
        System.out.println(StaticInner.cv);
    }
}


