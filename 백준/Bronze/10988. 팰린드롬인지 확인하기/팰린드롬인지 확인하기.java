import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        //앞으로 읽을 때와 거꾸로 읽을 때 똑같은 단어인지 확인
        //팰린드롬이면 1, 아니면 0을 출력

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int result = 1;

        //처음과 마지막을 한글자씩 비교해 다르면 0출력
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length()-i-1)) result = 0;
        }
        System.out.print(result);
    }
}