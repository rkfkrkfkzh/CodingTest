import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();
        StringBuilder sb = new StringBuilder();
        int i = 1;

        while (i <= n) {
            sb.append(i + "\n");
            i++;
        }
        System.out.println(sb);
    }
}
