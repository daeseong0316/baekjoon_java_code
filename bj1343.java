import java.io.*;
import java.util.*;

public class bj1343 {
	public static String convert(int count) {	// X�� AAAA, BB�� �����ϴ� �Լ�
		StringBuilder sb = new StringBuilder();
		
		int a = count / 4;	// AAAA�� �� ����
		int b = (count % 4) / 2;	// BB�� �� ����
		
		for(int i=0;i<a;i++) {
			sb.append("AAAA");	// AAAA�� ����
		}
		for(int i=0;i<b;i++) {
			sb.append("BB");	// BB�� ����
		}
		
		return sb.toString();	// ������ ���ڿ��� ��ȯ
	}
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str = br.readLine();	// X�� .�� ���� ���ڿ� �Է� �ޱ�
        
        StringBuilder sb = new StringBuilder();	// ���� �� ���ڿ��� ������ Ŭ����(������ ���忡 ȿ����)
        
        int count = 0;	// X�� ������ Ȯ���� ����
        for(int i=0;i<str.length();i++) {	// ���ڿ� ��ü�� Ȯ��
        	char c = str.charAt(i);	// ���� �ϳ��ϳ� Ȯ��
        	
        	if(c == 'X') {	// c�� X�� ��
        		count++;	// ���� ����
        	}
        	else {	// c�� .�� ���
        		if(count % 2 == 1) {	// .�������� X�� ������ Ȧ���� ���
        			System.out.println("-1");	// ���� �� �����Ƿ� -1 ���
        			return;
        		}
        		sb.append(convert(count));	// X�� AAAA, BB�� �°� ����
        		sb.append('.');	// .�߰�
        		count = 0;	// X�� ������ �ʱ�ȭ
        	}
        }
        
        // ������ ���� X �˻�
        if(count % 2 == 1) {		
        	System.out.println("-1");
        	return;
        }
        sb.append(convert(count));	
        
        System.out.println(sb.toString());	// ���� �� ���ڿ� ���
        
        bw.flush();
        bw.close();
    }
}
