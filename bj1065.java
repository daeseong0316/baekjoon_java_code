import java.io.*;
import java.util.*;

public class bj1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());	// �ڿ��� n
        
        int count = 0;	 // �Ѽ��� ������ ���� �� ����
        if(n < 100) {	// 1~99������ �� �������� ���� ��
        	count = n;
        }
        else {	// �ڿ����� 100 �̻��� ���
        	count = 99;	// 1~99������ ��� �������������� 99�� �̸� ���� 		
	        for(int i=100;i<=n;i++) {	// 100�̻��� ����� �������� ���� ã�� (1000�� ���������� �� ��)
	        	String s = String.valueOf(i);
	        	int a = s.charAt(0) - '0';	// 1�� �ڸ� ��
	               int b = s.charAt(1) - '0';	// 2�� �ڸ� ��
	               int c = s.charAt(2) - '0';	// 3�� �ڸ� ��
	               
	               if ((a - b) == (b - c)) {	// �������� ���
	                   count++;		// ���������� ��� �Ѽ� ���� �߰�
	               }
	        }
        }
        
        bw.write(String.valueOf(count));	// ���
        
        bw.flush();
        bw.close();
    }
}
