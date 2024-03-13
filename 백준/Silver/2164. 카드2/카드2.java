import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int result;

        // 카드가 한 장 남을 때까지 반복
        // 제일 위에 있는 카드를 버림 -> 제일 위에 있는 카드를 제일 아래 카드 밑으로 옮김
        // 제일 마지막에 남게 되는 카드 출력
        // N이 1일 때는 1을 출력 1이 아닐 떈 위 규칙을 따라야 함
        // 카드가 1장보다 많을 떄만 반복해야함 -> while문
        // 처음 숫자들을 다 큐에 넣음
        // 버리는 것을 poll로, 밑으로 옮기는 건 poll하고 다시 add하는 걸로 표현

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }
        while (queue.size() > 1) {
            queue.poll();
            queue.add(queue.poll());
        }
        result = queue.peek();
        
        // 출력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(Integer.toString(result)); // 정수를 문자열로 변환하여 출력
        bw.newLine(); // 새로운 줄로 이동
        bw.close();
    }
}