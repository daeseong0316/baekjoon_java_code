import java.io.*;
import java.util.*;

public class bj11286 { 
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        Queue<Integer> minHeap = new PriorityQueue<>((a,b) -> {
        	int absA = Math.abs(a);
        	int absB = Math.abs(b);
        	if(absA == absB) {
        		return a - b;        		
        	}
        	return absA - absB;
        });
        for(int i=0;i<n;i++) {
        	int num = Integer.parseInt(br.readLine());
        	
        	if(num == 0) {
        		if(minHeap.isEmpty()) {
        			bw.write("0\n");
        		}
        		else {
        			bw.write(minHeap.poll() + "\n");
        		}
        	}
        	else {
        		minHeap.offer(num);
        	}
        }
        bw.flush();
        bw.close();
    }
}
