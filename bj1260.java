import java.io.*;
import java.util.*;

public class bj1260 {
	static ArrayList<Integer>[] graph; // �׷��� ���� ����Ʈ
    static boolean[] visited;          // �湮 üũ �迭
    static StringBuilder sb = new StringBuilder();
	    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);	// ������ ����
        int m = Integer.parseInt(str[1]);	// ������ ����
        int v = Integer.parseInt(str[2]);	// Ž���� ������ ���� ���� ��ȣ
        
        graph = new ArrayList[n+1];
        for(int i=1;i<=n;i++) {
        	graph[i] = new ArrayList<>();
        }        
        
        for(int i=0;i<m;i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int a = Integer.parseInt(st.nextToken());
        	int b = Integer.parseInt(st.nextToken());
        	graph[a].add(b);
        	graph[b].add(a);
        }
        
        for(int i=1;i<=n;i++) {
        	Collections.sort(graph[i]);
        }
        
        visited = new boolean[n + 1];
        dfs(v);
        sb.append("\n");

        // BFS ����
        visited = new boolean[n + 1];
        bfs(v);

        System.out.println(sb.toString());
        
        bw.flush();
        bw.close();
    }
    static void dfs(int node) {
    	visited[node] = true;
    	sb.append(node).append(" ");
    	for(int next: graph[node]) {
    		if(!visited[next]) {
    			dfs(next);
    		}
    	}
    }
    static void bfs(int start) {
    	Queue<Integer> queue = new LinkedList<>();
    	visited[start] = true;
    	queue.offer(start);
    	
    	while(!queue.isEmpty()) {
    		int current = queue.poll();
    		sb.append(current).append(" ");
    		for(int next: graph[current]) {
    			if(!visited[next]) {
    				visited[next] = true;
    				queue.offer(next);
    			}
    		}
    	}
    }
}
