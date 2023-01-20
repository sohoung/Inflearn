package String;

import java.util.Collections;
import java.util.Scanner;

// 설명 : 문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.
//       만약 “tge0a1h205er”에서 숫자만 추출하면 0, 1, 2, 0, 5이고 이것을 자연수를 만들면 1205이 됩니다.
//       추출하여 만들어지는 자연수는 100,000,000을 넘지 않습니다.
// 입력 예시 : g0en2T0s8eSoft
// 출력 에시 : 208
// 0부터 9까지의 아스키 코드 번호는 48번 부터 57번까지이다.
// Character.isDigits 메서드를 사용하여 풀 수도 있고 아스키 코드를 이용한
// answer * 10 + (x - 48)을 이용하여 해결 가능
public class 숫자만추출 {
    public int solution(String str) {
        int answer;  // 출력을 위한 int형 변수 answer
        str = str.replaceAll("[^0-9]","");
        // replaceAll 정규식을 사용하여 입력받은 str에서 0-9까지 아닌 문자는 다 ""으로 대체한다. 즉 0-9가 아닌 문자는 삭제한다.
        answer = Integer.parseInt(str);  // str이 String형이므로 Integer.parseInt로 형변환을 해준다.
        // 해주는 이유는 만약 맨 앞의 숫자가 0이 있으면 출력하면 안되기 때문에 정수형으로 형변환을 해주면 자연스럽게 앞의 0은 삭제된다.
        return answer;
    }

    public static void main(String[] args) {
        숫자만추출 t = new 숫자만추출();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(t.solution(str));
    }
}
