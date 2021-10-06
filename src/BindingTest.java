public class BindingTest {
    public static void main(String[] args) {
        Parent2 p = new Child2();
        Child2 c = new Child2();

        System.out.println("p.x= " + p.x); // 100
        p.method(); // Parent method
        System.out.println(); //
        System.out.println("c.x = " + c.x); // 200
        c.method(); // 100, 200, 200
    }

}
class Parent2 {
    int x= 100;
    void method() {
        System.out.println("Parent Method");
    }
}

class Child2 extends Parent2 {
    int x = 200;
    void method() {
        System.out.println("super.x = " + super.x);
        System.out.println("this.x = " + this.x);
        System.out.println("x = " + x);
    }
}
