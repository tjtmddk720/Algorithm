import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int x = Integer.parseInt(br.readLine());

        int cnt = 0;
        HashSet<Integer> occur = new HashSet<>();

        for(int i = 0; i<n; i++){
            if(x - arr[i] > 0 && occur.contains(x - arr[i])){
                cnt++;
            }
            occur.add(arr[i]);
        }
        bw.write(cnt + "\n");
        bw.flush();
        bw.close();
    }
}