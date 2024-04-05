import java.io.*;
import java.util.*;

public class Main {
    static ArrayList <Integer> [] list;
    static boolean visited [];
    static ArrayList <Integer> DFSresult;
    static ArrayList <Integer> BFSresult;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        DFSresult = new ArrayList<>();
        BFSresult = new ArrayList<>();

        list = new ArrayList[N+1];
        for(int i=1;i<N+1;i++){
            list[i] = new ArrayList<>();
        }
        for(int i=1;i<M+1;i++){
            st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());

            list[num1].add(num2);
            list[num2].add(num1);
        }
        // 번호가 작은 것을 먼저 방문하기 위해 정렬
        for(int i=1;i<N+1;i++){
            Collections.sort(list[i]);
        }
        visited = new boolean[N+1];
        DFS(V);
        for(int i:DFSresult){
            bw.write(i+" ");
        }
        bw.newLine();
        visited = new boolean[N+1];
        BFS(V);
        for(int i:BFSresult){
            bw.write(i+" ");
        }
        bw.flush();
      }
    static void DFS(int num) {
        DFSresult.add(num);
        visited[num] = true;

        for(int i : list[num]) {
            if(visited[i]==false){
                DFS(i);
            }
        }
    }
    static void BFS(int num) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(num);
        visited[num] = true;

        while(!queue.isEmpty()){
            int now_Node = queue.poll();
            BFSresult.add(now_Node);
            for(int i:list[now_Node]){
                if(!visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }
}