import java.io.*;
import java.util.*;

public class bj14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);	// ���� s1�� ���� �Ǿ� �ִ� ���ڿ� ��
        int m = Integer.parseInt(str[1]);	// �˻��� ���ڿ� ��
        
        Set<String> set = new HashSet<>();
        
        for(int i=0;i<n;i++) {
        	set.add(br.readLine());	// ���� s1�� ���� �Ǿ� �ִ� ���ڿ�
        }

        int count = 0;	// ���� �� �� ����
        
        for(int i=0;i<m;i++) {
        	if(set.contains(br.readLine())) {	// ���� �Ǿ� �ִ��� Ȯ��
        		count++;
        	}
        }
        	
        bw.write(String.valueOf(count));	// ���� ���
        
        bw.flush();
        bw.close();
    }
}
