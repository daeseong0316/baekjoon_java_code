import java.io.*;
import java.util.*;

public class bj10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());	// 명령의 수
        
        Deque<Integer> que = new ArrayDeque<>();
        
        for(int i=0;i<n;i++) {
        	String[] str = br.readLine().split(" ");	// 입력 받기
        	String op = str[0];	// 명령
        	int x = 0;
        	switch(op) {
        	case "push_front": 	// 정수 X를 덱의 앞에 넣는다.
        		x = Integer.parseInt(str[1]);
        		que.addFirst(x);
        		break;
        	case "push_back":	// 정수 X를 덱의 뒤에 넣는다.
        		x = Integer.parseInt(str[1]);
        		que.addLast(x);
        		break;
        	case "pop_front":	// 덱의 가장 앞에 있는 수를 빼고, 그 수를 출력
        		if(que.isEmpty()) {		
        			System.out.println("-1");
        		}
        		else {		
        			System.out.println(que.pollFirst());
        		}
        		break;
        	case "pop_back":	// 덱의 가장 뒤에 있는 수를 빼고, 그 수를 출력
        		if(que.isEmpty()) {
        			System.out.println("-1");
        		}
        		else {
        			System.out.println(que.pollLast());
        		}
        		break;
        	case "size":	// 덱에 들어있는 정수의 개수를 출력
        		System.out.println(que.size());
        		break;
        	case "empty":	// 덱이 비어있으면 1을, 아니면 0을 출력
        		if(que.isEmpty()) {
        			System.out.println("1");
        		}
        		else {
        			System.out.println("0");
        		}
        		break;
        	case "front":	// 덱의 가장 앞에 있는 정수를 출력
        		if(que.isEmpty()) {
        			System.out.println("-1");
        		}
        		else {
        			System.out.println(que.getFirst());
        		}
        		break;
        	case "back":	// 덱의 가장 뒤에 있는 정수를 출력
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
