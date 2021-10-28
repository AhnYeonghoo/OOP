import java.util.*;
public class AutoBoxing {
    public static void main(String[] args) {
        int i = 10;

        Integer intg = i;
        Object obj = i;

        Long lng = 100L;

        int i2 = intg + 10; // 10 + 10;
        long l = intg + lng; // 10 + 100

        Integer intg2 = new Integer(10);
        int i3 = intg2;
        Integer intg3 = intg2 + i3; // 10 + 10

        System.out.println("i = " + i); // 10
        System.out.println("intg = " + intg); // 10
        System.out.println("obj = " + obj); // 10;
        System.out.println("lng = " + lng); // 100;
        System.out.println("intg + 10 = " + i2); // 20;
        System.out.println("intg + lng = " + l); // 110
        System.out.println("intg2 = " + intg2); // 10
        System.out.println("i3 = " + i3); // 10
        System.out.println("intg2 + i3 = " + intg3); // 20
    }
}
