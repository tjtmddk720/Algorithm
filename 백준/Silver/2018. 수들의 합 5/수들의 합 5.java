import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N을 연속된 자연수의 합으로 나타낼 수 있는 개수
        // 투포인터를 이용
        // sum>N이면 sum-startIndex; startIndex++;
        // sum==N이면 endIndex++; sum=sum+endIndex; count++;
        // sum<N이면 endIndex++; sum=sum+endIndex;

        int N = sc.nextInt();

        // 자기 자신인 경우
        int sum = 1, count = 1;
        int starIndex = 1, endIndex = 1;

        while (endIndex != N) {
            if (sum == N) {
                count++;
                endIndex++;
                sum+=endIndex;
            }
            else if (sum < N) {
                endIndex++;
                sum+=endIndex;
            } else {
                sum -= starIndex;
                starIndex++;
            }
        }
        System.out.println(count);
    }
}