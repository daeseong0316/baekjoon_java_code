import java.io.*;
import java.util.*;

public class bj1926 {
	static int[][] paper;		// 2차원 배열로 된 종이
	static boolean[][] visited;	// 방문 여부 확인
	static int n, m;	// 종이 크기
	
	static int[] dx = {-1, 1, 0, 0};	// 좌, 후
    static int[] dy = {0, 0, -1, 1};	// 상, 하
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] str = br.readLine().split(" ");
        n = Integer.parseInt(str[0]);	// 세로
        m = Integer.parseInt(str[1]);	// 가로
        
        // 초기화 작업
        paper = new int[n][m];
        visited = new boolean[n][m];
        
        for(int i=0;i<n;i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	for(int j=0;j<m;j++) {
        		paper[i][j] = Integer.parseInt(st.nextToken());	// 0은 색칠이 안된 부분, 1은 색칠이 된 부분을 의미한다
        	}
        }
        
        int count = 0;	// 그림의 개수
        int max = 0;	// 가장 넓은 그림의 넓이
        
        for(int i=0;i<n;i++) {
        	for(int j=0;j<m;j++) {
        		if(paper[i][j] == 1 && !visited[i][j]) {	// 색칠이 되어 있으면서, 방문하지 않은 부분
        			int area = bfs(i, j);	// 넓이 저장
        			count++;
        			max = Math.max(max, area);	// 가장 넓은 넓이 찾기
        		}
        	}
        }
        
        // 출력
        bw.write(count + "\n");
        bw.write(max + "\n");
        
        bw.flush();
        bw.close();
    }
    public static int bfs(int x, int y) {
    	Queue<int[]> que = new LinkedList<>();
    	que.offer(new int[] {x, y});
    	visited[x][y] = true;
    	int area = 1;
    	
    	while(!que.isEmpty()) {
    		int[] cur = que.poll();
            int cx = cur[0];
            int cy = cur[1];

            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                    if (paper[nx][ny] == 1 && !visited[nx][ny]) {
                        visited[nx][ny] = true;
                        que.offer(new int[]{nx, ny});
                        area++;
                    }
                }
            }
    	}
        return area;
    }
}
