import java.io.*;
import java.util.*;

public class bj1764 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] str = br.readLine().split(" ");	
        int n = Integer.parseInt(str[0]);	// �赵 ���� ��� ��
        int m = Integer.parseInt(str[1]);	// ���� ���� ��� ��
        
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<n+m;i++) {
        	String name = br.readLine();
        	
        	map.put(name, map.getOrDefault(name, 0)+1);	// ���� �̸��� ���� ��� value �� 1����
        }
        
        List<String> list = new ArrayList<>();	// �躸���� ����� ���� ����Ʈ(������ ���� ����Ʈ�� ����)
        for(Map.Entry<String, Integer> entry: map.entrySet()) {	
        		if(entry.getValue() == 2) {	// value ���� 2�� ���(�赵 ���ϰ�, ���� ���� ���)
        			list.add(entry.getKey());	// ����Ʈ�� �躸���� ��� �̸� �ֱ�
        		}
        }
        
        Collections.sort(list);	// ���������� ����
        
        bw.write(list.size() + "\n");	// ��� ��
        for(int i=0;i<list.size();i++) {
        	bw.write(list.get(i) + "\n");	// ���� ������ �̸� ���
        }
        
        bw.flush();
        bw.close();
    }
}
