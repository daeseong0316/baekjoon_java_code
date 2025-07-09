import java.io.*;
import java.util.*;

public class bj2740 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        
        int[][] arr1 = new int[n][m];	// n*m �迭
        for(int i=0;i<n;i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	for(int j=0;j<m;j++) {
        		arr1[i][j] = Integer.parseInt(st.nextToken());	// ��Ŀ� �� �Է�
        	}
        }
        
        String[] str1 = br.readLine().split(" ");
        int m2 = Integer.parseInt(str1[0]);
        int k = Integer.parseInt(str1[1]);
        
        if (m != m2) {
            throw new IllegalArgumentException("��� ������ �Ұ����մϴ�");
        }
        
        int[][] arr2 = new int[m2][k];	// m2*k �迭
        for(int i=0;i<m2;i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	for(int j=0;j<k;j++) {
        		arr2[i][j] = Integer.parseInt(st.nextToken());	// ��Ŀ� �� �Է�
        	}
        }
        
        int[][] arr3 = new int[n][k];
        for(int i=0;i<n;i++) {
        	for(int j=0;j<k;j++) {
        		for(int l=0;l<m;l++) {
        			arr3[i][j] += arr1[i][l] * arr2[l][j];	 // ����� ��
        		}
        	}
    	}
        
        for(int i=0;i<n;i++) {
        	for(int j=0;j<k;j++) {
        		bw.write(arr3[i][j] + " ");	// ���
        	}
        	bw.newLine();
        }
        
        bw.flush();
        bw.close();
    }
}
