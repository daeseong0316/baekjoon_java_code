import java.io.*;
import java.util.*;

public class bj11004 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());	// ���� n��
        int k = Integer.parseInt(st.nextToken());	// ã�� �ε��� ��ġ
        
        List<Integer> list = new ArrayList<>();	// ���ڸ� ������ list��ü ����
        st = new StringTokenizer(br.readLine());	// StringToken�� �ٽ� ����ϱ� ���� �ʱ�ȭ
        for(int i=0;i<n;i++) {
        	int num = Integer.parseInt(st.nextToken());	// ���� �Է�
        	list.add(num);	// list�� ����
        }
        
        Collections.sort(list);	// list ����
        
        bw.write(list.get(k-1) + "\n");	// ���ϴ� �ε��� ���
        
        bw.flush();
        bw.close();
    }
}
