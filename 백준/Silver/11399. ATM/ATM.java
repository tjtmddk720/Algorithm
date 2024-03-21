import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int [] arr = new int[N];
        int [] sum = new int[N];
        int result = 0;

        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        for(int i=0;i<N;i++){
            for(int j=0;j<=i;j++){
                sum[i] += arr[j];
            }
            result+=sum[i];
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // write()에 전달하기 위해서는 string 문자형으로 바꿔야 출력됨
        bw.write(Integer.toString(result));
        bw.close();
    }
}