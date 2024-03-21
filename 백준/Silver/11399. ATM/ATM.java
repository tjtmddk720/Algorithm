import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int [] arr = new int[N];
        int [] sum = new int[N];
        int result = 0;

        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 삽입 정렬을 사용해서 오름차순으로 정렬해야함
        // 처음부터 하나씩 선택해야함, 정렬한 후
        for(int i=1;i<N;i++){
            int insert_point = i;
            int insert_value = arr[i];

            // 현재 index와 정렬된 데이터들과 비교해서 삽입 위치 결정
            for(int j=i-1;j>=0;j--){
                if(arr[i]>arr[j]){
                    insert_point = j+1; // 정렬된 데이터보다 1 크도록
                    break; // for문 자체종료
                }
                if(j==0) insert_point = 0; // 첫번째 데이터인 경우 원래 자리에
            }

            // 삽입을 위해 삽입 위치에서 i까지 한 칸씩 밀기
            // 뒤에서부터 옮겨줘야 데이터 값이 보존됨
            for(int j=i; j>insert_point; j--){
                arr[j] = arr[j-1];
            }

            // 삽입 위치에 데이터 삽입
            arr[insert_point] = insert_value;
        }
        // 합배열 구하기
        sum[0]=arr[0];
        for(int i=1;i<N;i++){
            sum[i]=sum[i-1]+arr[i];
        }
        for(int i=0;i<N;i++){
            result+=sum[i];
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // write()에 전달하기 위해서는 string 문자형으로 바꿔야 출력됨
        bw.write(Integer.toString(result));
        bw.close();
    }
}