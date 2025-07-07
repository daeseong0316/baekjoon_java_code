import java.io.*;
import java.util.*;

public class bj2167 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        // 2���� �迭
        int n = Integer.parseInt(st.nextToken());	// n��° ��	
        int m = Integer.parseInt(st.nextToken());	// m��° ��
        
        int[][] arr = new int[n][m];	// n,m ����� ���� 2���� �迭 ����
        for(int i=0;i<n;i++) {
        	st = new StringTokenizer(br.readLine());
        	for(int j=0;j<m;j++) {
        		arr[i][j] = Integer.parseInt(st.nextToken());	// �迭 �ȿ� ���� �ֱ�
        	}
        }
        
        int k = Integer.parseInt(br.readLine());	// ���� ���� �κ��� ����
        for(int i=0;i<k;i++) {
        	st = new StringTokenizer(br.readLine());
        	// ��ġ (i, j)
        	int num1 = Integer.parseInt(st.nextToken());	
        	int num2 = Integer.parseInt(st.nextToken());
        	// ��ġ (x, y)
        	int num3 = Integer.parseInt(st.nextToken());
        	int num4 = Integer.parseInt(st.nextToken());
        	
        	int sum = 0;
        	for(int j=num1-1;j<=num3-1;j++) {
        		for(int o=num2-1;o<=num4-1;o++) {
        			sum += arr[j][o];
        		}
        	}
        	bw.write(sum + "\n");	// ���
        }
        
        bw.flush();
        bw.close();
    }
}
