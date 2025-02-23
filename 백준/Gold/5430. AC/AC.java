import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        int testCase = Integer.parseInt(br.readLine());

        while (testCase-- > 0) {
            String cmd = br.readLine();
            int num = Integer.parseInt(br.readLine());
            Deque<Integer> deque = new ArrayDeque<>();
            StringBuilder sb = new StringBuilder();

            // 입력받은 배열을 파싱하여 deque에 삽입
            String inputArr = br.readLine().replaceAll("[\\[\\]]", "");
            if (num > 0) {
                String[] tokens = inputArr.split(",");
                for (String token : tokens) {
                    deque.add(Integer.parseInt(token));
                }
            }

            boolean isReversed = false;
            boolean isError = false;

            for (int i = 0; i < cmd.length(); i++) {
                if (cmd.charAt(i) == 'R') {
                    isReversed = !isReversed;
                } else if (cmd.charAt(i) == 'D') {
                    if (deque.isEmpty()) {
                        sb.append("error");
                        isError = true;
                        break;
                    }
                    if (isReversed) {
                        deque.pollLast();
                    } else {
                        deque.pollFirst();
                    }
                }
            }

            if (isError) {
                bw.write(sb + "\n");
            } else {
                sb.append("[");
                while (!deque.isEmpty()) {
                    if (isReversed) {
                        sb.append(deque.pollLast());
                    } else {
                        sb.append(deque.pollFirst());
                    }
                    if (!deque.isEmpty()) sb.append(",");
                }
                sb.append("]");
                bw.write(sb + "\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
