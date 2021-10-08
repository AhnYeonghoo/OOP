public class InnerEx2 {
    class InstanceInner2 {}
    static class StaticInner2 {}

    //인스턴스 맴버 간에는 서로 직접 접근이 가능하다
    InstanceInner2 ic = new InstanceInner2();
    //static 맴버 간에는 서로 직접 접근이 가능하다 but static이 인스턴스를 건들 순 없음.
    StaticInner2 sc = new StaticInner2();

    static void staticMethod2() {
        //static 맴버는 인스턴스 맴버에 접근할 수 없다.
        //InstanceInner2 obj = new InstanceInner2(); -> 인스턴스 클래스이므로 접근 불가
        StaticInner2 obj  = new StaticInner2(); // 스태틱 맴버에는 접근 가능

        //굳이 접근하려면 아래와 같이 객체를 생성해서 사용
        //인스턴스 클래스는 외부 클래스를 먼저 생성해야만 생성할 수 있다.
        InnerEx2 outer = new InnerEx2();
        InstanceInner2 obj2 = outer.new InstanceInner2();
    }
    void instanceMethod2() {
        //인스턴스 맴버는 인스턴스 맴버와 스태틱 맴버 모두에게 접근이 가능하다
        InstanceInner2 obj1 = new InstanceInner2();
        StaticInner2 obj2 = new StaticInner2();
        //LocalInner lv = new LocalInner(); 지역 클래스는 메서드를 벗어나면 메모리에서 사라짐
    }
    void myMethod2() {
        class LocalInner {} // 이 클래스는 해당 메서드 내에서만 유효
        LocalInner lv = new LocalInner();
    }


}

