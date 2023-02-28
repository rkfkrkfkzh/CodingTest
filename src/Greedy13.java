import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Greedy13 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //첫 번째 줄에서는 테스트 케이스의 수를 입력 받습니다.
        int testCase = Integer.parseInt(br.readLine());
        // 그리고 while 반복문을 이용하여 각각의 테스트 케이스를 처리합니다.
        while (testCase-- > 0) {
            int num = Integer.parseInt(br.readLine());
            int[][] score = new int[num][2];
            for (int i = 0; i < num; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                score[i][0] = Integer.parseInt(st.nextToken()); //서류심사 성적
                score[i][1] = Integer.parseInt(st.nextToken()); //면접심사 성적
            }
            Arrays.sort(score, (a, b) -> a[0] - b[0]); //오름차순으로 정렬
            int cnt = 1;
            int update = score[0][1];
            //면접심사 성적을 비교
            for (int i = 1; i < num; i++) {
                if (score[i][1] < update) {
                    cnt++;
                    //update 변수를 이용하여 면접심사 성적이 가장 높은 지원자의 성적을 저장
                    update = score[i][1];
                }
            }
            System.out.println(cnt);

        }
    }
}