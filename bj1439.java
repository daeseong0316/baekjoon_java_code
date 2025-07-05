import java.io.*;
import java.util.*;

public class bj1439 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str = br.readLine();	// 1�� 0���� �� ���ڿ� �Է�
        char[] Carr = str.toCharArray();	// �ϳ��� Ȯ���ϱ� ���� char������ �ٲ� �����Ѵ�.
        
        int count0 = 0, count1 = 0;	// 1->0���� �ٲ��� ��, 0->1�� �ٲ��� ���� Ƚ�� 
        
        if(Carr[0] == '0') {	// ù��° �׷��� ���� Ȯ��
        	count0++;	
        }
        else {
        	count1++;	
        }
        
        for(int i=1;i<Carr.length;i++) {	// ���� ��ü ��ȸ
        	if(Carr[i] != Carr[i-1]) {	// ���ڰ� �ٲ��� ���
        		if(Carr[i] == '0') {
        			count0++;
        		}
        		else {
        			count1++;
        		}
        	}
        }
        
        int result = Math.min(count0, count1);	// Ƚ���� �� ���� ��츦 ã��
        
        bw.write(String.valueOf(result));	// ���� Ƚ�� ���
        
        bw.flush();
        bw.close();
    }
}
