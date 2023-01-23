package Array;
import java.util.ArrayList;
import java.util.Scanner;

// 설명 : N명의 학생의 국어점수가 입력되면 각 학생의 등수를 입력된 순서대로 출력하는 프로그램을 작성하세요.
//       같은 점수가 입력될 경우 높은 등수로 동일 처리한다.
//       즉 가장 높은 점수가 92점인데 92점이 3명 존재하면 1등이 3명이고 그 다음 학생은 4등이 된다.
// 입력 예시 : 5
//          87 89 92 100 76
// 출력 예시 : 4 3 2 1 5
public class 등수구하기 {
    public int[] solution(int n, int[] arr) {
        int[] answer = new int[n];
        for(int i = 0 ; i < n; i++) {  // 기준이 되는 for문
            int cnt = 1;  // 0등이라는 등수는 없으므로 1로 초기화
            for(int j = 0; j < n; j++) {  // 비교할 점수를 수행하는 for문
                if(arr[j] > arr[i]) {  // 기준이 되는 점수보다 비교할 점수가 더 높다면 cnt 증가해준다. 만약 점수가 같다면 cnt가 오르지 않으므로 등수가 다 같아진다.
                    cnt++;
                }
            }
            answer[i] = cnt;
        }
        return answer;
    }
    public static void main(String[] args) {
        등수구하기 t = new 등수구하기();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int x : t.solution(n,arr)) {
            System.out.print(x + " ");
        }
    }
}
