package Array;
import java.util.ArrayList;
import java.util.Scanner;

// 설명 : N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
//       (첫 번째 수는 무조건 출력한다)
// 입력 예시 : 6
//          7 3 9 5 6 12
// 출력 예시 : 7 9 6 12
public class 큰수출력하기 {
    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);  // 첫 번째 수는 무조건 출력이므로 arr 배열의 0번째는 저장
        for(int i = 0; i < n-1; i++) {  // 0번째 index는 이미 저장하였으므로 1번 index부터 시작
            if(arr[i] < arr[i+1]) {
                answer.add(arr[i+1]);  // 출력 조건에 맞게 if문 조건 설정하고 조건에 true이면 answer에 add
            }
        }
        return answer;

    }
    public static void main(String[] args) {
        큰수출력하기 t = new 큰수출력하기();
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
