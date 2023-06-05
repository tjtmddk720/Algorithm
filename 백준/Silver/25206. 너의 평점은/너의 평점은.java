import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        String []grade = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F", "P"};
        double []score={4.5,4.0,3.5,3.0,2.5,2.0,1.5,1.0,0.0};
        double sum = 0.0;
        int credit = 0;
        
        for(int i=0;i<20;i++){
            String[] arr = br.readLine().split(" ");
            for(int j=0;j<9;j++){
                if(!arr[2].equals('P')) {
                    if (arr[2].equals(grade[j])) {
                        double num = Double.parseDouble(arr[1]);
                        sum += num * score[j];
                        credit += num;
                    }
                }
            }
        }
        double avg = sum/credit;
        System.out.printf("%.6f",avg);
    }
}