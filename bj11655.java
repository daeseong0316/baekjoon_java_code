import java.io.*;
import java.util.*;

public class bj11655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str = br.readLine();		// ���ڿ� �Է�
        
        StringBuilder st = new StringBuilder();	// �ٲ� ���ڿ��� ���� ����
        for(int i=0;i<str.length();i++) {	// ���ڿ��� ó������ ������ ��ȸ
        	char c = str.charAt(i);	// ���ڸ� �ϳ��� ������
        	if (c >= 'a' && c <= 'z') {	// �ҹ��� ���
        	    st.append((char)('a' + (c - 'a' + 13) % 26));	// 13���� �δ�	
        	} else if (c >= 'A' && c <= 'Z') {	// �빮�� ���
        		st.append((char)('A' + (c - 'A' + 13) % 26));	// 13���� �δ�
        	} else {
        		st.append(c);	// ���ĺ��� �ƴϸ� �״�� ��´�
        	}
        }
        
        bw.write(st.toString());	// �ٲ� ���ڿ� ���
        
        bw.flush();
        bw.close();
    }
}
