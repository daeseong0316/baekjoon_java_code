import java.io.*;
import java.util.*;

public class bj11931 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());	// n���� ����
        
        List<Integer> list = new ArrayList<>();	// ������ ���� list ���� ���
        for(int i=0;i<n;i++) {
        	int num = Integer.parseInt(br.readLine());	// ���� �Է�
        	list.add(num);	// list�� �ֱ�
        }
        
        Collections.sort(list);	// ����
        
        for(int i=list.size()-1;i>=0;i--) {
        	bw.write(list.get(i) + "\n");	// ���� �� list�� �Ųٷ� ���
        }
        
        bw.flush();
        bw.close();
    }
}
