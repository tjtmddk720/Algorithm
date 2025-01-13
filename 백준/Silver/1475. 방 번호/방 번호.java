import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[10];
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        while(n > 0){
            arr[n % 10]++;
            n /= 10;
        }

        for(int i = 0; i < 10; i++){
            if(i == 6 || i == 9) continue;
            cnt = Math.max(cnt, arr[i]);
        }

        cnt = Math.max(cnt, (arr[6] + arr[9] + 1) / 2);

        bw.write(String.valueOf(cnt));

        bw.flush();
        bw.close();
    }
}