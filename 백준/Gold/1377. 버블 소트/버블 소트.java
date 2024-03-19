import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        mData[] arr = new mData[N];

        for (int i = 0; i < N; i++) {
            arr[i] = new mData(Integer.parseInt(bf.readLine()), i);
        }
        // 정렬이 끝난 다음 루프가 언제인지 구하는 것 -> swap이 안 일어날 때
        // 정렬한 배열과 정렬 전 배열을 비교해서 왼->오로 이동한 거리가 가장 큰 값을 찾은 후 +1을 더하면 됨

        // compareTo 메서드에 따라 value 값을 기준으로 오름차순으로 정렬
        Arrays.sort(arr);

        int Max = 0;
        for (int i = 0; i < N; i++) {
            // 정렬 전 index - 정렬 후 index
            if (Max < arr[i].index - i)
                Max = arr[i].index - i;
        }
        System.out.println(Max + 1);
    }
}
    class mData implements Comparable<mData> {
        int value;
        int index;

        public mData(int value, int index){
            super();
            this.value = value;
            this.index = index;
        }
        @Override
        public int compareTo(mData o){
            // value 기준 오름차순 정렬
            return this.value - o.value;
        }
    }