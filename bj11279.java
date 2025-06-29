import java.io.*;
import java.util.*;

public class bj11279 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());	// 연산 개수 n개
        
        Queue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n;i++) {
        	int num = Integer.parseInt(br.readLine());	// 정수 num
        	
        	if(num == 0) {	// num이 0일 때
        		if(maxheap.isEmpty()) {	// que가 비워져 있으면
        			bw.write("0\n");	// 0 출력
        		}
        		else {      
        			bw.write(maxheap.poll() + "\n");	// 비워져 있지 않으면 가장 큰 값 출력(root 노드 출력) 
        		}
        	}
        	else {	
        		maxheap.offer(num);	// 0이 아니면 que에 num 값 넣기
        	}
        }
        
        bw.flush();
        bw.close();
    }
}
