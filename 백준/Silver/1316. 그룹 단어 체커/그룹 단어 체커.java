import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String [] str=new String[N];
        
        // 그룹 단어 개수
        int cnt = 0;

        for(int i = 0;i<N;i++){
            str[i]=br.readLine();
            
            // boolean을 이용해 중복체크, boolean 디폴트는 false
            boolean []isChecked = new boolean[26];
            boolean isGroup = true;
            
            for(int j=0;j<str[i].length();j++){
                
                // 해당 알파벳 위치를 알기위함
                int idx = str[i].charAt(j)-'a';

                // 중복되었을 때
                if(isChecked[idx]){
                    
                    // 연속되지 않았을 때
                    if(str[i].charAt(j)!=str[i].charAt(j-1)){
                        isGroup=false;
                        break;
                    }
                }
                // 중복 표시
                else isChecked[idx]=true;
            }
            // 그룹단어일 때
            if(isGroup) cnt++;
        }
        System.out.print(cnt);
    }
}