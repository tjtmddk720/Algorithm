import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws Exception {
        int num = Integer.parseInt(br.readLine());
        Deque<Integer> stack = new ArrayDeque<>();
        List<String> list = new ArrayList<>();

        int max = 0;

        int tmp = num;
        while(tmp-- >= 1) {
            int input = Integer.parseInt(br.readLine());

            if(input > max) {
                for(int i = max+1; i <= input; i++) {
                    stack.push(i);
                    list.add("+");
                }
                max = input;
            }

            if(stack.peek() == input) {
                stack.pop();
                list.add("-");
            } else {
                list.clear();
                list.add("NO");
                break;
            }
        }
        for(String s : list) {
            bw.write(s+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}