import java.io.*;
import java.util.*;

public class bj4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringBuilder sb = new StringBuilder();		// 출력을 담을 공간
        
        String line;
        while(!(line = br.readLine()).equals(".")) {	// '.'만 나오면 실행 종료
        	Stack<Character> stack = new Stack<>();
        	boolean check = true;	// 균형이 잡혀 있는지 확인
        	
        	for(int i=0;i<line.length();i++) {
        		char c = line.charAt(i);	// 하나씩 확인
        		
        		if(c == '(' || c == '[') {
        			stack.push(c);	// 왼쪽 괄호는 스택에 넣는다
        		}
        		else if(c == ')') {	// 오른쪽 닫는 괄호(')')이면서
        			if(stack.isEmpty() || stack.peek() != '(') {	
        				check = false;	// 스택이 비워 있지 않고 스택의 제일 위에 괄호가 ('(')이면
        				break;
        			}
        			else {
        				stack.pop();	// 아니면 스택의 제일 위에 것을 뺀다
        			}
        		}
        		else if(c == ']') {
        			if(stack.isEmpty() || stack.peek() != '[') {
        				check = false;	// 스택이 비워 있지 않고 스택의 제일 위에 괄호가 ('[')이면
        				break;
        			}
        			else {
        				stack.pop();	// 아니면 스택의 제일 위에 것을 뺀다
        			}
        		}
        	}
        	if(!stack.isEmpty()) {	// 만약 스택이 비워져 있다면
        		check = false;	
        	}
        	
        	if(check) {	// 괄호 균형이 잘 잡혀 있다면 
        		sb.append("yes\n");
        	}
        	else {
        		sb.append("no\n");
        	}
        }
        
        bw.write(sb.toString());	// 출력
        
        bw.flush();
        bw.close();
    }
}
