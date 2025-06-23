import java.io.*;
import java.util.*;

public class bj2579 {
    public static void main(String[] args) throws IOException {
        
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());	// ��� ����
        
        int[] score = new int[n];	// ����
        int[] dp = new int[n];
        
        for (int i = 0; i < n; i++) {
            score[i] = Integer.parseInt(br.readLine());	//��ܿ� ���� �Է�
        }

        if (n == 1) {	// ����� 1���� ���(1���� ����� ���� ����� �ȴ�)
        	System.out.println(score[0]);
            return;
        }
        if (n == 2) {	// ����� 2���� ���(��� 2���� �������� ��ƾ� �Ѵ�)
            System.out.println(score[0] + score[1]);
            return;
        }

        dp[0] = score[0];	// ����� 1���̸� 1�� ���
        dp[1] = score[0] + score[1];	// ����� 2���̸� 2�� �� ���
        dp[2] = Math.max(score[0] + score[2], score[1] + score[2]);		// ����� 3���̸� (1��°+3��°)�� (2��°+3��°) �� ū ��

        // ����� 4�� �̻��� ���
        for (int i = 3; i < n; i++) {
            dp[i] = Math.max(dp[i - 2] + score[i], dp[i - 3] + score[i - 1] + score[i]);
        }

        // ���� ū �� ���
        System.out.println(dp[n - 1]);
        
        bw.flush();
        bw.close();
    }
}
