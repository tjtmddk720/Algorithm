import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;


public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static List<Integer> stack = new LinkedList<>();
    public static void main(String[] args) throws Exception {
         int num = Integer.parseInt(br.readLine());

        while (num-- > 0) {
            String[] cmd = br.readLine().split(" ");
            if(cmd[0].equals("push")) {
                push(Integer.parseInt(cmd[1]));
            }
            else if(cmd[0].equals("pop")) {
                pop();
            }
            else if(cmd[0].equals("size")) {
                size();
            }
            else if(cmd[0].equals("empty")) {
                empty();
            }
            else {
                top();
            }
        }
        br.close();
    }
    public static void push(int x){
        stack.add(x);
    }
    public static void pop(){
        if(!stack.isEmpty()) {
            System.out.println(stack.get(stack.size() - 1));
            stack.remove(stack.size() - 1);
        }
        else
            System.out.println(-1);
    }
    public static void size(){
        System.out.println(stack.size());
    }
    public static void empty(){
        if(stack.isEmpty()){
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
    }
    public static void top(){
        if(!stack.isEmpty()){
            System.out.println(stack.get(stack.size()-1));
        }
        else
            System.out.println(-1);
    }
}