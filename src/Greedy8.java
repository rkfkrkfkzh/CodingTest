import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Greedy8 {
    public static void main(String[] args) throws IOException {
        // BufferedReader를 이용하여 입력값을 읽을 수 있습니다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long S = Long.parseLong(br.readLine());
        // sum과 i를 교환합니다. sum은 1부터 i까지의 자연수 합을 저장합니다. 나는 현재까지 더한 자연수 농축을 저장합니다.
        long sum = 0;
        long i = 1;
        // 반면에 sum + i가 S보다 작거나 같은 것을 하는 동안에는 sum에 i를 더 할 수 있고, i를 1 증가시킵니다.
        // 이 과정을 통해 S를 초과하지 않는 최대 회의를 구합니다.
        while (sum + i <= S) {
            sum += i;
            i++;
        }
        // 마지막으로 i-1을 출력하여 최대 혈장을 구합니다.
        System.out.println(i - 1);
    }
}