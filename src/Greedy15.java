import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Greedy15 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        //StringTokenizer 클래스를 사용하여 입력받은 문자열 S를 "0"과 "1"을 구분자로 사용하여 분리합니다.
        StringTokenizer str0 = new StringTokenizer(S, "0");
        StringTokenizer str1 = new StringTokenizer(S, "1");
        //각각의 StringTokenizer 객체에 대해 countTokens() 메서드를 사용하여 분리된 문자열의 개수를
        //Math.min() 함수를 사용하여 더 적은 개수의 분리된 문자열을 뒤집어서 모든 문자를 같은 문자로 만들어줍니다.
        System.out.println(Math.min(str1.countTokens(), str0.countTokens()));
    }
}
//시간 복잡도는 문자열의 길이에 선형적으로 비례하여 O(N)입니다.