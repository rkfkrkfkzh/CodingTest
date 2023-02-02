import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Greedy1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int index[] = new int[1001];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            index[Integer.parseInt(st.nextToken())]++;
        }
        int sum = 0;
        int Ps = 0;

        for (int i = 0; i < 1001; i++) {
            while (index[i]-- > 0) {
                sum += Ps + i;
                Ps += i;
            }
        }
        System.out.println(sum);

    }
}
