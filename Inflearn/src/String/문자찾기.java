package String;
import java.util.Scanner;

// 설명 : 한 개의 문자열을 입력받고 특정 문자를 입력받 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
//       대소문자를 구분하지 않고 문자열의 길이는 100을 넘지 않는다.
// 입력 예시 : Computercooler
//           c
// 출력 예시 : 2
public class 문자찾기 {
    public static void main(String[] args) {
        문자찾기  m = new 문자찾기();
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next().toUpperCase(); // 문자열을 입력하고 대소문자 구분이 없으니 바로 대문자로 변환
        String str2 = sc.next().toUpperCase(); // 문자를 입력받고 대소문자 구분이 없으니 바로 대문자로 변환
        char[] c = str1.toCharArray();  // 입력받은 str1에 대한 char형 배열 생성
        char[] ch = str2.toCharArray(); // 입력받은 str2에 대한 char형 배열 생성
        int answer = 0;  // 정답을 위한 int형 변수
        for(int i = 0; i < str1.length(); i++) {
            if(c[i] == ch[0]) { // 입력받은 문자와 문자열을 비교
                answer++;
            }
        }
        System.out.println(answer);
    }
}
