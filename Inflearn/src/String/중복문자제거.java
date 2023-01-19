package String;
import java.util.Scanner;

// 설명 : 소문자로 이루어진 한 개의 문자열을 입력받아 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요. 중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지한다.
// 입력 예시 : ksekkset
// 출력 예시 : kset

public class 중복문자제거 {
    public String solution(String str) {
        String answer = "";
        for(int i = 0; i < str.length(); i++) {
            if(str.indexOf(str.charAt(i)) == i) {
                // str.indexOf(str.charAt(i)) == i의 의미는 str.indexOf는 처음 문자가 나온 지점을 나타낸다. 즉 ksekkset에서 k를 예로 들어보면
                // 첫 번째 k는 str.indexOf의 값이 1이지만 4번째 k는 indexOf의 값이 3이다. 즉 indexOf라는 처음 그 문자가 나온 지점과 현재 인덱스를 의미하는 i와 숫자가 다르다면
                // 앞의 실행에서 이미 문자가 나왔다는 의미이므로 중복문자라는 의미이다.
                answer += str.charAt(i);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        중복문자제거 t = new 중복문자제거();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(t.solution(str));
    }
}
