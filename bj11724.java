import java.io.*;
import java.util.*;

public class bj11724 {
	static ArrayList<Integer>[] graph;	// 	���� ����Ʈ�� �׷��� ����
	static boolean[] visited;	// ���� �湮 ���� üũ
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);	// ������ ����
        int m = Integer.parseInt(str[1]);	// ������ ����
        
        graph = new ArrayList[n + 1];
        visited = new boolean[n + 1];
        for(int i=0;i<=n;i++) {		// �׷��� �ʱ�ȭ
        	graph[i] = new ArrayList<>();
        }
        
        for(int i=0;i<m;i++) {	//	���� ���� ����
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	// ������ �� ���� 
        	int u = Integer.parseInt(st.nextToken());	
        	int v = Integer.parseInt(st.nextToken());
        	graph[u].add(v);
        	graph[v].add(u);
        }
        
    	int count = 0;	// ���� ��� ���� 
    	for(int i = 1; i <= n; i++) {	// ���� ��� Ȯ��
	         if (!visited[i]) {
	             dfs(i);
	             count++;
	         }
	    }
        
        bw.write(count + "\n");	// ���
        
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
