package String;

// 설명 : 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
// 입력 예시 : teachermode e
// 출력 예시 : 1 0 1 2 1 0 1 2 2 1 0


import java.util.Scanner;

public class 문자거리 {
    public int[] solution(String str, char c) {
        int[] answer = new int[str.length()];  // str의 크기만큼 int형 배열 동적 할당
        int p = 1000;
        for(int i = 0; i < str.length(); i++) {  // 처음 index에서 마지막 index까지 탐색하는 for문
            if(str.charAt(i) == c) {  // 같은 문자 일 경우
                p = 0;                // 거리를 뜻하는 p를 0으로 초기화
                answer[i] = p;        // int형 배열 answer에 저장
            }
            else {                    // 다른 문자 일 경우
                p++;                  // 거리를 의미하는 p 1증가
                answer[i] = p;        // answer 배열에 저장
            }
        }
        p = 1000;                     // 마지막 index에서 처음 index를 탐색해야 하므로 다시 1000으로 초기화
        for(int i = str.length()-1; i >= 0; i--) {   // 마지막 index에서 처음 index를 탐색하는 for문
            if(str.charAt(i) == c) {                 // 같은 문자일 경우
                p = 0;                               // p만 0으로 초기화하고 answer에는 이미 0이 저장되어있으므로 저장하지 않는다.
            }
            else {                                   // 다른 문자
                p++;                                 // p 1증가
                answer[i] = Math.min(answer[i], p);  // Math.min 메서드로 먼저 저장되어있는 answer 배열의 값과 p를 비교하여 더 작은 값을 넣어준다.
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        문자거리 t = new 문자거리();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();  // 입력받을 문자
        char c = sc.next().charAt(0);  // 거리를 구해야 하는 문자
        for (int x : t.solution(str, c)) {
            System.out.print(x + " ");
        }
    }
}
