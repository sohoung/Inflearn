package Array;
import java.util.Scanner;

// 설명 : 김갑동 선생님은 올해 6학년 1반 담임을 맡게 되었다.
//      김갑동 선생님은 우선 임시로 반장을 정하고 학생들이 서로 친숙해진 후에 정식으로 선거를 통해 반장을 선출하려고 한다.
//      그는 자기반 학생 중에서 1학년부터 5학년까지 지내오면서 한번이라도 같은 반이었던 사람이 가장 많은 학생을 임시 반장으로 정하려 한다.
// 입력 예시 : 5
//           2 3 1 7 3
//           4 1 9 6 8
//           5 5 2 4 4
//           6 5 2 6 7
//           8 4 2 2 2
// 출력 예시 : 4

public class 임시반장 {
    public int solution(int n, int[][] arr) {
        int answer = 0;  // 학생 수를 저장하기 위한 int형 변수
        int max = 0;     // 최대값을 구하기 위해서 비교를 위한 변수
        for(int i = 0; i < n; i++) {
            int cnt = 0;  // 학생들이 같은 반으로 만난 횟수
            for(int j = 0; j < n; j++) {
                for(int k = 0; k < n; k++) {
                    if(arr[i][k] == arr[j][k]) {
                        // 1번 학생의 1학년 부터 시작을 하여서 1번 학생의 1학년 2,3,4,5번 학생의 1학년을 비교하면서 수행한다.
                        // 만약 같은 반이 있다면 cnt를 증가시켜주고 1명이라도 만난 사람이 있다면 조건에 충족하기 때문에 더 이상 for문을 수행 할 필요가 없다.
                        // 그러므로 if 조건문이 true가 된다면 cnt를 증가시켜주고 break를 걸어주어서 for문을 빠져나오게 해준다.
                        cnt++;
                        break;
                    }
                }
            }
            if(cnt > max) {  
                max = cnt;
                answer = i+1;   // index 숫자 자체를 학생 번호로 생각하기 때문에 index는 0부터 시작하므로 1을 더해주어서 학생 수를 표현
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        임시반장 t = new 임시반장();
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
