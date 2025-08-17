import java.io.*;
import java.util.*;

public class bj10820 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str;
        
        while ((str = br.readLine()) != null) {	// EOF������ �Է� �޴´�
        	int count1 = 0;	// �ҹ���
        	int count2 = 0;	// �빮��
        	int count3 = 0;	// ����
        	int count4 = 0;	// ����
        	
        	for(int j=0;j<str.length();j++) {	// ���ڿ��� ���� ��ŭ
        		char c = str.charAt(j);	// ���� �ϳ��� Ȯ��
        		
        		if(c >= 'a' && c <= 'z') {	// �ҹ��� �Ǻ�
        			count1++;
        		}
        		else if(c >= 'A' && c <= 'Z') {	// �빮�� �Ǻ�
        			count2++;
        		}
        		else if(c >= '0' && c <= '9') {	// ���� �Ǻ�
        			count3++;
        		}
        		else if(c == ' ') {	// ���� �Ǻ�
        			count4++;
        		}
        	}
        	bw.write(count1 + " " + count2 + " " + count3 + " " + count4 + "\n");	// ���ʴ�� ���
        }
        
        bw.flush();
        bw.close();
    }
}
