import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class test9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st;
        String str;
        try {
            while ((str = br.readLine()) != null) {
                st = new StringTokenizer(str, " ");
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                sb.append(a + b).append("\n");
            }
        } catch (NoSuchElementException noSuchElementException) {
            System.out.println(sb);
        }
    }
}
// EOF입력 방식으로 리눅스는 ctrl + D 윈도우는 ctrl + Z로 입력종료를 하면 정상적으로 예외오류 없이 출력이 된다.
