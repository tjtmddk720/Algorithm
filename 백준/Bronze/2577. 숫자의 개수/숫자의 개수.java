import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        int result = A*B*C;

        int[] arr = new int[10];

        while(result > 0) {
            arr[result % 10]++;
            result /= 10;
        }
        for (int digitCount: arr) {
            bw.write(digitCount + "\n");
        }
        bw.flush();
        bw.close();
    }
}