import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] arr = new int[N];

        for(int i=0;i<N;i++) {
            arr[i] = sc.nextInt();
        }
        // 1부터 n까지의 수를 스택에 넣었다가 뽑아 늘어놓음으로써, 하나의 수열을 만듦
        // push하는 순서는 반드시 오름차순으로
        // pop해서 나오는 수로 수열을 만듦
        // 원하는 수와 같아질 때까지 push함
        // 해당 수가 나오면 pop
        // stack은 라이브러리 활용할 수 있음
        
        Stack<Integer> stack = new Stack<>();
        int num = 1;
        StringBuffer bf = new StringBuffer();
        boolean result = true;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=num){
                while(arr[i]>=num){
                    stack.push(num++);
                    bf.append("+\n");
                }
                stack.pop();
                bf.append("-\n");
            } else {
                int n = stack.pop();

                if(n>arr[i]){
                    System.out.println("NO");
                    result = false;
                    break;
                } else bf.append("-\n");
            }
        }
        if(result) System.out.println(bf.toString());
    }
}