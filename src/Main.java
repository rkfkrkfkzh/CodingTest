import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
        pq.add(Integer.parseInt(br.readLine()));
        }
        int sum = 0;
        while (pq.size()>1){
            int A = pq.poll();
            int B = pq.poll();
           sum += A+B;
           pq.add(A+B);
        }
        System.out.println(sum);
        }

}