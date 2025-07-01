import java.io.*;
import java.util.*;

public class bj7785 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());	// ���� ��� ��
        
        Map<String, String> map = new HashMap<>();	// ��� �̸�, ��� ����� ������ map ����
        for(int i=0;i<n;i++) {
        	String[] str = br.readLine().split(" ");	
        	String name = str[0];	// ��� �̸�
        	String record = str[1];	// ��� ���
        	
        	map.put(name, record);	// map�� ����
        }
        
        List<String> list = new ArrayList<>();	// �̸��� �����ϱ� ���� list ����
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();	// �÷����� �����ϰ� ��ȸ�ϰ� ���� �ϱ� ���� ��ü ����
        while (iterator.hasNext()) {	// map ��ȸ(���� ��Ұ� �ִ��� Ȯ��)
            Map.Entry<String, String> entry = iterator.next();	// ���� ��� ��ȯ
            if (entry.getValue().equals("leave")) {	// ����� ������(��� ���� Ȯ��)
                iterator.remove();	// �ش� key �� ����
            } else {	
                list.add(entry.getKey());	// �ƴ� key �� list�� ���� 
            }
        }
        
        Collections.sort(list);	// list ����
        
        for(int i=list.size()-1;i>=0;i--) {	// list �������� ���
        	bw.write(list.get(i) + "\n");	// ��� �̸� ���
        }
        
        bw.flush();
        bw.close();
    }
}
