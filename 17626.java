import java.io.*;
import java.util.*;

public class bj17626 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());	//n��
        
        int[] dp = new int[n + 1];	// n+1��ŭ�� dp�迭 ����(n��°�� ���ϱ� ���� n+1ĭ ����)
        
        //�ʱ� ��
        dp[0] = 0;
        
        //��ȭ��
        for(int i=1;i<=n;i++) {
        	dp[i] = i;	// �־��� ��( ��)25 -> 25 )
        	for(int j=1;j*j<=i;j++) {
        		dp[i] = Math.min(dp[i], dp[i-j*j]+1);	
        	}
        }
        
        bw.write(String.valueOf(dp[n]));	// ���
        
        bw.flush();
        bw.close();
    }
}
