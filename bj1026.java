import java.io.*;
import java.util.*;

public class bj1026 {
	static int n;	// n���� ��
	static int[] a, b;	// a�迭, b�迭
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        n = Integer.parseInt(br.readLine());
        
        a = new int[n];
        b = new int[n];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) {
        	a[i] = Integer.parseInt(st.nextToken());	// a�迭 �Է�
        }
        
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) {
        	b[i] = Integer.parseInt(st.nextToken());	// b�迭 �Է�
        }
        
        bw.write(String.valueOf(funtion(a, b)));	// �ּڰ� ���
        
        bw.flush();
        bw.close();
    }
    public static int funtion(int[] a, int[] b) {	// �ּڰ� ���ϴ� �Լ�
    	Arrays.sort(a);	// a�迭�� ������������ ����
    	
    	Integer[] bCopy = new Integer[n];
    	for(int i=0;i<n;i++) {
    		bCopy[i] = b[i];	// b�迭 �����ϱ�
    	}
    	Arrays.sort(bCopy, Collections.reverseOrder());	// b���� �迭�� ������������ ����
    	
    	int s = 0;
    	
    	for(int i=0;i<n;i++) {
    		s += a[i] * bCopy[i];	// �Ŀ� �����ϱ�
    	}
    	
    	return s;	// �ּڰ� ��ȯ
    }
}
