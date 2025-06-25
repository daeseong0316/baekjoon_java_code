import java.io.*;
import java.util.*;

public class bj11726 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        
        int[] dp = new int[1001];	// ���� n ����(1�̻� 1000����)
        
        // �ʱⰪ
        dp[1] = 1;
        dp[2] = 2;
        
        for(int i=3;i<=1000;i++) {
        	// ��Ģ
        	dp[i] = (dp[i-2] + dp[i-1]) % 10007;
        }
        int n = Integer.parseInt(br.readLine());	// n ��°
        
        bw.write(String.valueOf(dp[n]));	// �� ���
        
        bw.flush();
        bw.close();
    }
}
