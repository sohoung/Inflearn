package String;
import java.util.Scanner;

// 설명 : 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
//       문장속의 각 단어는 공백으로 구분됩니다.
// 입력 예시 : it is time to study
// 출력 예시 : study
// indexOf,sumString으로 하는 방법도 있다.
public class 문장속단어 {
    public String solution(String str) {
        String answer = "";  // 출력 값을 저장하기 위한 String형 answer 변수
        int m = Integer.MIN_VALUE; // 최댓값을 구하기 때문에 Integer.MIN_VALUE로 최솟값을 하나 만들어주고 position이라는 의미를 담고있는 pos도 같이 만들어준다.
        String[] s = str.split(" ");  // 입력받은 str을 " "을 기준으로 배열에 넣어준다,
        for(String x : s) {  // 향상된 for문으로 각각의 인덱스에 있는 데이터를 대입
            int len = x.length();  // 길이가 가장 긴 문장을 출력하기 때문에 int형 변수 len을 생성하고 초기값으로 x의 길이를 넣어준다.
            if(len > m) {  // if문으로 len이 최솟값인 m보다 크다면 m을 len으로 바꿔주고 answer에 대입하고 그 다음부터는
                m = len;   // 그 다음 인덱스의 문장 길이를 len으로 넣어주고 똑같이 len과 m을 비교하여 더 크다면 answer에 문장을 다시 대입
                answer = x;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        문장속단어  t = new 문장속단어();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(t.solution(str));
    }
}
