import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 첫 줄에 테스트케이스 T 입력받음
        int T = Integer.parseInt(br.readLine());

        // 각 테스트케이스는 반복 횟수 R, 문자열 S 공백으로 구분해서 입력받음
        for(int i=0;i<T;i++){
            String [] str = br.readLine().split(" ");
            int R = Integer.parseInt(str[0]);
            String S = str[1];

            for(int j=0;j<S.length();j++){
                for(int k=0;k<R;k++){
                    System.out.print(S.charAt(j));
                }
            }
            System.out.println();
        }
    }
}