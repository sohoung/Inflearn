package String;
import java.util.Scanner;

// 설명 : 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다.
//       문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 “NO"를 출력하는 프로그램을 작성하세요.
//       단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않습니다.
//       알파벳 이외의 문자들의 무시합니다.
// 입력 예시 : found7, time: study; Yduts; emit, 7Dnuof
// 출력 에시 : YES
public class 팰린드롬 {
    public String solution(String str) {
        String answer = "NO";
        str = str.toUpperCase().replaceAll("[^A-Z]","");
        // 먼저 대소문자를 구분하지 않기 때문에 모두 대문자로 바꿔주고 replaceAll이라는 정규식을 사용한다.
        // "[^A-Z]",""의 의미는 대문자 A-Z까지가 아닌 모든 특수문자와 문자는 ""이걸로 바꾸라는 소리이다.
        // 즉 대문자 A-Z가 아니면 사라지라는의미인것이다.
        String tmp = new StringBuilder(str).reverse().toString();
        // str과 비교할 String형 변수 tmp로 str을 거꾸로 한 것이다.
        if(str.equals(tmp)) {  // equals 메서드로 str과 tmp가 같다면 YES를 retrun 해준다.
            answer = "YES";
        }
        return answer;
    }
    public static void main(String[] args) {
        팰린드롬 t = new 팰린드롬();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(t.solution(str));
    }
}
