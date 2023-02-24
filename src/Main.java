import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split("-");
        int result = 0;
        for (int i = 0; i < split.length; i++) {
            String[] sub_split = split[i].split("\\+");
            int sum = 0;
            for (String num : sub_split) {
                sum += Integer.parseInt(num);
            }
            if (i == 0) {
                result += sum;
            } else {
                result -= sum;
            }

        }
        System.out.println(result);
    }
}