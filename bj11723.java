import java.io.*;
import java.util.*;

public class bj11723 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int m = Integer.parseInt(br.readLine());	//������ ��
        
        Set<Integer> s = new HashSet<>();	// set��ü�� �̿��� s��ü���� ����
        for(int i=0;i<m;i++) {
        	String[] str = br.readLine().split(" ");	// str�� ���ڿ��� ������ �������� ������
        	String cmd = str[0];	// �迭�� 0��° ���ڿ��� cmd�� ����
        	int n = 0;
        	if(str.length == 2) {	// ���� str�� �������� ������ �� �迭�� ���̰� 2ĭ�� ���
        		n = Integer.parseInt(str[1]);	// �迭�� 1��° ���ڿ��� n�� ����
        	}
        	
        	switch(cmd) {	// cmd�� �´� ��츦 ã�´�
        	case "add":		// s�� n�� �ֱ�
        		s.add(n);
        		break;
        	case "remove":	// s�� n�� ����
        		s.remove(n);
        		break;
        	case "check":	// s�ȿ� n���� �ִ��� Ȯ�� �� ������ 1��� ������ 0 ���
        		if(s.contains(n)) {
        			bw.write("1\n");
        		}
        		else {
        			bw.write("0\n");
        		}
        		break;
        	case "toggle":	// s�ȿ� n���� ������ ���� ������ n�� �ֱ�
        		if(s.contains(n)) {
        			s.remove(n);
        		}
        		else {
        			s.add(n);
        		}
        		break;
        	case "all":		// s�� ���� {1,2,3,4,...,20}���� �ٲٱ�
        		s.clear();
        		for(int j=1;j<=20;j++) {
        			s.add(j);
        		}
        		break;
        	case "empty":	// s�� ����.
        		s.clear();
        		break;
        	}
        }
        
        bw.flush();
        bw.close();
    }
}
