import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<Integer>[] list;
    static boolean visited [];
    static boolean result;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        list = new ArrayList[N];
        visited = new boolean[N];
        result = false;

        for(int i=0;i<N;i++){
            list[i] = new ArrayList<Integer>();
        }

        for(int i=0;i<M;i++){
            st = new StringTokenizer(bf.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list[a].add(b);
            list[b].add(a);
        }
        for(int i=0;i<N;i++){
            DFS(i,1);
            if(result) break;
        }
        // 문제의 조건에 맞는 A, B, C, D, E가 존재하면 1을 없으면 0을 출력
        if(result) System.out.println(1);
        else System.out.println(0);
    }
    public static void DFS(int now, int depth){
        if(depth==5||result) {
            result=true;
            return;
        }
        visited[now] = true;
        for(int i:list[now]){
            if(!visited[i]){
                DFS(i,depth+1);
            }
        }
        visited[now] = false; // 그래프가 연결되어 있지 않을 때 다른 노드에서 다시 시작할 수도 있음
    }
}