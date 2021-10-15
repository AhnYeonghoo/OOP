import java.util.Scanner;


public class Baekjoon2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.next();
        String num2 = sc.next();
        String reverse = "";
        String reverse2 = "";
        for (int i = num1.length()-1; i >= 0; i--) {
            reverse = reverse + num1.charAt(i);
        }
        for (int i = num2.length()-1; i>=0; i--) {
            reverse2 = reverse2 + num2.charAt(i);
        }
        if (Integer.parseInt(reverse) > Integer.parseInt(reverse2)) {
            System.out.println(reverse);
        } else {
            System.out.println(reverse2);
        }
    }
}

