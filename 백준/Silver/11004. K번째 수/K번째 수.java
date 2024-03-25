import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int [] arr = new int[N];

        st = new StringTokenizer(bf.readLine()); // 한 줄씩 받을 때마다 써야됨
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        quickSort(arr,0,N-1,K-1);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(Integer.toString(arr[K-1]));
        bw.close();
}
    // quick sort 함수
    public static void quickSort(int[] A, int start,int end, int k) {
        if(start<=end){
            int pivot = partition(A,start,end);

            if(pivot==k) return;
            else if(k<pivot) quickSort(A,start,pivot-1,k);
            else quickSort(A,pivot+1,end,k);
        }
    }
    // partition 함수 -> pivot을 return 해줌(quick sort함수)
    public static int partition(int[] A,int start, int end){
        if(start+1==end){
            if(A[start]>A[end]) swap(A,start,end);
            return end;
        }
        int middle = (start+end)/2;
        swap(A,start,middle); // pivot은 middle에 있는 것으로 설정, 맨 앞으로 보내줌

        int pivot = A[start];
        int i=start+1,j=end;

        while(i<=j){ // i와 j가 엇갈리기 전까지
            while(A[j]>pivot&&j>=start+1) j--;
            while(A[i]<pivot&&i<=end) i++;
            if(i<=j) swap(A,i++,j--); // i와 j가 이동 마친 상태
        }
        A[start]=A[j]; // i가 아니라 j여야 pivot의 정확한 위치를 찾을 수 있음
        A[j]=pivot;
        
        return j;
    }
    // swap 함수
    public static void swap(int[] A, int start, int end){
        int tmp = A[start];
        A[start] = A[end];
        A[end] = tmp;
    }
}