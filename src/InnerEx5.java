public class InnerEx5 {
    public static void main(String[] args) {
        Outer5 o5 = new Outer5();
        Outer5.Inner5 inner = o5.new Inner5();
        inner.method5();
    }
}

class Outer5 {
    int value = 10; // Outer5.this.value

    class Inner5 {
        int value = 20; // this.value

        void method5() {
            int value = 30;
            System.out.println("            value : " + value);
            System.out.println("        this.value : " + this.value);
            System.out.println("    Outer.this.value : " + Outer5.this.value);
        }
    }
}
