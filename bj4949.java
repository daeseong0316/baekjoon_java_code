import java.io.*;
import java.util.*;

public class bj4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringBuilder sb = new StringBuilder();		// ����� ���� ����
        
        String line;
        while(!(line = br.readLine()).equals(".")) {	// '.'�� ������ ���� ����
        	Stack<Character> stack = new Stack<>();
        	boolean check = true;	// ������ ���� �ִ��� Ȯ��
        	
        	for(int i=0;i<line.length();i++) {
        		char c = line.charAt(i);	// �ϳ��� Ȯ��
        		
        		if(c == '(' || c == '[') {
        			stack.push(c);	// ���� ��ȣ�� ���ÿ� �ִ´�
        		}
        		else if(c == ')') {	// ������ �ݴ� ��ȣ(')')�̸鼭
        			if(stack.isEmpty() || stack.peek() != '(') {	
        				check = false;	// ������ ��� ���� �ʰ� ������ ���� ���� ��ȣ�� ('(')�̸�
        				break;
        			}
        			else {
        				stack.pop();	// �ƴϸ� ������ ���� ���� ���� ����
        			}
        		}
        		else if(c == ']') {
        			if(stack.isEmpty() || stack.peek() != '[') {
        				check = false;	// ������ ��� ���� �ʰ� ������ ���� ���� ��ȣ�� ('[')�̸�
        				break;
        			}
        			else {
        				stack.pop();	// �ƴϸ� ������ ���� ���� ���� ����
        			}
        		}
        	}
        	if(!stack.isEmpty()) {	// ���� ������ ����� �ִٸ�
        		check = false;	
        	}
        	
        	if(check) {	// ��ȣ ������ �� ���� �ִٸ� 
        		sb.append("yes\n");
        	}
        	else {
        		sb.append("no\n");
        	}
        }
        
        bw.write(sb.toString());	// ���
        
        bw.flush();
        bw.close();
    }
}
