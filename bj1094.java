import java.io.*;
import java.util.*;

public class bj1094 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());	// ���ϴ� ����
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();	//  �ڵ����� ���� ���� ���� ã�� ���� �ּ� ��
        pq.add(64);	// ó�� ����� ���� 64�� heap�� ����
        
        while(true) {	// ���� �ݺ�
        	int sum = 0;	// ��� ������� �� �� ����
        	
        	for(int len: pq) {
        		sum += len;	// ��� ������� �� ��
        	}
        	
        	if(sum == n) {	
        		break;	// ��� ������� �� �հ� ���ϴ� ���̰� ������ �ݺ� ����
        	}
        	
        	int min = pq.poll();	// heap���� ���� ���� �� ����
        	min /= 2;	// ���� ���� ���� �������� ����
        	
        	pq.add(min);	// 
        	
        	sum = 0;
        	for(int len: pq) {
        		sum += len;
        	}
        	
        	if(sum < n) {
        		pq.add(min);
        	}
        }
        
        bw.write(String.valueOf(pq.size()));
        
        bw.flush();
        bw.close();
    }
}
