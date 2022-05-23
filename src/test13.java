import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test13 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];    // 0부터 9까지 체크할 길이 10의 int 배열을 생성
        int val = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
//      val 에 br.readLine()로 읽은 값을 곱해서 저장
        String str = String.valueOf(val);
//      str 에 val 의 Int 타입을 String 타입으로 변환
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) - 48]++;
//      ASCII Code 문자를 10진으로 변환해서 -48해준다
        }
        for (int v : arr) { // arr 값 v로 계속 넘겨줌 arr 다 될 때까지
            System.out.println(v);
        }
    }
}