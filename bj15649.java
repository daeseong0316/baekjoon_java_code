import java.io.*;
import java.util.*;

public class bj15649 {
	static int[] arr;	// ���� ���õ� ���� ����
	static boolean[] visit;	// ���� ��� ����
	static StringBuilder sb = new StringBuilder();	// ���ڿ� ��� ����
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 1���� N���� �ڿ��� �߿��� �ߺ� ���� M���� �� ����
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        
        arr = new int[m];
        visit = new boolean[n];
        dfs(n, m, 0);
        
        bw.write(sb.toString());	// ���� ���
        
        br.close();
        bw.flush();
        bw.close();
    }
    public static void dfs(int n, int m, int depth) {
    	if(depth == m) {	// ������ ���̰� m�� �Ǹ� ���
    		for(int val: arr) {
    			sb.append(val).append(" ");	// ���� ������ ���ڿ��� ����
    		}
    		sb.append("\n");	// ����
    		return;
    	}
    	for(int i=0;i<n;i++) {	// 1���� n���� ���ڸ� ���ʴ�� �õ�
    		if(!visit[i]) {	// ���� ������� ���� ���ڶ��
    			visit[i] = true;	// �湮 ó��
    			arr[depth] = i+1;	// ���� ��ġ�� ���� ���� 
    			dfs(n, m, depth+1);	// ���� ���� Ž��
    			
    			visit[i] = false;	// ��Ʈ��ŷ �湮 ����
    		}
    	}
    }
}
