import java.io.*;
import java.util.*;

public class bj9625 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int k = Integer.parseInt(br.readLine());	// 버튼을 k번 눌렀을 때
        
        int[][] dp = new int[k+1][2];	// dp 배열
        
        // dp 초기식
        dp[0][0] = 0;
        dp[0][1] = 1;
        
        // 점화식
        for(int i=1;i<=k;i++) {
        	dp[i][0] = dp[i-1][0] + dp[i-1][1];
        	dp[i][1] = dp[i-1][0];
        }
         
        bw.write(dp[k][1] + " " + dp[k][0]);	// 출력
        
        br.close();
        bw.flush();
        bw.close();
    }
}
