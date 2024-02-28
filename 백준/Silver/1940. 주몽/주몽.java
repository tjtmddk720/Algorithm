import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 첫째줄에는 재료의 개수 N
        // 둘째줄에는 갑옷을 만드는데 필요한 수 M
        // 셋째줄에는 N개의 재료들이 가진 고유의 번호
        // 두 재료의 고유번호의 합이 M이 돼야함

        int N = sc.nextInt();
        int M = sc.nextInt();
        int [] arr = new int[N];
        int startIndex, endIndex;
        int count = 0;

        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);

        startIndex = 0;
        endIndex = N-1;

        while(startIndex<endIndex){
            int sum = arr[startIndex]+arr[endIndex];
            if(sum==M){
                count++;
                startIndex++;
                endIndex--;
            } else if(sum>M){
                endIndex--;
            } else {
                startIndex++;
            }
        }
        System.out.println(count);
    }
}