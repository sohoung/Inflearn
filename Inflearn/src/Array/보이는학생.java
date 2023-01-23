package Array;
import java.util.Scanner;

// 설명 : 선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때, 맨 앞에 서 있는
//       선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요. (앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않습니다.)
// 입력 예시 : 8
//          130 135 148 140 145 150 150 153
// 출력 예시 : 5
public class 보이는학생 {
    public int solution(int n, int[] arr) {
        int answer = 0;
        for(int i = 0; i < n-1; i++) {
            if(arr[i] < arr[i+1]) {  // 자신을 기준으로 자신의 앞 학생보다 자신이 더 크다면 answer을 증가
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        보이는학생 t = new 보이는학생();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(t.solution(n,arr));
    }
}
