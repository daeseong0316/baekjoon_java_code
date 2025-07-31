import java.io.*;
import java.util.*;

public class bj2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);	// ������ ��
        int m = Integer.parseInt(str[1]);	// �ʿ��� ������ ����(�Ű����� ����: �ִ� �� )
        
        int max = 0;	// ���� ū ���� ����
        int[] arr = new int[n];	// ���� ���̸� ���� �迭
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) {
        	arr[i] = Integer.parseInt(st.nextToken());
        	if(arr[i] > max) {	// ���� ū ���� ã��
        		max = arr[i];
        	}
        }
        
        int result = 0;	// ��� ����
        
        // �̺� Ž��
        int start = 0;
    	int end = max;
    	while(start <= end) {
    		int mid = (start + end) / 2;
    		
    		long total = TreeSum(arr, mid);	// �߸� ���� ������ ��
    		
    		if(total >= m) {
    			result = mid;	
	    		start = mid+1;
	    	}
	    	else {
	    		end = mid-1;
	    	}
    	}
    	
        bw.write(String.valueOf(result));	// ���
        
        bw.flush();
        bw.close();
    }
    public static long TreeSum(int[] tree, int h) {	// �߸� ���� ���̸� ���ϴ� �Լ�
    	long sum = 0;
    	
    	for(int i: tree) {
    		if(i > h) {
    			sum += i - h;
    		}
    	}
    	return sum;
    }
}
