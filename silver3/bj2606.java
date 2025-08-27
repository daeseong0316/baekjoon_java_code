import java.io.*;
import java.util.*;

public class bj2606 {
	static ArrayList<Integer>[] graph;
	static boolean[] visited;
	static int count = 0;	// 1번 네트워크와 연결 된 바이러스의 개수 
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int u = Integer.parseInt(br.readLine());	// 컴퓨터 수
        int v = Integer.parseInt(br.readLine());	// 네트워크 연결
        
        graph = new ArrayList[u+1];
        visited = new boolean[u+1];
        for(int i=1;i<=u;i++) {		// 초기화
        	graph[i] = new ArrayList<>();
        }
        
        for(int i=0;i<v;i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	// 한 쌍씩 네트워크 상에서 직접 연결되어 있는 컴퓨터의 번호 쌍
        	int a = Integer.parseInt(st.nextToken());
        	int b = Integer.parseInt(st.nextToken());
        	// 네트워크 연결
        	graph[a].add(b);
        	graph[b].add(a);
        }
        
        bfs(1);	// 1번부터 시작
        
        bw.write(String.valueOf(count));	// 개수 출력
        
        bw.flush();
        bw.close();
    }
    static void bfs(int node) {		// 1번 네트워크로 인해 바이러스에 걸린 네트워크 찾는 BFS함수
    	Queue<Integer> que = new LinkedList<>();
    	visited[node] = true;
    	que.offer(node);
    	
    	while(!que.isEmpty()) {
    		int cur = que.poll();
    		for(int next: graph[cur]) {
    			if(!visited[next]) {
    				visited[next] = true;
    				que.offer(next);
    				count++;	// 컴퓨터 수 증가
    			}
    		}
    	}
    }
}
