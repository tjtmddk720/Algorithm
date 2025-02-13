import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws Exception {
        int num = Integer.parseInt(br.readLine());
        
        Deque<Integer> stack = new ArrayDeque<>();
        int sum = 0;

        for(int i = 0; i < num; i++) {
            int input = Integer.parseInt(br.readLine());

            if(input != 0) {
                stack.push(input);
                sum += input;
            }
            else {
                sum -= stack.pop();
            }
        }

        bw.write(sum + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}