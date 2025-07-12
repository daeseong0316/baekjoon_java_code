import java.io.*;
import java.util.*;

public class bj2822 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        final int q = 8;	// 8������ Ǭ��
        final int s = 5;	// ���� ���� 5���� ����
        
        int[] arr = new int[q];
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<q;i++) {
        	int num = Integer.parseInt(br.readLine());
        	maxheap.offer(num);	// �ٷ� ������������ ������ �ȴ�
        	arr[i] = num;	// ���߿� �ε����� ã�� ���� �迭
        }
        
        int sum = 0;	// �� ������ ����
        List<Integer> maxlist = new ArrayList<>();	// ���� �ε����� �����ϱ� ���� ����Ʈ
        for(int i=0;i<s;i++) {
        	int max = maxheap.poll();	// ���� �� ���� ū ������ ������ �����
        	sum += max;	// ���� ū ���� ������ ����
        	for(int j=0;j<q;j++) {
        		if(max == arr[j]) {	// ������ �ε��� Ȯ��
        			maxlist.add(j+1);	// ���� �ε��� ����
        			break;
        		}
        	}
        }
        
        Collections.sort(maxlist);	// �ε��� ����
        
        bw.write(sum + "\n");	// ���� ��� 
        
        for(int i: maxlist) {
        	bw.write(i + " ");	// �ε��� ���
        }        
        
        bw.flush();
        bw.close();
    }
}
