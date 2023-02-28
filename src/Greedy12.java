import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Greedy12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // PriorityQueue는 Java에서 제공하는 우선순위 큐 자료구조입니다.
        // 우선순위 큐는 데이터가 들어올 때마다 자동으로 정렬되며, 우선순위가 높은 데이터가 먼저 꺼내집니다.
        // 이 문제에서는 오름차순으로 정렬하기 위해 기본적으로 제공되는 우선순위 큐를 사용하였습니다.
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            pq.add(Integer.parseInt(br.readLine()));
        }
        int sum = 0;
        // while문을 사용하여 우선순위 큐의 원소가 1개 이상 남아있는 동안 다음 작업을 반복
        while (pq.size() > 1) {
            int A = pq.poll(); // 우선순위 큐에서 가장 작은 수(A)와
            int B = pq.poll(); // 그 다음으로 작은 수(B)를 꺼냅니다.
            sum += A + B; // A와 B를 더한 값을 sum 변수에 더해줍니다.
            pq.add(A + B); // A와 B를 더한 값을 우선순위 큐에 다시 넣어줍니다.
        }
        System.out.println(sum);
    }

}