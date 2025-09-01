import java.io.*;
import java.util.*;

public class bj17626 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());	//n값 
        
        int[] dp = new int[n + 1];	// n+1만큼의 dp배열 생성(n번째를 구하기 위해 n+1칸 생성)
        
        //초기 값
        dp[0] = 0;
        
        //점화식
        for(int i=1;i<=n;i++) {
        	dp[i] = i;	// 최악의 수( 예)25 -> 25 )
        	for(int j=1;j*j<=i;j++) {
        		dp[i] = Math.min(dp[i], dp[i-j*j]+1);	
        	}
        }
        
        bw.write(String.valueOf(dp[n]));	// 출력
        
        bw.flush();
        bw.close();
    }
}
