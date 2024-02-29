import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int DNA_length = sc.nextInt();
    static int partial_length = sc.nextInt();
    static char[] DNA = new char[DNA_length];
    static String inputDNA = sc.next();
    static int[] essential = new int[4];
    static int[] now = new int[4];
    static int count = 0;
    public static void main(String[] args) {

        // 첫째줄에는 임의로 만든 DNA 문자열의 길이 S, 비밀번호로 사용할 부분문자열의 길이 P
        // 임의로 만든 DNA 문자열
        // 부분 문자열에 포함되어야할 A, C, G, T의 최소 개수
        // 만들 수 있는 비밀번호의 종류 출력

        //  TODO 1. DNA 문자열을 배열에 저장함
        //  TODO 2. 부분 문자열은 시작 인덱스와 끝 인덱스를 옮기는 슬라이딩 윈도우를 사용
        //  TODO 3. 조건을 만족하면 배열에 ++;

        // DNA 배열에 저장
        for (int j = 0; j < DNA_length; j++) {
            DNA[j] = inputDNA.charAt(j);
        }

        // 부분 문자열에 포함되어야할 A, C, G, T의 최소 개수 배열에 저장
        for (int i = 0; i < 4; i++) {
            essential[i] = sc.nextInt();
        }

        // 맨 처음 부분문자열이 조건을 만족하는지 체크
        for (int k = 0; k < partial_length; k++) {
            if (DNA[k] == 'A') now[0]++;
            if (DNA[k] == 'C') now[1]++;
            if (DNA[k] == 'G') now[2]++;
            if (DNA[k] == 'T') now[3]++;
        }
        if(equals()==true) count++;

        // 현재의 맨처음 문자열을 없애고 마지막+1의 문자열을 추가한 후 체크
        for(int j=partial_length;j<DNA_length;j++) {
            int i = j - partial_length; // 이전 문자열의 시작을 나타내는 문자

                // 이전 문자열의 시작에서 해당되는 조건을 뺆
                if (DNA[i] == 'A') now[0]--;
                if (DNA[i] == 'C') now[1]--;
                if (DNA[i] == 'G') now[2]--;
                if (DNA[i] == 'T') now[3]--;

                // 새로 추가된 문자에서 해당되는 조건을 추가
                if (DNA[j] == 'A') now[0]++;
                if (DNA[j] == 'C') now[1]++;
                if (DNA[j] == 'G') now[2]++;
                if (DNA[j] == 'T') now[3]++;

                if (equals() == true) count++;
        }
        System.out.println(count);
    }
    // A, C, G, T의 현재 개수가 최소 개수를 만족하는지 체크
    public static boolean equals() {
        for (int i = 0; i < 4; i++) {
            if (now[i] < essential[i]) {
                return false;
            }
        }
        return true;
    }
}