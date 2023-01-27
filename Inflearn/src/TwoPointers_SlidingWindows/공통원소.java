package TwoPointers_SlidingWindows;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// 설명 : A, B 두 개의 집합이 주어지면 두 집합의 공통 원소를 추출하여 오름차순으로 출력하는 프로그램을 작성하세요.
// 입력 예시 : 5
//           1 3 9 5 2
//           5
//           3 2 5 7 8
// 출력 예시 : 2 3 5
public class 공통원소 {
    public ArrayList<Integer> solution(int n, int m, int[] arr1, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0;  // arr1 배열의 포인터
        int p2 = 0;  // arr2 배열의 포인터
        Arrays.sort(arr1);   // arr1 오름차순 정렬
        Arrays.sort(arr2);   // arr2 오름차순 정렬
        while(p1 < n && p2 < m) {
            if(arr1[p1] < arr2[p2]) {  // arr1[p1]의 값이 arr2[p2]의 값보다 작으면 p1 포인터 1증가
                p1++;
            }
            else if(arr1[p1] > arr2[p2]) {   // arr1[p1]이 arr2[p2]의 값 보다 크다면 p2 포인터 증가
                p2++;
            }
            else {                     // 같다면 공통원소이므로 answer에 add해주고 각 포인터들을 1증가
                answer.add(arr1[p1++]);
                p2++;
            }
            // 이렇게 작은 수에 대한 포인터를 증가하는 이유는 만약 큰 수에 대한 포인터를 증가시키면 공통원소인 값을 지나치고 가기 때문이다.
        }

        return answer;
    }
    public static void main(String[] args) {
        공통원소 t = new 공통원소();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for(int j = 0; j < m; j++) {
            arr2[j] = sc.nextInt();
        }
        for(int x : t.solution(n,m,arr1,arr2)) {
            System.out.print(x + " ");
        }
    }
}
