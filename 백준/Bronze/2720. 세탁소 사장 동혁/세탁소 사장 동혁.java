import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        // 쿼터(Quarter, $0.25)의 개수, 다임(Dime, $0.10)의 개수, 니켈(Nickel, $0.05)의 개수, 페니(Penny, $0.01)의 개수 반환
        int Q = 25;
        int D = 10;
        int N = 5;
        int P = 1;

        // 124/25=4 124-100=24/10
        for(int i=0;i<T;i++){
            int C = sc.nextInt();

            System.out.print(C/Q);
            C=C-C/Q*Q;
            System.out.print(" "+C/D);
            C=C-C/D*D;
            System.out.print(" "+C/N);
            C=C-C/N*N;
            System.out.print(" "+C/P);
            C=C-C/P*P;
            System.out.println();
        }
    }
}