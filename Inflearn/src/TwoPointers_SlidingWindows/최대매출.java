package TwoPointers_SlidingWindows;
import java.util.Scanner;

// 설명 : 현수의 아빠는 제과점을 운영합니다. 현수 아빠는 현수에게 N일 동안의 매출기록을 주고 연속된 K일 동안의 최대 매출액이 얼마인지 구하라고 했습니다.
//       만약 N=10이고 10일 간의 매출기록이 아래와 같습니다. 이때 K=3이면
//       12 15 11 20 25 10 20 19 13 15
//       연속된 3일간의 최대 매출액은 11+20+25=56만원입니다.
//       여러분이 현수를 도와주세요.
// 입력 예시 : 10 3
//           12 15 11 20 25 10 20 19 13 15
// 출력 예시 : 56
public class 최대매출 {
    public int solution(int n,int m,int[] arr) {
        int answer = 0;  // 출력값 저장을 위한 int형 변수
        int sum = 0;     // answer와 비교하면서 값을 갱신하는 int형 변수
        for(int i = 0; i < m; i++) {   // 먼저 연속 일 수에 대한 값을 sum에 누적합 해준다.
            sum += arr[i];
        }
        answer = sum;
        for(int i = 3; i < n; i++) {
            // 그 다음 맨 앞의 index를 sum에서 빼주고 맨 뒤의 index에 그 뒤에 index, 즉 입력받은 m에 1을 더한 index를 sum에 더해준다.
            sum += (arr[i] - arr[i-m]);
            answer = Math.max(answer, sum);
            // answer에 Math.max 함수로 answer와 sum의 값 비교를하여서 더 큰 값으로 answer에 값 갱신
        }
        return answer;
    }
    public static void main(String[] args) {
        최대매출 t = new 최대매출();
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();      // 입력받은 원소
        int[] arr  = new int[n];   // 원소 갯수에 따른 배열 동적 할당
        int m = sc.nextInt();      // 연속 일 수
        for(int i = 0; i < n; i++) {  // for문을 이용한 배열에 값 입력
            arr[i] = sc.nextInt();
        }
        System.out.println(t.solution(n,m,arr));
    }
}
