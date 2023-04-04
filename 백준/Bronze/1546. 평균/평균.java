import javax.swing.plaf.basic.BasicButtonUI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        
        //시험의 과목 수 N을 입력받음
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // N의 개수만큼 과목을 공백으로 구분하여 입력받음
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        double [] sub=new double[N];
        int i=0;
        while(st.hasMoreTokens()){
            sub[i]=Integer.parseInt(st.nextToken());
            i++;
        }

        // 최댓값을 구함
        Arrays.sort(sub);
        double max=sub[N-1];

        // 각 점수를 점수/M*100로 바꾸고 합을 구함
        double sum=0;
        for(int k=0;k<N;k++){
            sub[k]=sub[k]/max*100;
            sum+=sub[k];
        }

        // 평균을 구함
        System.out.println(sum/N);
    }
}
