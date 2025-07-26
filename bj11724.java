import java.io.*;
import java.util.*;

public class bj11724 {
	static ArrayList<Integer>[] graph;	// 	인접 리스트로 그래프 저장
	static boolean[] visited;	// 정점 방문 여부 체크
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);	// 정점의 개수
        int m = Integer.parseInt(str[1]);	// 간선의 개수
        
        graph = new ArrayList[n + 1];
        visited = new boolean[n + 1];
        for(int i=0;i<=n;i++) {		// 그래프 초기화
        	graph[i] = new ArrayList<>();
        }
        
        for(int i=0;i<m;i++) {	//	간선 정보 저장
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	// 간선의 양 끝점 
        	int u = Integer.parseInt(st.nextToken());	
        	int v = Integer.parseInt(st.nextToken());
        	graph[u].add(v);
        	graph[v].add(u);
        }
        
    	int count = 0;	// 연결 요소 개수 
    	for(int i = 1; i <= n; i++) {	// 연결 요소 확인
	         if (!visited[i]) {
	             dfs(i);
	             count++;
	         }
	    }
        
        bw.write(count + "\n");	// 출력
        
        bw.flush();
        bw.close();
    }
    static void dfs(int node) {
    	visited[node] = true;
    	for(int next: graph[node]) {
    		if(!visited[next]) {
    			dfs(next);
    		}
    	}
	}
}
