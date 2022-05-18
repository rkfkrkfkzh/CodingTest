import java.util.Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class test10 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        int N = Integer.parseInt(br.readLine());
        Integer.parseInt(br.readLine()); //첫 줄 N 은 안쓰이므로 입력만 받는다.
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

//        int index = 0;
//        int[] arr = new int[N];

        int max = -1000001;
        int min = 1000001;
//     max 에는 가장 작은 값으로, min 에는 가장 큰 값으로 초기화

//        hasMoreTokens() 는 StringTokenizer 에 토큰이 남아있으면 true, 비어있으면 false를 반환
        while(st.hasMoreTokens()) {
//            arr[index] = Integer.parseInt(st.nextToken());
//            index++;
            int val = Integer.parseInt(st.nextToken());
            if(val>max) {
                max = val;
            }
            if(val<min) {
                min = val;
            }
        }
//        Arrays.sort(arr);
//        System.out.print(arr[0] + " " + arr[N - 1]);
        System.out.println(min + " " + max);
    }
}
//    배열을 사용하면 최악의 경우 시간복잡도가 O(N^2) 이지만 배열을 사용하지 않고
//    즉시 비교하는 경우 시간복잡도가 O(N) 이므로 훨씬 시간이 단축