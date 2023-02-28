import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Greedy11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedReader를 이용하여 입력받은 숫자를 char 배열로 변환합니다.
        char[] N = br.readLine().toCharArray();
        boolean zero = false;
        int sum = 0;
        Arrays.sort(N);
        for (int i = 0; i < N.length; i++) {
            sum += N[i] - '0'; //자릿수별로 합을 구합니다
            int num = 0;
            if (num == N[i] - '0') { // 0이 존재하는지 확인합니다.
                zero = true;
            }
        }
        // 30의 배수인지 확인합니다.
        if (!zero || sum % 3 != 0) {
            System.out.println(-1);
        } else {
            // 30의 배수일 경우, 배열을 오름차순으로 정렬하여 가장 작은 수를 만들고,
            // 이를 내림차순으로 정렬하여 가장 큰 수를 만듭니다.
            StringBuilder sb = new StringBuilder();
            for (int i = N.length - 1; i >= 0; i--) {
                sb.append(N[i]);
            }
            System.out.println(sb);
        }
        br.close();
    }
}