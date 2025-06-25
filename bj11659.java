import java.io.*;
import java.util.*;

public class bj11659 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());	// ���� n��
        int m = Integer.parseInt(st.nextToken());	// ���� m��
        
        int[] arr = new int[n];		// ���� ������ �迭
        String[] num = br.readLine().split(" ");	// ���� �Է�
        for(int k=0;k<n;k++) {
        	arr[k] = Integer.parseInt(num[k]);	// �迭�� ���� �ֱ�
        }
        
        // ���� �� ���
        int[] prefix_sum = new int[n + 1];   // prefix_sum[0] = 0 (�ڹٿ����� �迭 ������ �ڵ����� 0���� �ʱ�ȭ)
        for (int i = 1; i <= n; i++) {
        	// prefix_sum[i] �ε����� arr[0]���� i��° �������� ���� �ִ´�.
            prefix_sum[i] = prefix_sum[i - 1] + arr[i - 1];
        }
        
        for(int k=0;k<m;k++) {
        	st = new StringTokenizer(br.readLine());	// StringToken �ʱ�ȭ
        	int i = Integer.parseInt(st.nextToken());	// i ��
        	int j = Integer.parseInt(st.nextToken());	// j ��
        	
        	
        	bw.write(prefix_sum[j] - prefix_sum[i-1] + "\n");	// ���� ���
        }
        
        bw.flush();
        bw.close();
    }
}
