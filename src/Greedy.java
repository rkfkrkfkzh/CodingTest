import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
//Greedy 백준 11399 문제
public class Greedy {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // N명의 사람들
        int N = Integer.parseInt(br.readLine());
        // 순서에 따른 시간
        int Pi[] = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < Pi.length; i++) {
            Pi[i] = Integer.parseInt(st.nextToken());
        }
        // 정렬 해준다 오름차순으로
        Arrays.sort(Pi);
        // 초기화
        int sum = 0;
        int ps = 0;

        for (int i = 0; i < Pi.length; i++) {
            // sum에 누적 시간에 현시간을 더한다
            sum += ps + Pi[i];
            // 앞에 있는 사람의 누적시간
            ps += Pi[i];
        }
        System.out.println(sum);
    }


}
