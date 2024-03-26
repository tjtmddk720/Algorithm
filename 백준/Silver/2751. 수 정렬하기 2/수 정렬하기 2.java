import java.io.*;

public class Main {
    public static int[] arr;
    public static int[] tmp;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(bf.readLine());
        arr = new int[N];
        tmp = new int[N];
        for (int i = 0; i <N; i++) {
            arr[i] = Integer.parseInt(bf.readLine());
        }
        mergeSort(0,N-1);

        for(int i=0;i<N;i++){
            bw.write(Integer.toString(arr[i])+'\n');
        }
        bw.close();
    }

    // 병합정렬 함수
    public static void mergeSort(int start, int end){
        if(start==end) return; // 원소가 1개이면 X

        int middle = start+(end-start)/2;
        mergeSort(start,middle);
        mergeSort(middle+1,end);

        for(int i=start;i<=end;i++) {
            tmp[i] = arr[i];
        }
        int pointer1 = start;
        int pointer2 = middle+1;
        int k=start;
        while(pointer1<=middle&&pointer2<=end){
            if(tmp[pointer1]>tmp[pointer2]){
                arr[k]=tmp[pointer2];
                k++;
                pointer2++;
            } else {
                arr[k]=tmp[pointer1];
                k++;
                pointer1++;
            }
        }
        // 한 쪽 그룹이 모두 선택한 후 남아있는 원소 넣기
        while(pointer1<=middle){
            arr[k] = tmp[pointer1];
            k++;
            pointer1++;
        }
        while(pointer2<=end){
            arr[k] = tmp[pointer2];
            k++;
            pointer2++;
        }
    }
}