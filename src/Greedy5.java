import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Greedy5 {
    public static void main(String[] args) throws IOException {
        // 콘솔에서 한 줄의 문자열을 입력받는 BufferedReader 객체를 생성합니다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 입력받은 문자열을 "-" 기호를 기준으로 분리하여 배열에 저장합니다.
        String[] split = br.readLine().split("-");
        // 결과값을 저장할 변수 answer를 0으로 초기화합니다.
        int answer = 0;
        // 분리된 문자열을 반복하면서 각 부분합을 계산합니다.
        for (int i = 0; i < split.length; i++) {
            // "-"로 분리된 문자열을 다시 "+" 기호를 기준으로 분리하여 숫자를 추출합니다.
            String[] subSplit = split[i].split("\\+");
            // 각 부분합을 저장할 변수 subSum을 0으로 초기화합니다.
            int subSum = 0;
            // "+"로 분리된 문자열을 반복하면서 숫자를 추출하여 subSum에 더합니다.
            for (String num : subSplit) {
                subSum += Integer.parseInt(num);
            }
            // 첫 번째 부분합이면 subSum 값을 answer에 저장하고, 그 이후의 부분합이면 subSum 값을 answer에서 빼서 계산합니다.
            if (i == 0) {
                answer = subSum;
            } else {
                answer -= subSum;
            }
        }
        // 최종 결과값을 출력합니다.
        System.out.println(answer);
    }
}