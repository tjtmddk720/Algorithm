import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        //알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램
        //대소문자 구분 X, 가장 많이 사용된 단어가 여러개이면 ?로

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase();

        //str에 해당하는 알파벳의 인덱스를 증가시킴
        int [] alpha = new int[26];
        for(int i=0;i<str.length();i++){
            int num = str.charAt(i)-'A';
            alpha[num]++;
        }

        //가장 많이 사용된 알파벳을 max로 구함
        int max = 0;
        char ch = '?';
        for(int i = 0;i<alpha.length;i++){
            if(max<alpha[i]){
                max = alpha[i];
                ch = (char)(i+'A');
            }
            else if(max==alpha[i]) ch = '?';
        }
        System.out.print(ch);
    }
}