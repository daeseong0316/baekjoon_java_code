import java.io.*;
import java.util.*;

public class bj2606 {
	static ArrayList<Integer>[] graph;
	static boolean[] visited;
	static int count = 0;	// 1�� ��Ʈ��ũ�� ���� �� ���̷����� ���� 
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int u = Integer.parseInt(br.readLine());	// ��ǻ�� ��
        int v = Integer.parseInt(br.readLine());	// ��Ʈ��ũ ����
        
        graph = new ArrayList[u+1];
        visited = new boolean[u+1];
        for(int i=1;i<=u;i++) {		// �ʱ�ȭ
        	graph[i] = new ArrayList<>();
        }
        
        for(int i=0;i<v;i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	// �� �־� ��Ʈ��ũ �󿡼� ���� ����Ǿ� �ִ� ��ǻ���� ��ȣ ��
        	int a = Integer.parseInt(st.nextToken());
        	int b = Integer.parseInt(st.nextToken());
        	// ��Ʈ��ũ ����
        	graph[a].add(b);
        	graph[b].add(a);
        }
        
        bfs(1);	// 1������ ����
        
        bw.write(String.valueOf(count));	// ���� ���
        
        bw.flush();
        bw.close();
    }
    static void bfs(int node) {		// 1�� ��Ʈ��ũ�� ���� ���̷����� �ɸ� ��Ʈ��ũ ã�� BFS�Լ�
    	Queue<Integer> que = new LinkedList<>();
    	visited[node] = true;
    	que.offer(node);
    	
    	while(!que.isEmpty()) {
    		int cur = que.poll();
    		for(int next: graph[cur]) {
    			if(!visited[next]) {
    				visited[next] = true;
    				que.offer(next);
    				count++;	// ��ǻ�� �� ����
    			}
    		}
    	}
    }
}
