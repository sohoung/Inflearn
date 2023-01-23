package Array;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

// 설명 : A, B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.
//       가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.
// 입력 예시 : 5
//           2 3 3 1 3
//           1 1 2 2 3
// 출력 예시 : A
//           B
//           A
//           B
//           D
public class 가위바위보 {
    public ArrayList<String> solution(int n, int[][] arr) {
        ArrayList<String> answer = new ArrayList<>();  // 출력 값을 저장 할 ArrayList 객체 생성
        for(int i = 0; i < n; i++) {  // 테스트 횟수 만큼 수행하는 for문
            if(arr[0][i] == 1 && arr[1][i] == 3) {  // A가 이길 때
                answer.add("A");
            }
            else if(arr[0][i] == 2 && arr[1][i] == 1) {  // A가 이길 때
                answer.add("A");
            }
            else if(arr[0][i] == 3 && arr[1][i] == 2) {  // A가 이길 때
                answer.add("A");
            }
            else if(arr[0][i] == arr[1][i]) {  // 비겼을 경우
                answer.add("D");
            }
            else {  // 나머지는 다 B가 이기는 경우
                answer.add("B");
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        가위바위보 t = new 가위바위보();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr= new int[2][n];
        for(int i =0 ; i < 2; i++) {  // 2차원 배열로 A와 B가 낸 가위바위보를 각각 저장한다.
            for(int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();  // 2차원 배열로 for문을 이용해서 값 저장
            }
        }
        for(String str : t.solution(n,arr)) {  // ArrayList이므로 향상된 for문으로 출력
            System.out.println(str);
        }
    }
}
