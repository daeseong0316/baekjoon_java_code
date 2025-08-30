import java.io.*;
import java.util.*;

public class bj110053 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());	// ���� n��
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
        	arr[i] = Integer.parseInt(st.nextToken());	// n���� ��
        }
        int[] dp = new int[n];

        // LIS�� �ּ� ���̰� 1
        for (int i = 0; i < n; i++) {
            dp[i] = 1;	// �� ���Ҹ� ���������� �ϴ� LIS�� �ּ� ���̴� 1
        }

        int maxLen = 1;	// ����
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) {	// arr[i]�� arr[j]���� ũ�� LIS ���� ����
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }	
            maxLen = Math.max(maxLen, dp[i]);
        }

        bw.write(String.valueOf(maxLen));	// ���
        
        bw.flush();
        bw.close();
    }
}
