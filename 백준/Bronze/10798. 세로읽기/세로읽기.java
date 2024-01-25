import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력을 2차원 행렬로 받음
        // 출력은 세로로 공백 없이
        // 비어있을 경우 스킵하고 출력

        char [][] array = new char[5][15];

       for(int x=0;x<array.length;x++){
           String str = sc.next();

           for(int y=0;y<str.length();y++){
              array[x][y] = str.charAt(y);
           }
       }
        for(int a=0;a<15;a++){
            for(int b=0;b<array.length;b++){
                if (array[b][a] == '\0') continue;
                System.out.print(array[b][a]);
            }
        }
    }
}