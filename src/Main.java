import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] N = br.readLine().toCharArray();
        boolean zero = false;
        int sum = 0;
        Arrays.sort(N);
        for (int i = 0; i < N.length; i++) {
            sum += N[i] - '0';
            int num = 0;
            if (num == N[i] - '0') {
                zero = true;
            }
        }
        if (!zero || sum % 3 != 0) {
            System.out.println(-1);
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = N.length - 1; i >= 0; i--) {
                sb.append(N[i]);
            }
            System.out.println(sb);
        }
        br.close();
    }
}