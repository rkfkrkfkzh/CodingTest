import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Greedy6 {
    public static void main(String[] args) throws IOException {
        // 먼저, BufferedReader를 이용해 입력 값을 받습니다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int price = Integer.parseInt(br.readLine());
        // 거스름돈에 필요한 동전의 종류를 배열에 저장합니다.
        int[] changes = {500, 100, 50, 10, 5, 1};
        // 거슬러 줘야 할 돈입니다. 이 값을 change_coin 변수에 저장합니다.
        int change_coin = 1000 - price;
        int count = 0;
        for (int i = 0; i < changes.length; i++) {
            //거슬러 줄 돈(change_coin)을 해당 동전의 가치로 나눈 몫을 count 변수에 더합니다.
            count += change_coin / changes[i];
            //남은 거스름돈을 해당 동전의 가치로 나눈 나머지로 업데이트합니다.
            change_coin = change_coin % changes[i];
        }
        //동전 종류를 모두 확인하고 나면, count 변수에는 필요한 동전의 최소 개수가 저장됩니다
        System.out.println(count);
    }
}
