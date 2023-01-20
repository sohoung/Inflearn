package String;
import java.util.Scanner;

// 설명 : 알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는
//       문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.
//       단 반복횟수가 1인 경우 생략합니다.
// 입력 예시 : KKHSSSSSSSE
// 출력 예시 : K2HS7E
// 입력 예시 : KSTTTSEEKFKKKDJJGG
// 출력 예시 : KST3SE2KFK3DJ2G2
public class 문자열압축 {
    public String solution(String str) {
        String answer = "";
        int cnt = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == str.charAt(i+1)) {
                cnt++;
            }
            else {
                
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        문자열압축 t = new 문자열압축();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(t.solution(str));
    }
}
