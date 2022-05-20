import java.io.IOException;

public class test12 {
    public static void main(String[] args) throws IOException {
        int a = System.in.read(); // System.in 은 byte 값으로 문자 한 개만 읽으면서 해당 문자에 대응되는 아스키코드 값을 저장
        System.out.println(a);
    }
} // IOException (java.io 패키지를 import 해야함) 로 메인 옆에 써주어도 되고, 그냥 Exception 으로 처리