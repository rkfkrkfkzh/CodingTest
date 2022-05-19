import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];

        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int max = 0;
        int index = 0;

        int count = 0;

//      for( A : B)오른쪽의 리스트의 인덱스를 순차적으로 접근하여 왼쪽에 있는 변수에 저장하겠다는 것
        for (int value : arr) {
            count++;
            if (value > max) {
                max = value;
                index = count;
            }
        }
        System.out.println(index);
        System.out.println(max);
    }
}
