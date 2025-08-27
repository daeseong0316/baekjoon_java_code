import java.io.*;
import java.util.*;

public class bj1012 {
	static int[][] field;	// 2차원 배열로 된 배추 밭 저장하기 위한 2차원 배열
    static boolean[][] visited;		// 배추가 있는지 확인하는 배열
    static int[] dx = {0, 0, -1, 1};	// 배추의 왼, 오
    static int[] dy = {-1, 1, 0, 0};	// 배추의 상, 하
    static int n, m;	// 배추 밭 가로, 세로 길이
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int t = Integer.parseInt(br.readLine());	// 테스트 개수
        
        while(t-- > 0) {
        	String[] str = br.readLine().split(" ");
        	m = Integer.parseInt(str[0]);	// 배추 밭 가로 길이
        	n = Integer.parseInt(str[1]);	// 배추 밭 세로 길이
        	int k = Integer.parseInt(str[2]);	// 배추가 심어져 있는 위치의 개수 
        	
        	field = new int[n][m];			// 배추 밭 초기화
        	visited = new boolean[n][m];	// 방문 배열 초기화
        	
        	for(int i=0;i<k;i++) {
        		StringTokenizer st = new StringTokenizer(br.readLine());
        		// 배추 위치
        		int x = Integer.parseInt(st.nextToken());
        		int y = Integer.parseInt(st.nextToken());
        		field[y][x] = 1;	// 배추 있는 위치 1로 바꾸기
        	}
        	
        	int count = 0;	// 배추흰지렁이 마리 수
        	// 모든 칸을 돌면서 방문하지 않은 배추가 있으면 BFS 탐색
        	for (int i=0;i<n;i++) {
                for (int j=0;j<m;j++) {
                	// 아직 방문하지 않은 배추 하나를 찾음
                    if (field[i][j] == 1 && !visited[i][j]) {	// 배추가 있으면서 방문하지 않은 위치
                        bfs(i, j);
                        count++;
                    }
                }
            }

            bw.write(count + "\n");	// 배추희지렁이 마리 수 출력
        }
        
        bw.flush();
        bw.close();
    }
    // BFS를 통해 상하좌우 인접한 배추들을 모두 탐색하며 방문 처리
    static void bfs(int x, int y) {
    	// 해당 배추와 연결된 모든 배추들을 큐로 탐색
    	Queue<int[]> que = new LinkedList<>();
    	que.offer(new int[] {x, y});
    	visited[x][y] = true;
    	
    	// 큐에서 하나씩 꺼내면서 그 위치와 인접한 배추들을 다시 큐에 넣음
    	while(!que.isEmpty()) {
    		int[] cur = que.poll();
    		int cx = cur[0];
            int cy = cur[1];
    		for(int i=0;i<4;i++) { // 상하좌우 방향 탐색
    			int nx = cx + dx[i];
                int ny = cy + dy[i];
                
                // 범위 내에 있고, 배추가 있으며 아직 방문하지 않았다면
                if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                    if (field[nx][ny] == 1 && !visited[nx][ny]) {
                        visited[nx][ny] = true;
                        que.offer(new int[] { nx, ny });
                    }
                }
    		}
    	}
    }
}
