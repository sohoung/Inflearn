package TwoPointers_SlidingWindows;
import java.util.Scanner;

// 설명 : 0과 1로 구성된 길이가 N인 수열이 주어집니다. 여러분은 이 수열에서 최대 k번을 0을 1로 변경할 수 있습니다. 여러분이 최대 k번의 변경을 통해 이 수열에서 1로만 구성된 최대 길이의 연속부분수열을 찾는 프로그램을 작성하세요.
//       만약 길이가 길이가 14인 다음과 같은 수열이 주어지고 k=2라면
//       1 1 0 0 1 1 0 1 1 0 1 1 0 1
//       여러분이 만들 수 있는 1이 연속된 연속부분수열은
//       1 1 0 0 1 1 1 1 1 1 1 1
//       이며 그 길이는 8이다.
// 입력 예시 : 14 2
//          1 1 0 0 1 1 0 1 1 0 1 1 0 1
// 출력 예시 : 8
public class 최대길이연속부분수열 {
    public int solution(int n,int m,int[] arr) {
        int answer = 0;
        int cnt = 0;  // 0에서 1로 몇 번 바꿨는지 카운트
        int len = 0;  // 최대 길이를 저장하는 변수
        int lt = 0;
        for(int rt = 0; rt < n; rt++) {
            if(arr[rt] == 0) {  // arr 배열의 값이 0이면
                arr[rt] = 1;
                cnt++;
                len = rt-lt+1;
                if(cnt == m) {
                    answer = Math.max(answer,len);
                }
            }
            else {              // arr 배열의 값이 1일 때
                
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        최대길이연속부분수열 t = new 최대길이연속부분수열();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int m = sc.nextInt();
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(t.solution(n,m,arr));
    }
}
