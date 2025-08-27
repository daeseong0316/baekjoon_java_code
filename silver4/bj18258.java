import java.io.*;
import java.util.*;

public class bj18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());	// 명령의 수
        
        Deque<Integer> que = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<n;i++) {
        	String[] str = br.readLine().split(" ");	// 입력 받기
        	String op = str[0];	// 명령
        	int x = 0;
        	switch(op) {
        	case "push": 	// 정수 X를 덱의 앞에 넣는다.
        		x = Integer.parseInt(str[1]);
        		que.offer(x);
        		break;
        	case "pop":	// 큐의 가장 앞에 있는 수를 빼고, 그 수를 출력
        		if(que.isEmpty()) {		
        			bw.write("-1\n");
        		}
        		else {		
        			bw.write(que.poll() + "\n");
        		}
        		break;
        	case "size":	// 큐에 들어있는 정수의 개수를 출력
        		bw.write(que.size() + "\n");
        		break;
        	case "empty":	// 큐가 비어있으면 1을, 아니면 0을 출력
        		if(que.isEmpty()) {
        			bw.write("1\n");
        			System.out.println();
        		}
        		else {
        			bw.write("0\n");
        		}
        		break;
        	case "front":	// 큐의 가장 앞에 있는 정수를 출력
        		if(que.isEmpty()) {
        			bw.write("-1\n");
        		}
        		else {
        			bw.write(que.peek() + "\n");
        		}
        		break;
        	case "back":	// 큐의 가장 뒤에 있는 정수를 출력
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
