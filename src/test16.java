import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test16 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int cnt = 0;    // 사이클
        int copy = N;   // 변수 복사

        do {
            N = (((N % 10) * 10) + (((N / 10) + (N % 10)) % 10));
            cnt++;
        } while (copy != N);
        System.out.println(cnt);
    }
}