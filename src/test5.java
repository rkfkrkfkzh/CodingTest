import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int a;
        int b;
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            sb.append("Case #").append(i).append(": ").append(a+ " + "+b+" = "+ (a+b)).append("\n");

        }
        br.close();
        System.out.println(sb);
    }
}