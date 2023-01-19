package String;
import java.util.Scanner;

// 설명 : 영어 알파벳과 특수문자로 되어있는 문자열이 주어지고 영어 알파벳만 뒤집고 나머지는 그 자리 그대로 출력하는 프로그램을 작성하세요.
// 입력 예시 : a#b!GE*T@S
// 출력 예시 : S#T!EG*b@a
public class 특정문자뒤집기 {
    public String solution(String str) {
        String answer = "";  // 출력 값을 return하기 위한 answer
        char[] c = str.toCharArray();  // 입력받은 str을 char형 배열로 저장
        int rt = str.length()-1;  // 마지막 index
        int lt = 0;               // 처음 index
        while(lt < rt) {  // while문으로 lt가 rt를 넘어가면 안에 있는 데이터를 각각 탐색 완료
            if(!Character.isAlphabetic(c[lt])) {  // c[lt] 값이 알파벳이 아니면 lt 1증가
                lt++;
            }
            else if(!Character.isAlphabetic(c[rt])) {  // c[rt] 값이 알파벳이 아니면 rt 1감소
                rt--;
            }
            else {  // 만약 양쪽 모두 알파벳이면 손코딩으로 위치 변환 하고 lt 1증가, rt 1감소
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(c);
        // 제일 중요한 부분으로 answer의 값이 지금 char형 배열이기 때문에 return형인 String을 변환해주어야한다. valueOf라는 메서드로 String c라는 char형 배열을
        // String으로 바꿔주어서 answer에 대입해주면 끝난다.
        return answer;
    }
    public static void main(String[] args) {
        특정문자뒤집기 t = new 특정문자뒤집기();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(t.solution(str));
    }
}
