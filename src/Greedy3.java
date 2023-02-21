import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Greedy3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 첫 번째 줄에서는 회의의 개수 N을 입력받습니다.

        int[][] meeting = new int[N][2];
        StringTokenizer st;
        for (int i = 0; i < N; i++) { // 이후 두 번째 줄부터 N+1번째 줄까지 회의의 시작 시간과 끝나는 시간을 입력받아 2차원 배열 meeting에 저장합니다.
            st = new StringTokenizer(br.readLine());
            meeting[i][0] = Integer.parseInt(st.nextToken()); //회의의 시작 시간
            meeting[i][1] = Integer.parseInt(st.nextToken()); //회의의 끝나는 시간
        }
        Arrays.sort(meeting, new Comparator<int[]>() { //meeting 배열을 끝나는 시간을 기준으로 오름차순으로 정렬합니다.
            // 끝나는 시간이 같은 경우 시작 시간이 빠른 것을 우선으로 합니다. 이를 위해 Comparator 인터페이스를 사용합니다.
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }

        });
        int count = 0; // count 변수를 0으로 초기화하고, end_time 변수를 0으로 초기화합니다.
        int end_time = 0;
        for (int i = 0; i < N; i++) { //meeting 배열을 처음부터 끝까지 반복하면서, 현재 회의의 시작 시간이 end_time보다
            // 크거나 같은 경우(count++)를 새로운 회의를 배정합니다. 이 때, end_time 변수를 현재 회의의 끝나는 시간으로 업데이트합니다.
            if (end_time <= meeting[i][0]) {
                end_time = meeting[i][1];
                count++;
            }
        }
        System.out.print(count);
    }
}

