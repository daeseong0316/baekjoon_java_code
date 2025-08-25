import java.io.*;
import java.util.*;

public class bj2217 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());	// n ���� ����
        
        int[] arr = new int[n];	// ������ ���� �迭
        for(int i=0;i<n;i++) {
        	arr[i] = Integer.parseInt(br.readLine());	// ������ ������ �ִ� �߷�
        }
        
        Arrays.sort(arr);	// ���� ����

        int result = 0;
        for(int i=0;i<n;i++) {
        	int sum = arr[i] * (n-i);	// arr[i]�� �ּ� ������ ����� ��, ���� ���� ���� = (n - i)
        	
        	if(result < sum) {
        		result = sum;	// ���� ū ��
        	}
        }
        
        bw.write(String.valueOf(result));	// ���
        
        bw.close();
    }
}
