package Array;
import java.util.Scanner;

// 설명 : N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.
// 입력 예시 : 5
//10 13 10 12 15
//12 39 30 23 11
//11 25 50 53 15
//19 27 29 37 27
//19 13 30 13 19
// 출력 예시 : 155
public class 격자판최대합 {
    public int solution(int n, int[][] arr) {
        int answer = 0;
        for(int i = 0; i < n; i++) {  // 행
            int sum1 = 0;  // 각 행을 더한 값
            int sum2 = 0;  // 각 열을 더한 값
            for(int j = 0; j < n; j++) {  // 열
                sum1 += arr[i][j];  // 각 행의 합
                sum2 += arr[j][i]; // 각 열의 합
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i < n ; i++) {
            sum1 += arr[i][i];  // 왼쪽부터 오른쪽 아래로 내려오는 대각선의 합
            sum2 += arr[i][n-i-1];  // 오른쪽 대각선에서 왼쪽 아래로 내려오는 대각선의 합
        }
        answer = Math.max(answer,sum1);
        answer = Math.max(answer,sum2);
        return answer;
    }
    public static void main(String[] args) {
        격자판최대합 t = new 격자판최대합();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(t.solution(n,arr));
    }
}
