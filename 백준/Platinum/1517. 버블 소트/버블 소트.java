import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static int arr [];
    public static int tmp [];
    public static long count;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(bf.readLine());

        StringTokenizer st = new StringTokenizer(bf.readLine());

        arr = new int[N];
        tmp = new int[N];
        count = 0;
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        mergeSort(0,N-1);
        bw.write(Long.toString(count));
        bw.close();
    }
    // 병합정렬
    private static void mergeSort(int start,int end) {
        if (start == end) return;

        int middle = start + (end-start) / 2;
        mergeSort(start, middle);
        mergeSort(middle + 1, end);

        for (int i = start; i <=end; i++) {
            tmp[i] = arr[i];
        }
        int pointer1 = start;
        int pointer2 = middle + 1;
        int remain = middle-start+1; // 왼쪽 집합에 비교하지 않은 원소들의 개수
        int k = start;
        while (pointer1 <= middle && pointer2 <= end) {
            if (tmp[pointer1] > tmp[pointer2]) {
                arr[k] = tmp[pointer2];
                count+=remain;
                pointer2++;
                k++;
            } else {
                arr[k] = tmp[pointer1];
                k++;
                pointer1++;
                remain--;
            }
        }
        // 한 쪽 그룹이 모두 선택한 후 남아있는 원소 넣기
        while (pointer1 <= middle) {
            arr[k] = tmp[pointer1];
            k++;
            pointer1++;
        }
        while (pointer2 <= end) {
            arr[k] = tmp[pointer2];
            k++;
            pointer2++;
        }
    }
}