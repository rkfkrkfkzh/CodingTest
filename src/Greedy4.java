import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Greedy4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //  첫 번째 줄에서는 배열의 크기 N을 입력받습니다.
        int N = Integer.parseInt(br.readLine());

        int[] A = new int[N];
        int[] B = new int[N];
        // 두 번째 줄에서는 배열 A의 원소들을 입력받아 A 배열에 저장합니다.
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        // 세 번째 줄에서는 배열 B의 원소들을 입력받아 B 배열에 저장합니다.
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            B[i] = Integer.parseInt(st.nextToken());

        }
        // A와 B 배열을 오름차순으로 정렬합니다.
        Arrays.sort(A);
        Arrays.sort(B);
        // S 변수를 0으로 초기화합니다.
        int S = 0;
        // A 배열과 B 배열을 반복하면서, A[i]와 B[N-i-1]을 곱한 값을 S에 더합니다. 이 때, B 배열의 원소는 역순으로 접근합니다.
        for (int i = 0; i < N; i++) {
            S += A[i] * B[N - 1 - i];

        }
        System.out.print(S);
    }
}
// 이 코드는 A와 B 배열을 오름차순으로 정렬한 후, 각 배열에서 가장 작은 수와 가장 큰 수를 곱하여 S 값을 계산하는 방식으로 함수 S의 값을 최소화하는 문제를 해결하는 코드입니다.
// B 배열을 Comparator.reverseOrder()이나 Collections.reverseOrder()의 내림차순을 이용하여 A[i]*B[i]로 계산할수 도 있다