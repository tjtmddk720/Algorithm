import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        // 알파벳 개수만큼 배열을 만듦
        int [] arr = new int[26];

        // arr을 전부 -1로 초기화
        for(int i=0;i<arr.length;i++){
            arr[i]=-1;
        }

        /* arr의 값은 문자열에서 문자의 위치(str의 인덱스)
           arr의 인덱스는 알파벳의 위치
           알파벳 위치는 아스키 코드 이용
           ex) 문자 a는 문자인 'a'를 빼면 숫자 0이 됨 문자 b는 'a'를 빼면 숫자 1이 됨 */
        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            if (arr[ch - 'a'] == -1) arr[ch - 'a'] = i;
        }
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
        br.close();
    }
}