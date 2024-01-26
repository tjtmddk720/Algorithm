import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력으로 색종이 개수, 각 색종이의 좌표 순으로 받음(크기 10인 정사각형)
        // 각 좌표를 boolean을 이용해 T로 표시한 후 더하면 넓이를 구할 수 있음

        int num = sc.nextInt();
        boolean arr [][] = new boolean[101][101];
        int result = 0;

        for(int i=0;i<num;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            for(int a = x; a<x+10; a++){
                for (int b = y; b<y+10;b++){
                    arr[a][b]=true;
                }
            }
        }
        for(int x=0;x<=100;x++){
            for(int y=0;y<=100;y++){
                if(arr[x][y]==true) result++;
            }
        }
        System.out.println(result);
    }
}