package TwoPointers_SlidingWindows;
import java.util.Scanner;

// 설명 : N입력으로 양의 정수 N이 입력되면 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는 방법의 가짓수를 출력하는 프로그램을 작성하세요.
//       만약 N=15이면
//       7+8=15
//       4+5+6=15
//       1+2+3+4+5=15
//       와 같이 총 3가지의 경우가 존재한다.
// 입력 예시 : 15
// 출력 예시 : 3
public class 연속된자연수의합 {
    public int solution(int n) {
        int answer = 0;
        int sum = 0;
        int lt = 0;
        int m = n/2+1;
        int[] arr = new int[m];
        for(int i = 0; i < m; i++) {
            arr[i] = i+1;
        }
        for(int rt = 0; rt < m; rt++){
            sum += arr[rt];
            if(sum == n) {
                answer++;
            }
            while(sum >= n) {
                sum -= arr[lt++];
                if(sum == n) {
                    answer++;
                }
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        연속된자연수의합 t = new 연속된자연수의합();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(t.solution(n));
    }
}
