import java.io.*;
import java.util.*;

public class bj1620 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] str = br.readLine().split(" "); // ���ϸ� ����n, ���� ���� m�� ���ڿ��� �Է� �� �������� ����
        int n = Integer.parseInt(str[0]);	// ���ϸ��� ����
        int m = Integer.parseInt(str[1]);	// ���� ����
        
        Map<String, Integer> map = new HashMap<>();		// ���ϸ� ������ ������ HashMap 
        String[] arr = new String[n+1];
        for(int i=0;i<n;i++) {
        	String name = br.readLine();	// ���ϸ� �̸� �Է�
        	map.put(name, i+1);		// �̸� ������ �°� ��ȣ ����
        	arr[i+1] = name;
        }
        for(int i=0;i<m;i++) {
        	String found = br.readLine();	// ã�� ���ϸ� �̸� or ��ȣ
	        
        	if(found.matches("\\d+")) {		// found�� �������� �������� Ȯ��
        		int index = Integer.parseInt(found);	// ���ڶ�� ��ȣ Ȯ��
        		bw.write(arr[index]);	// ��ȣ�� �´� �̸� ���
        	}
        	else {
        		bw.write(String.valueOf(map.get(found)));	// �̸��� �´� ��ȣ ���
        	}
        	bw.newLine();	// ����
        }
        
        bw.flush();
        bw.close();
    }
}
