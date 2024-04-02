import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<Integer> [] list;
    static boolean visited [];
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int count = 0;

        list = new ArrayList[N+1];
        visited  = new boolean[N+1];

        for(int i=1;i<N+1;i++){
            list[i] = new ArrayList<>();
        }

        for(int i=0;i<M;i++) {
            st = new StringTokenizer(bf.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            list[u].add(v);
            list[v].add(u);
        }
        for(int i=1;i<N+1;i++){
            if(!visited[i]){
                count++;
                DFS(i);
            }
        }
        bw.write(Integer.toString(count));
        bw.close();
    }
    static void DFS(int v){
        if(visited[v]) return; // 모두 방문했을 때
        visited[v] = true;
        for(int i : list[v]){ // 현재 노드의 연결 노드 중 방문하지 않은 노드로 DFS 실행
            if(visited[i]==false) DFS(i);
        }
    }
}