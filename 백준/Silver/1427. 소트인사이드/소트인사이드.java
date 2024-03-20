import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int [] arr = new int[str.length()];

        for(int i=0;i<str.length();i++){
            arr[i] = Integer.parseInt(str.substring(i,i+1));
        }

        // 내림차순이므로 최댓값을 찾음
        // max를 index로 해야함 -> 아니면 값 자체가 바뀌어버릴 수 있음
        for(int i=0;i<str.length();i++){
            int max = i;
            for(int j=i+1;j<str.length();j++){
                if(arr[max]<arr[j]){
                    max = j;
                }
            }
            if(arr[max]>arr[i]){
                int tmp = arr[i];
                arr[i] = arr[max];
                arr[max] = tmp;
            }
        }
        for(int i=0;i<str.length();i++){
            System.out.print(arr[i]);
        }
    }
}