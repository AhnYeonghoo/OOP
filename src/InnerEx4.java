public class InnerEx4 {
    public static void main(String[] args) {
        //인스턴스 클래스의 인스턴스를 생성하려면 외부클래스부터 생성해야 함
        Outer outer = new Outer();
        Outer.InstanceInner4 ii = outer.new InstanceInner4();

        System.out.println("ii.iv = " + ii.iv);
        System.out.println("Outer.StaticInner4.cv = " + Outer.StaticInner4.cv);

        //스태틱 내부 클래스의 인스턴스는 외부 클래스 생성 불 필요
        Outer.StaticInner4 si = new Outer.StaticInner4();
        System.out.println("si.iv = " + si.iv);
    }
}

class Outer {
    int iv = 20;
    class InstanceInner4 {
        int iv = 100;
    }
    static class StaticInner4 {
        int iv = 200;
        static int cv = 300;
    }
    void myMethod4() {
        class LocalInner4 {
            int iv = 400;
        }
    }
}
