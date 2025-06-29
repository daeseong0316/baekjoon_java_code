import java.io.*;
import java.util.*;

public class bj11279 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());	// ���� ���� n��
        
        Queue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n;i++) {
        	int num = Integer.parseInt(br.readLine());	// ���� num
        	
        	if(num == 0) {	// num�� 0�� ��
        		if(maxheap.isEmpty()) {	// que�� ����� ������
        			bw.write("0\n");	// 0 ���
        		}
        		else {      
        			bw.write(maxheap.poll() + "\n");	// ����� ���� ������ ���� ū �� ���(root ��� ���) 
        		}
        	}
        	else {	
        		maxheap.offer(num);	// 0�� �ƴϸ� que�� num �� �ֱ�
        	}
        }
        
        bw.flush();
        bw.close();
    }
}
