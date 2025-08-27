import java.io.*;
import java.util.*;

public class bj28278 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());	// 명령의 수
        
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0;i<n;i++) {
        	String[] str = br.readLine().split(" ");	// 입력 받기
        	String op = str[0];	// 명령
        	int x = 0;
        	switch(op) {
        	case "1": 	// 정수 X를 스택에 넣는다. 
        		x = Integer.parseInt(str[1]);
        		stack.add(x);
        		break;
        	case "2":	// 스택에 정수가 있다면 맨 위의 정수를 빼고 출력
        		if(stack.isEmpty()) {		
        			bw.write("-1\n");
        		}
        		else {		
        			bw.write(stack.pop() + "\n");
        		}
        		break;
        	case "3":	// 스택에 들어있는 정수의 개수를 출력
        		bw.write(stack.size() + "\n");
        		break;
        	case "4":	//  스택이 비어있으면 1, 아니면 0을 출력
        		if(stack.isEmpty()) {
        			bw.write("1\n");
        		}
        		else {
        			bw.write("0\n");
        		}
        		break;
        	case "5":	//  스택에 정수가 있다면 맨 위의 정수를 출력
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
