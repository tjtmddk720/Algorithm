import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String S = br.readLine();

        int[] arr = new int[26];

        for(char c : S.toCharArray()) {
            arr[c - 'a']++;
        }
        for(int i = 0; i< 26; i++) {
            bw.write(arr[i] + " ");
        }
        bw.flush();
        bw.close();
    }
}