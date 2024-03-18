import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
       BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
       int N = Integer.parseInt(bf.readLine());
       int [] arr = new int[N];

       for(int i = 0;i<N;i++){
           arr[i] = Integer.parseInt(bf.readLine());
       }
       for(int j = 0;j<N-1;j++){ // loop 수(정렬할 수-1)
           for (int i = 0; i < N - 1 - j; i++) { // loop를 돌수록 뒤에서부터 정렬할 수가 줄어듦
               if (arr[i] > arr[i + 1]) {
                   int tmp = arr[i + 1];
                   arr[i + 1] = arr[i];
                   arr[i] = tmp;
               }
           }
       }
       for(int i = 0;i<N;i++){
           System.out.println(arr[i]);
       }
    }
}