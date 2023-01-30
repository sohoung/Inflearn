package TwoPointers_SlidingWindows;
import java.util.Scanner;

// 설명 : N개의 수로 이루어진 수열이 주어집니다.
//       이 수열에서 연속부분수열의 합이 특정숫자 M이 되는 경우가 몇 번 있는지 구하는 프로그램을 작성하세요.
//       만약 N=8, M=6이고 수열이 다음과 같다면
//       1 2 1 3 1 1 1 2
//       합이 6이 되는 연속부분수열은 {2, 1, 3}, {1, 3, 1, 1}, {3, 1, 1, 1}로 총 3가지입니다.
// 입력 예시 : 8 6
//           1 2 1 3 1 1 1 2
// 출력 예시 : 3
public class 연속부분수열 {
    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        int lt = 0;
        int rt = 1;
        int sum = 0;
        while() {
            if(sum < m) {
                sum += arr[rt++];
            }
            else if(sum > m) {
                sum -= arr[lt++];
            }
            else {
                answer++;
                rt++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        연속부분수열 t = new 연속부분수열();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // 연속된 수열
        int[] arr = new int[n];
        int m = sc.nextInt();  // 합
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(t.solution(n,m,arr));
    }
}
