import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test {

    public static void main(String[] args) throws IOException {
//        readLine에 대한 exception
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        입력을 받는 클래스인 InputStreamReader(System.in)을 객체로 생성
//        해당 객체에서 각 입력을 버퍼에 저장하여 string에 저장할 수 있는 BufferedReader 클래스의 객체를 생성

//        InputStream 은 Byte 단위로 data를 처리한다.
//        System.in 의 type도 InputStream 이다.

//        InputStreamReader 은 문자(character) 단위로 데이터를 처리할 수 있도록 돕는다.
//        InputStream 의 데이터를 문자로 변환하는 중개 역할을 한다.

//        BufferedReader 은 스트림에 버퍼를 두어 문자를 버퍼에 일정 정도 저장해둔 뒤 한 번에 보낸다.

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
//        BufferedReader의 method인 readLine()을 이용
//        위의 readLine메소드를 통해 저장되는 변수는 항상 string이어야 하는데,
//        만약 이를 다시 숫자형으로 변환하고 싶다면 Integer.parseInt()를 사용한다.
        br.close();

        StringBuilder sb = new StringBuilder();
//        StringBuilder의 객체를 생성
//        append()의 인자로 연결하고자 하는 문자열을 넣어 StringBuilder의 객체를 통해 호출
        sb.append(A * (B % 10));
        sb.append('\n');

        sb.append(A * ((B % 100) / 10));
        sb.append('\n');

        sb.append(A * (B / 100));
        sb.append('\n');

        sb.append(A * B);

        System.out.print(sb);

    }

}