import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(bf.readLine());
        int [] arr = new int[N];

        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(bf.readLine());
        }
        Radix_Sort(arr,5);
        for(int i=0;i<N;i++) {
            bw.write(Integer.toString(arr[i])+"\n");
        }
        bw.close();
    }
    public static void Radix_Sort(int[] A,int max_size) {
        int[] output = new int[A.length];
        int jarisu = 1;
        int count = 0;
        while(count!=max_size) {
            int[] bucket = new int[10]; // 0~9, 각 자릿수가 몇 개 있는지 카운팅
            for(int i=0;i<A.length;i++){
                bucket[(A[i]/jarisu)%10]++; // 일의 자리부터 bucket에 넣어줌
            }
            for(int i=1;i<10;i++){
                bucket[i]+=bucket[i-1]; // 합배열을 통해 각 자릿수의 시작 위치(index)를 알 수 있음
            }
            for(int i=A.length-1;i>=0;i--) {
                output[bucket[(A[i]/jarisu%10)]-1] = A[i]; // 알아낸 index릁 통해 값을 output배열에 저장
                bucket[(A[i]/jarisu)%10]--;
            }
            for(int i=0;i<A.length;i++){
                A[i]=output[i]; // 결과를 다시 A배열에 복사
            }
            jarisu*=10;
            count++;
        }
    }
}