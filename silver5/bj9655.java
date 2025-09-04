import java.io.*;
import java.util.*;

public class bj9655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());	// 돌 n개
        
        boolean[] dp = new boolean[n+1];
        
        // dp 초기값
        if(n >= 1) dp[1] = true;
        if(n >= 2) dp[2] = false;
        if(n >= 3) dp[3] = true;
        
        // 점화식
        for(int i=4;i<=n;i++) {
        	dp[i] = !dp[i-1] || !dp[i-3];
        }
        
        // 결과
        if(dp[n]) {
        	bw.write("SK");
        }
        else {
        	bw.write("CY");
        }
        
        br.close();
        bw.flush();
        bw.close();
    }
}
