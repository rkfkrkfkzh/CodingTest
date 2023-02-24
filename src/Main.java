import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int price = Integer.parseInt(br.readLine());
        int[] changes = {500, 100, 50, 10, 5, 1};

        int change_coin = 1000 - price;
        int count = 0;
        for (int i = 0; i < changes.length; i++) {
            count += change_coin / changes[i];
            change_coin = change_coin % changes[i];
        }
        System.out.println(count);
    }
}
