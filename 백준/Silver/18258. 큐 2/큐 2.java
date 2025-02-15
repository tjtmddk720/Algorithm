import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(br.readLine());
        Queue<String> queue = new LinkedList<>();
        String last = "";

        while(n-- > 0){
            String[] input = br.readLine().split(" ");
            switch(input[0]){
                case "push" :
                    last = input[1];
                    queue.add(last);
                    break;

                case "pop" :
                    if(!queue.isEmpty()){
                        bw.write(queue.poll()+"\n");
                    }else {
                        bw.write("-1\n");
                    }
                    break;

                case "size" :
                    bw.write(queue.size()+"\n");
                    break;

                case "empty" :
                    if(queue.isEmpty()) bw.write("1\n");
                    else bw.write("0\n");
                    break;

                case "front" :
                    if(queue.isEmpty()) bw.write("-1\n");
                    else bw.write(queue.peek()+"\n");
                    break;

                case "back" :
                    if(queue.isEmpty()) bw.write("-1\n");
                    else bw.write(last+"\n");
                    break;
            }
        }
        bw.close();
        br.close();
    }
}