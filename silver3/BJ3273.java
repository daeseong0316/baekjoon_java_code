import java.io.*;
import java.util.*;

public class bj3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());	// ������ ũ�� n
        
        int[] arr = new int[n];	
         StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) {
        	arr[i] = Integer.parseInt(st.nextToken());	// n���� �ڿ���
        }
        
        int m = Integer.parseInt(br.readLine());	// ���ϴ� x��
        
        int count = 0;	// �� ���� ���� x�� �Ǵ� ����
        int left = 0, right = arr.length-1;	// �� ������ �ʱ� ��
        
        Arrays.sort(arr);	// �迭 ����
        
        while(left < right) {	// left�� right���� ũ�� �ݺ��� ����
        	int sum = arr[left] + arr[right];	// �� ���� ��
        	if(sum == m) {	// �� ���� ���� ������ count ����
        		count++;
        		left++;
        		right--;
        	}
        	else if(sum < m) {	// sum�� �� ������ left ����
        		left++;
        	}
        	else {	// sum�� �� ũ�� right ����
        		right--;
        	}
        }
        
        bw.write(String.valueOf(count));	// ���� ���
        
        br.close();
        bw.flush();
        bw.close();
    }
}
