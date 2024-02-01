import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 10진법 수 N, B진법 입력 -> N을 B진법수로 출력

        int N = sc.nextInt();
        int B = sc.nextInt();
        String result = "";

        // N을 B로 나누고 나머지와 몫을 저장하는 방식으로
        while (N!=0) {
            if (N % B >= 10) {
                result += (char)(N % B + 'A'-10);
            }
            else {
                result+=N%B;
            }
            N/=B;
        }
       for(int i=result.length()-1;i>=0;i--){
           System.out.print(result.charAt(i));
       }
    }
}