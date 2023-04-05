import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // String으로 입력 받은 후 char형으로 변환
        // int형으로 변환
        Scanner sc = new Scanner(System.in);
        int result = sc.next().charAt(0);
        System.out.println(result);
    }
}