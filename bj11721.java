import java.io.*;
import java.util.*;

public class bj11721 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str = br.readLine();	// ���ڿ� �Է�
        
        StringBuilder sb = new StringBuilder(str);	// ���ڿ��� sb�� �ִ´�
        while(sb.length() > 0) {	// ���� ���ڿ��� ������ �׸�
        	if(sb.length() >= 10) {	// ���� ���ڿ��� 10�� �̻��̸�
        		for(int i=0;i<10;i++) {	// ���� 10�� ���
        			bw.write(sb.charAt(0));	// ���
        			sb.deleteCharAt(0);	// sb���� ����
        		}
        	}
        	else if(sb.length() < 10){	// ���� ���ڿ��� 10�� �̸��̸�
        		bw.write(sb.toString());	// ���� ���ڿ� ��ü ���
        		sb.setLength(0);	// ����
        	}
        	bw.write("\n");	// ����
        }
        
        bw.flush();
        bw.close();
    }
}
