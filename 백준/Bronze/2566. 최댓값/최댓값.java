import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력을 2차원 행렬로 받음
        // 입력에서 첫 번째 숫자를 max로 두고 비교
        
        int[][] array = new int[9][9];

        int max = 0;
        int row=1;
        int column=1;
        
        for(int x=0;x<9;x++){
            for(int y=0;y<9;y++){
                array[x][y]=sc.nextInt();
                
                if(max<array[x][y]){
                    max = array[x][y];
                    row=x+1;
                    column=y+1;
                }
            }
        }
        System.out.println(max);
        System.out.println(row+" "+column);
    }
}