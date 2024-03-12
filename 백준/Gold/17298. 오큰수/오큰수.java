import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {

        // 오큰수
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int [] arr = new int[N];
        int [] result = new int[N];
        String[] str = bf.readLine().split(" ");

        // 입력
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(str[i]);
        }

        // 비교하고 오큰수가 있으면 오큰수 출력, 없으면 -1 출력
        // 처음에는 아무것도 없으므로 배열의 첫 번쨰 수를 넣음
        // 스택은 인덱스로 표현, 해당 수를 push하기 전 stack에 있는 수와 비교한 후 push
        // stack에 있는 수보다 들어오는 수가 크면 pop하고 결과배열에 인덱스의 값 저장

        Stack <Integer> stack = new Stack<>();
        stack.push(0);
        for(int i=1;i<N;i++) {
            while(!stack.isEmpty()&&arr[stack.peek()]<arr[i]){
                result[stack.pop()]=arr[i];
            }
            stack.push(i);
        }

        // 반복문이 끝났는데 stack이 비어있지 않을 때
        while(!stack.isEmpty()){
            result[stack.pop()]=-1;
        }

        // 출력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0;i<N;i++){
            bw.write(result[i]+" ");
        }
        bw.write("\n");
        bw.flush(); // 남아 있는 데이터 모두 출력
    }
}