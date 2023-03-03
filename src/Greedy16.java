import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Greedy16 {
    static int INF = 987654321;

    public static void main(String[] args) throws IOException {
        // 입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken()); // 시작점 A
        int B = Integer.parseInt(st.nextToken()); // 도착점 B
        br.close();
        // BFS 탐색으로 A에서 B로 가는 최소 연산 횟수 계산
        int result = bfs(A, B);
        System.out.println(result);  // 결과 출력
    }

    // BFS 탐색으로 A에서 B로 가는 최소 연산 횟수 계산
    public static int bfs(int A, int B) {
        Queue<Integer> q = new LinkedList<>();
        q.add(B); // Queue에는 처음에 B를 넣어줍니다.
        int cnt = 1;
        // while문을 사용하여 Queue가 빌 때까지 반복
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int value = q.poll(); // Queue에서 하나의 값을 뽑아내어 value에 저장
                if (A == value) { // value와 A가 같으면 cnt 값을 반환
                    return cnt;
                }
                if (value % 2 == 0 && value >= 2) { // 2를 곱하는 연산
                    q.add(value / 2);
                }
                if (value % 10 == 1 && value >= 10) { // 가장 오른쪽에 1을 추가하는 연산
                    q.add(value / 10);
                }// 이때, 2로 나누거나 가장 오른쪽에 1을 추가한 값이 범위를 벗어나면 Queue에 넣지 않습니다.
            }
            cnt++; // 연산 횟수 증가
        }
        return -1; // A에서 B로 가는 경로가 없는 경우
    }
}