import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] input= br.readLine().split(" ");
        int M= Integer.parseInt(input[0]);
        int N= Integer.parseInt(input[1]);
        String str = " ";

        //각 바구니 번호에 맞게 공을 넣음
        int [] result=new int[M+1];
        for(int i=1;i<=M;i++){
            result[i]=i;
        }
        for(int i=0;i<N;i++) {
            String[] num = br.readLine().split(" ");
            int num1 = Integer.parseInt(num[0]);
            int num2 = Integer.parseInt(num[1]);

            //역순으로 뒤집기
            while(num1<num2) {
                int tmp=0;
                tmp = result[num2];
                result[num2--]=result[num1];
                result[num1++] = tmp;
            }
        }
        for(int i=1;i<M+1;i++){
            str+=result[i]+" ";
        }
        
        //str에 출력값을 담아준 후 trim()메서드를 사용해 맨 뒤에 있는 공백 제거
        System.out.print(str.trim());
    }
}