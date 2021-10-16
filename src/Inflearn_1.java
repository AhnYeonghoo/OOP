import java.util.Scanner;

public class Inflearn_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch = sc.next().charAt(0);
        str = str.toLowerCase();
        ch = Character.toLowerCase(ch);
        int count = 0;
        for (char temp : str.toCharArray()) {
            if (temp == ch) count++;
        }
        System.out.println(count);


    }
}
