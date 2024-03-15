import java.io.*;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        
        // 우선순위큐를 사용하지만, 절댓값이 작은 순으로 정렬이므로 직접 정의해줌
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> {
            int first_abs = Math.abs(o1);
            int second_abs = Math.abs(o2);

            // 디폴트가 오름차순으로, 선행원소가 더 작은 게 디폴트
            // return값이 음수이면 원래 자리, 양수이면 자리를 바꿔줌
            if(first_abs==second_abs){
                return o1<o2?-1:1;
            } else {
                return first_abs-second_abs;
            }
        });
        for(int i=0;i<N;i++){
            int num = Integer.parseInt(bf.readLine());
            if(num==0){
                if(queue.isEmpty()) System.out.println(0);
                else {
                    System.out.println(queue.poll());
                }
            } else {
                queue.add(num);
            }
        }
    }
}