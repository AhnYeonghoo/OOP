import java.util.Scanner;
public class Refresh {
    public static void main(String[] args) {
        String str = "ABCDE";
        char ch = str.charAt(3);

        String str2 = "012345";
        String tmp = str.substring(1,4);
        int length = str.length();
        boolean tt = str2.equals("012345");
        System.out.println(ch);
        System.out.println(tmp);
        System.out.println(length);
        System.out.println(tt);


    }
}
