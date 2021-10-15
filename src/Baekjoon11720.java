import java.util.Scanner;

public class Baekjoon11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        String str = sc.next();
        int sum = 0;
        for (int i = 0; i < count; i++) {
            char temp = str.charAt(i);
            int num = Character.getNumericValue(temp);
            sum += num;

        }
        System.out.println(sum);


    }
}
