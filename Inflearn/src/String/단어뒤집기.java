package String;
import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 설명 : n개의 단어가 주어지면 각 단어를 출력하는 프로그램을 작성하세요.
// 입력 예시 : 3
//           good
//           Time
//           Big
// 출력 예시 : doog
//           emiT
//           giB
// 손코딩 하는 방법도 있다.

public class 단어뒤집기 {
    public ArrayList<String> solution(int n, String[] arr) {
        ArrayList<String> answer = new ArrayList<>();  // String형 ArrayList 객체 생성
        for(String x : arr) {
            String tmp = new StringBuilder(x).reverse().toString();
            // StringBuilder를 이용해서 arr에 있는 각각의 인덱스에 있는 값을 reverse해주고 다시 toString화 해준다.
            // Stringbuilder는 객체 하나를 이용해서 그 객체를 계속 이용해서 사용하기 때문에 무겁지 않다.
            answer.add(tmp);  // ArrayList이므로 add이용해서 answer에 값을 넣어준다.
        }
        return answer;
    }

    public static void main(String[] args) {
        단어뒤집기 t = new 단어뒤집기();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        for(String x : t.solution(n,arr)) {
            System.out.println(x);
        }
    }
}

