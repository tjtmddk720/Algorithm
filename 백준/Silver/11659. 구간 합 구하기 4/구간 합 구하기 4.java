import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 첫째 줄에 수의 개수 N과 합을 구해야하는 횟수 M 주어짐
        // 둘째 줄에 N개의 수가 주어짐 셋째줄부터는 합을 구해야하는 구간 i와 j가 주어짐

        int N = sc.nextInt();
        int M = sc.nextInt();
        int [] arr = new int[N+1];
        int result = 0;
        arr[0]=0;

        for(int i=1;i<N+1;i++){
            arr[i] = arr[i-1] + sc.nextInt();
        }
        for(int k=0;k<M;k++){

            int i = sc.nextInt();
            int j = sc.nextInt();

            result = arr[j]-arr[i-1];

            System.out.println(result);
        }
    }
}