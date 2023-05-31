import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String []str = {"c=","c-","dz=","d-","lj","nj","s=","z="};
        int cnt = 0;
        String words = br.readLine();

        for(int i =0;i<str.length;i++){
            //str 배열에 있는 단어를 한 단어로 인식시켜야됨
            if(words.contains(str[i]))
                words = words.replace(str[i],"*");
        }
        System.out.print(words.length());
    }
}