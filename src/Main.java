import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        StringTokenizer str0 = new StringTokenizer(S, "0");
        StringTokenizer str1 = new StringTokenizer(S, "1");
        System.out.println(Math.min(str1.countTokens(), str0.countTokens()));
    }
}