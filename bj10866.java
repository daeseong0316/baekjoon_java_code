import java.io.*;
import java.util.*;

public class bj10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());	// ����� ��
        
        Deque<Integer> que = new ArrayDeque<>();
        
        for(int i=0;i<n;i++) {
        	String[] str = br.readLine().split(" ");	// �Է� �ޱ�
        	String op = str[0];	// ���
        	int x = 0;
        	switch(op) {
        	case "push_front": 	// ���� X�� ���� �տ� �ִ´�.
        		x = Integer.parseInt(str[1]);
        		que.addFirst(x);
        		break;
        	case "push_back":	// ���� X�� ���� �ڿ� �ִ´�.
        		x = Integer.parseInt(str[1]);
        		que.addLast(x);
        		break;
        	case "pop_front":	// ���� ���� �տ� �ִ� ���� ����, �� ���� ���
        		if(que.isEmpty()) {		
        			System.out.println("-1");
        		}
        		else {		
        			System.out.println(que.pollFirst());
        		}
        		break;
        	case "pop_back":	// ���� ���� �ڿ� �ִ� ���� ����, �� ���� ���
        		if(que.isEmpty()) {
        			System.out.println("-1");
        		}
        		else {
        			System.out.println(que.pollLast());
        		}
        		break;
        	case "size":	// ���� ����ִ� ������ ������ ���
        		System.out.println(que.size());
        		break;
        	case "empty":	// ���� ��������� 1��, �ƴϸ� 0�� ���
        		if(que.isEmpty()) {
        			System.out.println("1");
        		}
        		else {
        			System.out.println("0");
        		}
        		break;
        	case "front":	// ���� ���� �տ� �ִ� ������ ���
        		if(que.isEmpty()) {
        			System.out.println("-1");
        		}
        		else {
        			System.out.println(que.getFirst());
        		}
        		break;
        	case "back":	// ���� ���� �ڿ� �ִ� ������ ���
        		if(que.isEmpty()) {
        			System.out.println("-1");
        		}
        		else {
        			System.out.println(que.getLast());
        		}
        		break;
        	}
        }
        
        bw.flush();
        bw.close();
    }
}
