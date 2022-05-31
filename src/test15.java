import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test15 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();  // N 은 쓸모가 없으므로 입력만 받는다.
        int sum = 0;
        for (byte value : br.readLine().getBytes()) {

            sum += (value - 48);    // 또는 (a-48)
        }
        System.out.println(sum);
    }
}
