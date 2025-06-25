import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int t = Integer.parseInt(br.readLine());	// 테스트 개수
        
        for(int i=0;i<t;i++) {
        	long[] dp = new long[101];	// 배열 dp 공간
        	
        	// 초기값
        	dp[1] = 1;
        	dp[2] = 1;
        	dp[3] = 1;
        	
        	
        	for(int j=4;j<=100;j++) {
        		dp[j] = dp[j-3] + dp[j-2];	// 순열 공식
        	}
        	int n = Integer.parseInt(br.readLine());	// n번째 값 구하기
        	
        	bw.write(dp[n] + "\n");	// 결과 값
        }
         
        bw.flush();
        bw.close();
    }
}
