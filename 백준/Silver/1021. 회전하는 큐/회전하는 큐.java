import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws Exception {
        String [] num = br.readLine().split(" ");
        int total = Integer.parseInt(num[0]);
        int inputNum = Integer.parseInt(num[1]);

        LinkedList<Integer> deque = new LinkedList<>();

        for(int i = 1; i<= total; i++){
            deque.add(i);
        }

        String [] inputs = br.readLine().split(" ");

        int i = 0;
        int cnt = 0;
        while(inputNum-- > 0){
            // 뽑아내려는 수의 위치
            int input = Integer.parseInt(inputs[i++]);

            // input의 덱에서의 위치
            double position = (double) deque.indexOf(input) / deque.size();

            // 덱의 앞쪽에 가까울 때 이동
            if(position < 0.5){
                while(deque.peek() != input){
                // 왼쪽으로 이동
                deque.add(deque.poll());
                cnt++;
                }
            }
            // 덱의 뒤쪽에 가까울 때 이동
            else {
                while(deque.peek() != input){
                    // 오른쪽으로 이동
                    deque.addFirst(deque.pollLast());
                    cnt++;
                }
            }
            // 이동 후 덱에서 뽑음
            deque.poll();
        }
        bw.write(cnt+"");
        bw.close();
        br.close();
    }
}