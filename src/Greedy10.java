import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Greedy10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 도시의 개수 입력
        long[] distances = new long[n - 1]; // 각 도시 사이의 거리를 저장하는 배열
        long[] prices = new long[n]; // 각 도시의 기름 가격을 저장하는 배열

        // 첫번째 줄에서 각 도시 사이의 거리를 입력받아 distances 배열에 저장
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n - 1; i++) {
            distances[i] = Long.parseLong(st.nextToken());
        }
        // 두번째 줄에서 각 도시의 기름 가격을 입력받아 prices 배열에 저장
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            prices[i] = Long.parseLong(st.nextToken());
        }
        long totalPrice = 0; // 총 비용을 저장하는 변수
        long minPrice = prices[0]; // 최소 기름 가격을 저장하는 변수

        // 각 도시를 순회하면서 최소 기름 가격을 찾고, 이를 이용하여 총 비용을 계산
        for (int i = 0; i < n - 1; i++) {
            if (minPrice > prices[i]) { // 현재까지의 최소 기름 가격보다 더 싼 가격을 발견한 경우
                minPrice = prices[i]; // 최소 기름 가격을 업데이트
            }
            totalPrice += minPrice * distances[i]; // 최소 기름 가격으로 주유한 비용을 더함

        }
        System.out.println(totalPrice); // 총 비용 출력
    }
}
//이 코드의 시간 복잡도는 O(n)입니다.