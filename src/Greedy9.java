import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Greedy9 {
    public static void main(String[] args) throws IOException {
        //BufferedReader와 InputStreamReader 클래스를 사용하여 입력을 받아옵니다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //입력받은 값을 정수형으로 변환하여 T에 저장합니다.
        int T = Integer.parseInt(br.readLine());
        //버튼의 시간을 배열에 저장합니다.
        int[] time = {300, 60, 10};
        //각 버튼을 누른 횟수를 저장할 배열을 초기화합니다.
        int[] count = new int[3];
        //버튼의 개수만큼 반복문을 실행합니다.
        for (int i = 0; i < time.length; i++) {
            //count 배열에 T를 버튼 시간으로 나눈 몫을 저장합니다.
            count[i] = T / time[i];
            //T를 버튼 시간으로 나눈 나머지를 T에 대입합니다.
            T %= time[i];
        }
        //T가 0이 아니면, 정확하게 T초를 만들 수 없으므로 "-1"을 출력합니다.
        if (T != 0) {
            System.out.println(-1);

        } else {
            //T가 0이면, count 배열에 저장된 각 버튼을 누른 횟수를 출력합니다.
            System.out.printf("%d %d %d\n", count[0], count[1], count[2]);
        }
        //BufferedReader 클래스를 닫습니다.
        br.close();
    }
}
// 입력이 1개만 주어지므로 BufferedReader 클래스를 사용하여 입력을 받았습니다.
// 이를 통해 입력 속도를 높일 수 있습니다.
// 또한, 문제에서 주어진 버튼 시간을 미리 배열에 저장하여 반복문을 사용하여 계산하였습니다.
// 이를 통해 코드의 길이를 줄일 수 있고, 계산 속도도 높일 수 있습니다.
// 마지막으로, 정확하게 T초를 만들 수 없는 경우에는 "-1"을 출력하도록 처리되었습니다.
