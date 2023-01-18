package String;
import java.util.Scanner;

// 설명 : 대문자와 소문자가 같이 있는 문자열을 입력받아 대문자는 소문자로, 소문자는 대문자로 변환하는 프로그램을 작성하세요
// 입력 예시 : StuDY
// 출력 예시 : sTUdy
public class 대소문자변환 {
    public static void main(String[] args) {
        대소문자변환 m = new 대소문자변환();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();  // 입력받을 문자열
        String answer = "";  // 출력값을 위한 String형 answer
        for(int i = 0; i < str.length(); i++) {
            if(Character.isLowerCase(str.charAt(i))){  // 소문자이면 대문자로
                answer += Character.toUpperCase(str.charAt(i));
            }
            else {  // 대문자이면 소문자로
                answer +=Character.toLowerCase(str.charAt(i));
            }
        }
        System.out.println(answer);
    }
}
