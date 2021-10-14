import java.util.*;
public class Main {
    public String solution(String str) {
        String answer;
        char[] s = str.toCharArray(); // 문자열을 문자 배열로 저장
        int lt = 0; // 첫번 째 문자열을 가리킴
        int rt = str.length()-1; //마지막 문자 배열 가리킴
        while (lt < rt) { // 끝 문자와 끝 문자가 만날 때 까지
            if (!(Character.isAlphabetic(s[lt]))) lt++; //특문인지 검사 후 거짓이면 참이되므로 특문이면 한칸 이동
            else if(!(Character.isAlphabetic(s[rt]))) rt--;
            else {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer=String.valueOf(s); // 문자 배열을 문자열로 변환 시켜줌
        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(T.solution(str));
    }
}