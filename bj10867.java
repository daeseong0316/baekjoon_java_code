import java.io.*;
import java.util.*;

public class bj10867 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());	// n���� ����
        
        Set<Integer> set = new HashSet<>();	//set�� �ߺ��� ������� ����
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) {        	
        	int num = Integer.parseInt(st.nextToken());	// ���� �Է�
        	set.add(num);	// set�� ���� �ֱ�
        }
        List<Integer> list = new ArrayList<>(set);	// ������ ����ϱ� ���� list�� set ���빰 �ֱ�
        Collections.sort(list);	// ����
        
        for(int i: list) {
        	bw.write(i + " ");	// ���
        }
        
        
        bw.flush();
        bw.close();
    }
}
