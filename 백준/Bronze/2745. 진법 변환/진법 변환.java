import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // B진법 수 N을 10진법으로 바꿔 출력
        // N과 B진법 수 입력 -> 10진법으로 출력

        String N = sc.next();
        int B = sc.nextInt();
        int result=0;
        int num=1;
        
        // 숫자는 오른쪽부터, 문자열은 왼쪽부터 시작

        for(int i=N.length()-1;i>=0;i--){
            char c = N.charAt(i);

            if(c>='A'&&c<='Z') {
                result += (c-'A'+10) * num;
            }
            else {
                result += (c-'0') * num;
            }
            num*=B;
        }
        System.out.println(result);
    }
}