import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    public static void main(String[] args) throws Exception {
        // 첫째줄 수학여행에 참가하는 학생 수 n, 한 방에 배정할 수 있는 최대 인원 수 k - 공백 분리
        // n개의 줄에는 학생 성별 s(0-여, 1-남), 학년 y(1~6) - 공백 분리
        
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        // 성별, 학년
        int[][] arr = new int[2][7];

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[x][y]++;
        }

        int cnt = 0;
        for(int i=0; i<2; i++){
            for(int j=1; j<7; j++){
                cnt += (arr[i][j]+1)/2;
            }
        }
        bw.write(Integer.toString(cnt));
        bw.flush();
        bw.close();
    }
}