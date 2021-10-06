class Singleton {
    private static Singleton s = new Singleton();
    int a = 10;

    private Singleton() {

    }
    public static Singleton getInstance() {
        if(s==null) {
            s = new Singleton();
        }
        return s;
    }
}
public class SingletonTest {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        Singleton d = Singleton.getInstance();
        s.a = 20;
        d.a= 30;
        System.out.println(s.a);
        System.out.println(d.a);
    }


}

