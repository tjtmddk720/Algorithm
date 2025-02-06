import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        // 1~N까지 원을 이루면서 앉아있음, 양의 정수 K가 주어짐
        // K번쨰 사람 제거 - N명의 사람이 모두 제거될 때까지 반복
        // 입력값 N, K
        String [] input = br.readLine().split(" ") ;
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);

        // n의 위치는 n-1번쨰, n-1이 0번째
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        
        bw.write("<");

        // 첫 번째로 k번째 위치 찾을 때
        int index = k-1;
        bw.write(list.get(index)+"");
        list.remove(index);
        int size = 0;

        // 현재 위치를 기반으로 +(k-1)만큼 이동해야함
        while(!list.isEmpty()){
            index += k-1;
            size = list.size();
            if(index >= size){
                index = index % size;
            }
            bw.write(", "+list.get(index));
            list.remove(index);
        }

        bw.write(">");
        bw.flush();
        bw.close();
    }
}