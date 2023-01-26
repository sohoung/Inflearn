package TwoPointers_SlidingWindows;
import java.util.ArrayList;
import java.util.Arrays;
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
        
        return answer;
    }
    public static void main(String[] args) {
        두배열합치기 t = new 두배열합치기();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for(int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        for(int x : t.solution(n,m,arr1,arr2)) {
            System.out.print(x + " ");
        }
    }
}
