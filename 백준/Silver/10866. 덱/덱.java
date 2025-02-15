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
        Deque<Integer> deque = new ArrayDeque<>();

        while(num-- > 0){
            String[] input = br.readLine().split(" ");
            switch (input[0]){
                case "push_front" :
                    deque.addFirst(Integer.valueOf(input[1]));
                    break;

                case "push_back" :
                    deque.addLast(Integer.valueOf(input[1]));
                    break;

                case "pop_front" :
                    if(deque.isEmpty()) bw.write("-1\n");
                    else bw.write(deque.poll()+"\n");
                    break;

                case "pop_back" :
                    if(deque.isEmpty()) bw.write("-1\n");
                    else bw.write(deque.pollLast()+"\n");
                    break;

                case "size" :
                    bw.write(deque.size()+"\n");
                    break;

                case "empty" :
                    if(deque.isEmpty()) bw.write("1\n");
                    else bw.write("0\n");
                    break;

                case "front" :
                    if(deque.isEmpty()) bw.write("-1\n");
                    else bw.write(deque.getFirst()+"\n");
                    break;

                case "back" :
                    if(deque.isEmpty()) bw.write("-1\n");
                    else bw.write(deque.getLast()+"\n");
                    break;
            }
        }
        bw.close();
        br.close();
    }
}