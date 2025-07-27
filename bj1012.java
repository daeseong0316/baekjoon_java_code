import java.io.*;
import java.util.*;

public class bj1012 {
	static int[][] field;	// 2���� �迭�� �� ���� �� �����ϱ� ���� 2���� �迭
    static boolean[][] visited;		// ���߰� �ִ��� Ȯ���ϴ� �迭
    static int[] dx = {0, 0, -1, 1};	// ������ ��, ��
    static int[] dy = {-1, 1, 0, 0};	// ������ ��, ��
    static int n, m;	// ���� �� ����, ���� ����
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int t = Integer.parseInt(br.readLine());	// �׽�Ʈ ����
        
        while(t-- > 0) {
        	String[] str = br.readLine().split(" ");
        	m = Integer.parseInt(str[0]);	// ���� �� ���� ����
        	n = Integer.parseInt(str[1]);	// ���� �� ���� ����
        	int k = Integer.parseInt(str[2]);	// ���߰� �ɾ��� �ִ� ��ġ�� ���� 
        	
        	field = new int[n][m];			// ���� �� �ʱ�ȭ
        	visited = new boolean[n][m];	// �湮 �迭 �ʱ�ȭ
        	
        	for(int i=0;i<k;i++) {
        		StringTokenizer st = new StringTokenizer(br.readLine());
        		// ���� ��ġ
        		int x = Integer.parseInt(st.nextToken());
        		int y = Integer.parseInt(st.nextToken());
        		field[y][x] = 1;	// ���� �ִ� ��ġ 1�� �ٲٱ�
        	}
        	
        	int count = 0;	// ������������ ���� ��
        	// ��� ĭ�� ���鼭 �湮���� ���� ���߰� ������ BFS Ž��
        	for (int i=0;i<n;i++) {
                for (int j=0;j<m;j++) {
                	// ���� �湮���� ���� ���� �ϳ��� ã��
                    if (field[i][j] == 1 && !visited[i][j]) {	// ���߰� �����鼭 �湮���� ���� ��ġ
                        bfs(i, j);
                        count++;
                    }
                }
            }

            bw.write(count + "\n");	// ������������ ���� �� ���
        }
        
        bw.flush();
        bw.close();
    }
    // BFS�� ���� �����¿� ������ ���ߵ��� ��� Ž���ϸ� �湮 ó��
    static void bfs(int x, int y) {
    	// �ش� ���߿� ����� ��� ���ߵ��� ť�� Ž��
    	Queue<int[]> que = new LinkedList<>();
    	que.offer(new int[] {x, y});
    	visited[x][y] = true;
    	
    	// ť���� �ϳ��� �����鼭 �� ��ġ�� ������ ���ߵ��� �ٽ� ť�� ����
    	while(!que.isEmpty()) {
    		int[] cur = que.poll();
    		int cx = cur[0];
            int cy = cur[1];
    		for(int i=0;i<4;i++) { // �����¿� ���� Ž��
    			int nx = cx + dx[i];
                int ny = cy + dy[i];
                
                // ���� ���� �ְ�, ���߰� ������ ���� �湮���� �ʾҴٸ�
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
