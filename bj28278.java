import java.io.*;
import java.util.*;

public class bj28278 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());	// ����� ��
        
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0;i<n;i++) {
        	String[] str = br.readLine().split(" ");	// �Է� �ޱ�
        	String op = str[0];	// ���
        	int x = 0;
        	switch(op) {
        	case "1": 	// ���� X�� ���ÿ� �ִ´�. 
        		x = Integer.parseInt(str[1]);
        		stack.add(x);
        		break;
        	case "2":	// ���ÿ� ������ �ִٸ� �� ���� ������ ���� ���
        		if(stack.isEmpty()) {		
        			bw.write("-1\n");
        		}
        		else {		
        			bw.write(stack.pop() + "\n");
        		}
        		break;
        	case "3":	// ���ÿ� ����ִ� ������ ������ ���
        		bw.write(stack.size() + "\n");
        		break;
        	case "4":	//  ������ ��������� 1, �ƴϸ� 0�� ���
        		if(stack.isEmpty()) {
        			bw.write("1\n");
        		}
        		else {
        			bw.write("0\n");
        		}
        		break;
        	case "5":	//  ���ÿ� ������ �ִٸ� �� ���� ������ ���
        		if(stack.isEmpty()) {
        			bw.write("-1\n");
        		}
        		else {
        			bw.write(stack.peek() + "\n");
        		}
        		break;
        	}
        }
        
        bw.flush();
        bw.close();
    }
}
