package String;
import java.util.Scanner;

// 설명 : 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
//       문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 "NO"를 출력하는 프로그램을 작성하세요.
//       단 회문을 검사 할 때는 대소문자를 구분하지 않는다.
// 입력 예시 : gooG
// 출력 예시 : YES
// StringBuilder를 사용하여 푸는 방법도 있다.
public class 회문문자열 {
    public String solution(String str) {
        String answer = "YES";
        str = str.toUpperCase();  // 대소문자를 구분하지 않으므로 대문자로 변환
        int len = str.length();
        for(int i = 0; i < len/2; i++) {
            if(str.charAt(i) != str.charAt(len-i-1)) {
                return "NO";
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        회문문자열 t = new 회문문자열();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(t.solution(str));
    }
}
