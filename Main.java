import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int t = Integer.parseInt(br.readLine());	// �׽�Ʈ ����
        
        for(int i=0;i<t;i++) {
        	long[] dp = new long[101];	// �迭 dp ����
        	
        	// �ʱⰪ
        	dp[1] = 1;
        	dp[2] = 1;
        	dp[3] = 1;
        	
        	
        	for(int j=4;j<=100;j++) {
        		dp[j] = dp[j-3] + dp[j-2];	// ���� ����
        	}
        	int n = Integer.parseInt(br.readLine());	// n��° �� ���ϱ�
        	
        	bw.write(dp[n] + "\n");	// ��� ��
        }
         
        bw.flush();
        bw.close();
    }
}
