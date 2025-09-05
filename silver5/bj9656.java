import java.io.*;
import java.util.*;

public class bj9656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());	// �� n��
        
        boolean[] dp = new boolean[n+1];
        
        // dp �ʱⰪ
        if(n >= 1) dp[1] = true;
        if(n >= 2) dp[2] = false;
        if(n >= 3) dp[3] = true;
        
        // ��ȭ��
        for(int i=4;i<=n;i++) {
        	dp[i] = !dp[i-1] || !dp[i-3];
        }
        
        // ���
        if(dp[n]) {
        	bw.write("CY");
        }
        else {
        	bw.write("SK");
        }
        
        br.close();
        bw.flush();
        bw.close();
    }
}
