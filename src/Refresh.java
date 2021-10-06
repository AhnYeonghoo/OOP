import java.util.*;
public class Refresh {
    static void printArr(int[] numArr) {
        for (int j : numArr) {
            System.out.println(j);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] result = new int[10];
        for (int i = 0; i < 10; i++) {
            result[i] = (int)(Math.random() * 20);
        }
        printArr(result);

    }
}
