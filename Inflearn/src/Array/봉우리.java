package Array;

import java.util.Scanner;

// 설명 : 지도 정보가 N*N 격자판에 주어집니다. 각 격자에는 그 지역의 높이가 쓰여있습니다.
//       각 격자판의 숫자 중 자신의 상하좌우 숫자보다 큰 숫자는 봉우리 지역입니다. 봉우리 지역이 몇 개 있는 지 알아내는 프로그램을 작성하세요.
//       격자의 가장자리는 0으로 초기화 되었다고 가정한다.
//       만약 N=5 이고, 격자판의 숫자가 다음과 같다면 봉우리의 개수는 10개입니다.
// 입력 예시 : 5
//           5 3 7 2 3
//           3 7 1 6 1
//           7 2 5 3 4
//           4 3 6 4 1
//           8 7 3 5 2
// 출력 예시 : 10


public class 봉우리 {
    int[] dx = {-1, 0, 1, 0};  // 상하좌우에 대한  x 좌표
    int[] dy = {0, 1, 0, -1};  // 상하좌우에 대한  y 좌표

    public int solution(int n, int[][] arr) {
        int answer = 0;  // 출력을 위한 저장 값
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean flag = true;   // 격자판에 대한 조건문이 true인지 false인지를 판별하는 boolean형 변수
                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];  // 다음 x 좌표
                    int ny = j + dy[k];  // 다음 y 좌표
                    if(nx >= 0 && nx < n && ny >= 0 && ny < n && arr[nx][ny] >= arr[i][j]) {
                        // nx >= 0 && nx < n은 경계값을 먼저 걸러주기 위한 조건문으로 nx가 0보다 작고 n보다 크거나 같다면 경계값을 넘어갔다가 의미이므로
                        // if 조건문이 false가 된다. 즉 n*n이라는 봉우리에 대한 사이즈에서 넘어가는 좌표는 볼 필요가 없다.
                        flag = false;
                        // 만약 if 조건문이 true가 된다면 현재의 좌표에서 상화좌우 값 중에서 현재 좌표보다 더 크거나 같은 값이 있다는 말이므로 조건에 맞지 않다.
                        break;
                    }
                }
                if(flag) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        봉우리 t = new 봉우리();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(t.solution(n, arr));
    }
}
