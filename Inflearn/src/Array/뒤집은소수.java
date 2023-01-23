package Array;
import java.util.ArrayList;
import java.util.Scanner;

// 설명 : N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.
//       예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.
//       첫 자리부터의 연속된 0은 무시한다.
// 입력 예시 : 9
//           32 55 62 20 250 370 200 30 100
// 출력 예시 : 23 2 73 2 3
public class 뒤집은소수 {
    public boolean isPrime(int num) {  // 소수인지 아닌지 확인하는 메서드
        if(num == 1) {  // 1은 소수가 아니므로 바로 false 반환
            return false;
        }
        for(int i = 2; i < num; i++) {  // 2부터 num전까지 for문 수행
            if(num%i == 0) {  // 만약 num을 i로 나누었을 때 나머지가 0이면 나누어 떨어진다는 소리이므로 소수가 아닌것이된다. 그러므로 false 반환
                return false;
            }
        }
        return true;
    }
    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int tmp = arr[i];  // 먼저 뒤집을 수를 먼저 int형 변수 tmp에 저장
            int res = 0;       // 뒤집은 수를 저장하는 int형 변수
            while(tmp > 0) {
                int t = tmp % 10;    // 일의 자릿 수를 저장
                res = res * 10 + t;  // 일의 자릿 수부터 저장해준다.
                tmp = tmp / 10;      // 일의 자릿 수를 저장했으므로 일의 자릿 수를 제외한 수를 다시 tmp에 저장한다.
                // 이 순서를 꼭 암기 할 것
            }
            if(isPrime(res)) {       // 뒤집은 수가 소수인지 아닌지 체크
                answer.add(res);     // 뒤집은 수가 소수가 아니라면 answer에 add해준다.
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        뒤집은소수 t = new 뒤집은소수();
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
