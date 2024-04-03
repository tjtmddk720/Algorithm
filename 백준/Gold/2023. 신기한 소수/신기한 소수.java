import java.io.*;
public class Main {
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(bf.readLine());

        DFS(2,1);
        DFS(3,1);
        DFS(5,1);
        DFS(7,1);
    }
        // DFS 함수
     static void DFS ( int number, int jarisu){
        if (jarisu == N) {
            if (isPrime(number)) {
                System.out.println(number);
            }
            return;
        }
        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0) continue; // 짝수이면 탐색 멈춤
            if (isPrime(number * 10 + i)) {
                DFS(number * 10 + i, jarisu + 1);
            }
        }
    }
    // 소수 판별 함수
    static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}