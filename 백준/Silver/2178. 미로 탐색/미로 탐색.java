import java.io.*;
import java.util.*;

public class Main {
    static int N,M;
    static int[] dx = {-1,1,0,0}; // 상하
    static int [] dy = {0,0,-1,1}; // 좌우
    static boolean[][] visited;
    static int [][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N][M];
        visited = new boolean[N][M];

        for(int i=0;i<N;i++){
            String s = br.readLine();
            for(int j=0;j<M;j++){
                arr[i][j] = s.charAt(j)-'0';
            }
        }
        BFS(0,0);
        bw.write(Integer.toString(arr[N-1][M-1]));
        bw.close();
    }
    private static void BFS(int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{i,j});
        visited[i][j] = true;
        while(!queue.isEmpty()){
            int now [] = queue.poll();
            // 상하좌우 탐색
            for(int k=0;k<4;k++){
                int x = now[0]+dx[k];
                int y = now[1]+dy[k];
                if(x>=0 && y>=0 && x<N && y<M){
                    if(arr[x][y]!=0 && !visited[x][y]) {
                        visited[x][y] = true;
                        arr[x][y] = arr[now[0]][now[1]]+1; // 깊이 업데이트
                        queue.add(new int[]{x,y});
                    }
                }
            }
        }
    }
}