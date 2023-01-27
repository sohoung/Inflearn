package TwoPointers_SlidingWindows;
import java.util.ArrayList;
import java.util.Scanner;

// 설명 : 오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성하세요.
// 입력 예시 : 3
//           1 3 5
//           5
//           2 3 6 7 9
// 출력 예시 : 1 2 3 3 5 6 7 9
public class 두배열합치기 {
    public ArrayList<Integer> solution(int n, int m, int[] arr1, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0;  // arr1의 포인터
        int p2 = 0;  // arr2의 포인터
        while(p1 < n && p2 < m) {
            if(arr1[p1] < arr2[p2]) {  // arr1이 arr2보다 작을 때
                answer.add(arr1[p1++]);
            }
            else {                     // arr1이 arr2보다 큰 경우와 arr1이 arr2와 같은 경우
                answer.add(arr2[p2++]);
            }
        }
        while(p1 < n) {  // arr1의 데이터가 남았을 경우
            answer.add(arr1[p1++]);
        }
        while(p2 < m) {  // arr2의 데이터가 남았을 경우
            answer.add(arr2[p2++]);
        }
        return answer;
    }
    public static void main(String[] args) {
        두배열합치기 t = new 두배열합치기();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];  // 첫 번째 배열
        for(int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr2 = new int[m];  // 두 번째 배열
        for(int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        for(int x : t.solution(n,m,arr1,arr2)) {
            System.out.print(x + " ");
        }
    }
}
