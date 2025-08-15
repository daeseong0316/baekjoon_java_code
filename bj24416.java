import java.io.*;
import java.util.*;

public class bj24416 {
	static int fibCount = 0;	// ��� Ƚ�� 
	static int fibonacciCount = 0;		// ���� ����
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());	// n�� �Ǻ���ġ ��
        
        fib(n);	// ���
        fibonacci(n);	// ����
        bw.write(fibCount + " " + fibonacciCount);	// ���� ���
        
        bw.flush();
        bw.close();
    }
    public static int fib(int n) {	// ���ȣ��
        if (n == 1 || n == 2) {		// n�� 1 �Ǵ� 2��� Ƚ�� ���� 
        	fibCount++;
        	return 1;
        }	// �ڵ�1
        else {
        	return (fib(n - 1) + fib(n - 2));
        }
    }
    public static int fibonacci(int n) {	// ���� ���α׷���
    	int[] f = new int[n+1];
    	f[1] = 1;
    	f[2] = 1;
        for(int i=3;i<=n;i++) {	// 1,2�� �̹� ������ �����Ƿ� 3���� ����
            f[i] = f[i - 1] + f[i - 2];  // �ڵ�2
            fibonacciCount++;
        }
        return f[n];
    }
}
