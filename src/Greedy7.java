import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Greedy7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //첫 번째 줄에 입력된 정수 N은 로프의 개수를 의미합니다.
        int N = Integer.parseInt(br.readLine());
        //두 번째 줄부터 N개의 줄에 걸쳐 입력된 정수는 각 로프의 중량을 의미합니다.
        int[] rope = new int[N];
        for (int i = 0; i < N; i++) {
            rope[i] = Integer.parseInt(br.readLine());
        }
        //Arrays.sort() 메서드를 사용하여 입력된 로프의 중량을 오름차순으로 정렬합니다.
        Arrays.sort(rope);
        int maxWeight = 0;
        //가장 무거운 로프부터 순서대로 선택하면서 선택한 로프의 중량과 선택한 로프의 개수를 곱한 값을 계산합니다.
        for (int i = N - 1; i >= 0; i--) {
            // 선택한 로프의 중량과 선택한 로프의 개수를 곱한 값을 계산합니다.
            int weight = rope[i] * (N - i);
            if (maxWeight < weight) {
                maxWeight = weight;
            }
        }
        System.out.println(maxWeight);
    }
}