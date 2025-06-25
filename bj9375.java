import java.io.*;
import java.util.*;

public class bj9375 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int t = Integer.parseInt(br.readLine());	// �׽�Ʈ ����
        
        for(int i=0;i<t;i++) {
        	int n = Integer.parseInt(br.readLine());	// �ǻ��� ��
        	
        	int result = 1;
        	Map<String, Integer> map = new HashMap<>();		// �ǻ��� ������ ������ map
        	for(int j=0;j<n;j++) {
        		String[] str = br.readLine().split(" ");
        		String name = str[0];	// �ǻ��� �̸�
        		String dress = str[1];	// �ǻ��� ����
        		
        		// ���� �̸��� ���� �ǻ��� ����
        		map.put(dress, map.getOrDefault(dress, 0)+1);	// �ǻ��� ���� ���� ����
        	}
        	for(int count: map.values()) {	// �ǻ��� ������ ��ȯ
        		result *= (count + 1);	// ����� �� ���
        	}
        	result -= 1;	// �ƹ��͵� ���� ���� ���
        	
        	bw.write(String.valueOf(result) + "\n");	// ���� ���
        }
         
        bw.flush();
        bw.close();
    }
}
