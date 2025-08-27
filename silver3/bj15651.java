import java.io.*;
import java.util.*;

public class bj15651 {
	static int[] arr;              // ������� ���õ� ����(���� M)
	static boolean[] visit;        // ���� ��� ���� (���� �ڵ忡���� ������� ����)
	static StringBuilder sb = new StringBuilder();  // ��� ����� �� ���� ��Ƶδ� ����
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // �Է�: N, M (1���� N���� �ڿ��� �߿��� �ߺ� ���� M�� ����)
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);   // �ִ� ���� N
        int m = Integer.parseInt(str[1]);   // ���� ���� M
        
        arr = new int[m];       // ���̰� M�� ���� ����� �迭
        visit = new boolean[n]; // �湮 üũ �迭 (���� �ڵ忡���� ��� �� ��)
        
        // ���� �켱 Ž�� ����
        // depth = ������� ������ ���� ����
        // start = �ݺ��� ���� ���� (�ߺ� ������, �������� ����)
        dfs(n, m, 0);
        
        // ���
        bw.write(sb.toString());
        
        br.close();
        bw.flush();
        bw.close();
    }
    
    // dfs : ��Ʈ��ŷ���� ������ �����ϴ� �Լ�
    public static void dfs(int n, int m, int depth) {
    	// ���� ����: ���� ���� ����(depth)�� M�� �������� ��
    	if(depth == m) {
    		for(int val: arr) {
    			sb.append(val).append(" "); // ���� ���Ҹ� ��� ���ۿ� �߰�
    		}
    		sb.append("\n");  // �� �� ��� �� ����
    		return;           // ��� ����
    	}	
    	
    	// ���� depth ��ġ���� ������ �� �ִ� ���ڵ��� ���ʷ� �õ�
    	for(int i = 1; i <= n; i++) {
    		arr[depth] = i;                  // ���� ��ġ�� i ����
    		dfs(n, m, depth+1);         // ���� depth�� �̵�
    		// �� �̷��� �ϸ� ���� ���� ������ ���� �ǰ�, �������� ������ �������
    	}
    }
}
