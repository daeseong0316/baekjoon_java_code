import java.io.*;
import java.util.*;

public class bj18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());	// ����� ��
        
        Deque<Integer> que = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<n;i++) {
        	String[] str = br.readLine().split(" ");	// �Է� �ޱ�
        	String op = str[0];	// ���
        	int x = 0;
        	switch(op) {
        	case "push": 	// ���� X�� ���� �տ� �ִ´�.
        		x = Integer.parseInt(str[1]);
        		que.offer(x);
        		break;
        	case "pop":	// ť�� ���� �տ� �ִ� ���� ����, �� ���� ���
        		if(que.isEmpty()) {		
        			bw.write("-1\n");
        		}
        		else {		
        			bw.write(que.poll() + "\n");
        		}
        		break;
        	case "size":	// ť�� ����ִ� ������ ������ ���
        		bw.write(que.size() + "\n");
        		break;
        	case "empty":	// ť�� ��������� 1��, �ƴϸ� 0�� ���
        		if(que.isEmpty()) {
        			bw.write("1\n");
        			System.out.println();
        		}
        		else {
        			bw.write("0\n");
        		}
        		break;
        	case "front":	// ť�� ���� �տ� �ִ� ������ ���
        		if(que.isEmpty()) {
        			bw.write("-1\n");
        		}
        		else {
        			bw.write(que.peek() + "\n");
        		}
        		break;
        	case "back":	// ť�� ���� �ڿ� �ִ� ������ ���
        		if(que.isEmpty()) {
        			bw.write("-1\n");
        		}
        		else {
        			bw.write(que.peekLast() + "\n");
        		}
        		break;
        	}
        }
        
        //bw.write(sb.toString());
        
        bw.flush();
        bw.close();
    }
}
