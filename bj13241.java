import java.io.*;
import java.util.*;

public class bj13241 {
	public static long GCD(long a, long b) {	// ��Ŭ���� ȣ����
		while(b != 0) {	// c(������)�� 0�� �� ������ ���� �ݺ�
			long temp = b;
			b = a % b; 
			a = temp;
		}
		return a;	// �ִ����� ��ȯ
	}
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Integer.parseInt(st.nextToken());
        long b = Integer.parseInt(st.nextToken());
        
        long c = GCD(a, b);
        
        // �ּҰ���� ���ϱ�
        long result = 0;
        if(c == 1) {	// ���μ��� ���
        	result = a * b;
        }
        else {	
        	result = (a * b) / c; 
        }
        
        bw.write(String.valueOf(result));
        
        bw.flush();
        bw.close();
    }
}
