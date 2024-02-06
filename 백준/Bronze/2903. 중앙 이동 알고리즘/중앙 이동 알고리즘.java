import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 초기 한 변의 점 : 2, 1번째 : 2+1=3 2번째 : 3+2 3번째 : 5+4 4번째 : 9+8 5번째 : 17+16
        // 한 변의 점^2
        int dot = 2;

        for(int i=0;i<N;i++){
            dot+=(dot-1);
        }
        System.out.println(dot*dot);
    }
}