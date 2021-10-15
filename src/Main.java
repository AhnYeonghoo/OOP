import java.util.*;

class Main {
    static int Solution(String str, char t) {
        int answer = 0; //카운트 할 변수 선언
        str=str.toUpperCase(); // 문자열도 전부 대문자로 변환
        t=Character.toUpperCase(t); // 캐릭터 클래스의 대문자변환 메서드
        for (char temp : str.toCharArray()) { // 향상된 for문 사용해서 문자열을 문자 배열로 temp에 문자로 하나씩 넘김
            if (temp == t) { // 만약 그 문자와 t가 같다면
                answer++; // 카운트 증가
            }
        }

        return answer;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next(); //문자열 입력받기
        char t = scan.next().charAt(0); //문자열의 첫번 째 인덱스를 받으면 결국 문자

        System.out.print(Solution(str,t)); // 클래스 메서드 호출



    }
}