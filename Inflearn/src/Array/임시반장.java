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
        int answer = 0;
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
