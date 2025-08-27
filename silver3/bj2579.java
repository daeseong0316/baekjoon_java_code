import java.io.*;
import java.util.*;

public class bj2579 {
    public static void main(String[] args) throws IOException {
        
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());	// 계단 개수
        
        int[] score = new int[n];	// 점수
        int[] dp = new int[n];
        
        for (int i = 0; i < n; i++) {
            score[i] = Integer.parseInt(br.readLine());	//계단에 점수 입력
        }

        if (n == 1) {	// 계단이 1개일 경우(1개의 계단이 도착 계단이 된다)
        	System.out.println(score[0]);
            return;
        }
        if (n == 2) {	// 계단이 2개일 경우(계단 2개를 연속으로 밟아야 한다)
            System.out.println(score[0] + score[1]);
            return;
        }

        dp[0] = score[0];	// 계단이 1개이면 1개 밟기
        dp[1] = score[0] + score[1];	// 계단이 2개이면 2개 다 밟기
        dp[2] = Math.max(score[0] + score[2], score[1] + score[2]);		// 계단이 3개이면 (1번째+3번째)와 (2번째+3번째) 중 큰 값

        // 계단이 4개 이상일 경우
        for (int i = 3; i < n; i++) {
            dp[i] = Math.max(dp[i - 2] + score[i], dp[i - 3] + score[i - 1] + score[i]);
        }

        // 제일 큰 값 출력
        System.out.println(dp[n - 1]);
        
        bw.flush();
        bw.close();
    }
}
