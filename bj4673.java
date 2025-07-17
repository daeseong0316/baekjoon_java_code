import java.io.*;
import java.util.*;

public class bj4673 {
	public static int d(int n) {	// �����ڸ� ���ϴ� �Լ�
		int sum = n;	// ���� �ڽ��� ���� ���Ѵ�
		while(n > 0) { 
			sum += n % 10;	// �� �ڸ��� ���� ���Ѵ�
			n /= 10;
		}
		return sum;	// �����ڸ� ��ȯ�Ѵ�
	}
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        boolean[] check = new boolean[10001];	// �������� �Ͱ� ���� �ѹ��� ���� Ȯ���ϴ� boolean ��ü 
        
        for(int i=1;i<=10000;i++) {
        	int n = d(i);
        	if(n <= 10000) {
        		check[n] = true;	// �����ڴ� true�� �ٲ۴�
        	}
        }
        
        for(int i=1;i<=10000;i++) {
        	if(!check[i]) {	// true�� �ƴ� ���� ����Ѵ�.(���� �ѹ��� ���� ����Ѵ�)
        		bw.write(i + "\n");
        	}
        }
        
        bw.flush();
        bw.close();
    }
}
