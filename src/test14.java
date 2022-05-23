import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class test14 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> h = new HashSet<Integer>();    //  HashSet<Integer> 으로 타입을 Integer로 선언
//        HashSet 은 자바 Collection 중 Set 의 파생클래스
//        중복되는 원소를 넣을 경우 하나만 저장한다. 즉, 중복원소를 허용하지 않는다
//        HashSet 은 순서 개념이 없다. 따라서 Collections.sort() 메소드를 사용할 수 없다.
//        만약 정렬을 하고 싶다면 리스트로 변환 후 정렬해야한다.


        for (int i = 0; i < 10; i++) {
            h.add(Integer.parseInt(br.readLine())%42);
//            HashSet.add() 메소드는 HashSet에 저장하는 메소드
//            이 메소드에서 값을 넣을 때 만약 중복되는 값이 없으면 HashSet 에 저장되면서 True 를 반환하고,
//            만약 중복되어 저장되지 않으면 False 를 반환
        }
        System.out.println(h.size());
//        HashSet.size() 는 HashSet 의 크기(= 저장되어 있는 원소의 개수)를 반환
//        HashSet 에 저장하면서 들어간 원소의 개수가 HashSet 의 사이즈

    }
}