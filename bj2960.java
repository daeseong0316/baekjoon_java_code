import java.io.*;
import java.util.*;

public class bj2960 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); 	// n������ ��
        int k = Integer.parseInt(st.nextToken());	// k��° ������ �� 
        
        boolean[] removed = new boolean[n+1];	// ���� �Ǻ�
        int count = 0;	
        
        for(int p=2;p<=n;p++) {	// 2���� n������ ������
        	if(!removed[p]) {	// ���� ������ �ʾҴٸ�
        		for(int multiple=p;multiple<=n;multiple+=p) {
        			if(!removed[multiple]) {	// p�� ��� ũ�� ������ �����
        				removed[multiple] = true;	// ���� ����
        				count++;	// ���� Ȯ��
        				
        				if(count == k) {	// ���� ������ ������
        					bw.write(String.valueOf(multiple));	// k���� ������ �� ���
        					bw.flush();
        			        bw.close();
        			        return;
        				}
        			}
        		}
        	}
        }
        
        bw.flush();
        bw.close();
    }
}
