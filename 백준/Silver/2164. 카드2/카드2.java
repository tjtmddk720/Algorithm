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
        int num = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();

        // add offer 차이 - 꽉 찼을 때 예외발생 여부 o x(false 반환)
        // poll peek remove 차이 - 제거하고 반환, 비어있을 때 null 반환 | 반환 o 제거 x null 반환 | 반환 o 제거 x 예외발생 o

        // 위에서부터 1 ~ num 까지의 숫자
        // 제일 위에 있는 카드는 버림, 그 다음 카드는 제일 아래로 보냄
        // 마지막에 남게 되는 수를 구함

        // 버리는 건 poll, 아래로 보내는 건 poll하면서 offer

        for(int i = 1; i <= num; i++){
            queue.add(i);
        }

        while (queue.size() > 1){
            queue.poll();
            queue.offer(queue.poll());
        }

        bw.write(queue.peek()+"");
        bw.close();
        br.close();
    }
}