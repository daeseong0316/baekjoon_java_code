import java.io.*;
import java.util.*;

public class bj1149 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine()); // 집의 수 입력
        
        int[][] arr = new int[n][3]; // 각 집의 비용
        int[][] dp = new int[n][3];  // DP 배열
        
        // 입력 받기
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken()); // 빨강
            arr[i][1] = Integer.parseInt(st.nextToken()); // 초록
            arr[i][2] = Integer.parseInt(st.nextToken()); // 파랑
        }
        
        // 초기화 (첫 번째 집은 자기 비용 그대로)
        dp[0][0] = arr[0][0];
        dp[0][1] = arr[0][1];
        dp[0][2] = arr[0][2];
        
        // DP 점화식 (Math.min 버전)
        for (int i = 1; i < n; i++) {
            dp[i][0] = arr[i][0] + Math.min(dp[i-1][1], dp[i-1][2]); // 현재 빨강
            dp[i][1] = arr[i][1] + Math.min(dp[i-1][0], dp[i-1][2]); // 현재 초록
            dp[i][2] = arr[i][2] + Math.min(dp[i-1][0], dp[i-1][1]); // 현재 파랑
        }
        
        // 마지막 집까지 칠했을 때 최소값
        int result = Math.min(dp[n-1][0], Math.min(dp[n-1][1], dp[n-1][2]));
        
        // 결과 출력
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }
}
