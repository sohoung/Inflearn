package Array;

import java.util.Scanner;

// 설명 : 자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
//       만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.
// 입력 예시 : 20
// 출력 예시 : 8
public class 에라토스테네스체 {
    public int solution(int n) {
        int answer = 0;
        int[] arr = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            if (arr[i] == 0) {
                answer++;
                for (int j = i; j <= n; j += i) arr[j] = 1;  
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        에라토스테네스체 t = new 에라토스테네스체();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(t.solution(n));
    }
}
