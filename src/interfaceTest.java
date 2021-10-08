public class interfaceTest {
    public static void main(String[] args) {
        A a = new A();
        a.auto(new B()); //인터페이스를 구현한 클래스를 인자로(Argument) 넣어주기
        a.auto(new C());
    }
}

class A {
    void auto(I i) {
        i.play();
    }
}

interface I {
    public abstract void play();
}

class B implements I {
    public void play() {
        System.out.println("Play in B class");
    }
}

class C implements I {
    public void play() {
        System.out.println("Play in C class");
    }
}