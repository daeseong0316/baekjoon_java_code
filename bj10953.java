import java.io.*;
import java.util.*;

public class bj10953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());	// �׽�Ʈ ����
        
        for(int i=0;i<n;i++) {
        	String[] str = br.readLine().split(",");	// ,�� ���� �� ���� 2�� �Է�
        	int a = Integer.parseInt(str[0]);	// ���� 1��
        	int b = Integer.parseInt(str[1]);	// ���� 2��
        	
        	bw.write(a+b + "\n");	// ���� 1��+2�� ���	
        }
        
        bw.flush();
        bw.close();
    }
}
