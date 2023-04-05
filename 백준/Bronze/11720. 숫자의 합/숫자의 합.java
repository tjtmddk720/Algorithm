import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int sum=0;
        // getBytes() : 문자열을 byte 배열로 변환
        for(byte value:br.readLine().getBytes()){
            sum+=value-'0';
        }

        System.out.println(sum);
        br.close();
    }
}