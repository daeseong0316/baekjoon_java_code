import java.io.*;
import java.util.*;

public class bj1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int k = Integer.parseInt(str[1]);
        
        Deque<Integer> que = new ArrayDeque<>();
        
        for(int i=1;i<=n;i++) {
        	que.offer(i);
        }
        
        StringBuilder sb = new StringBuilder("<");
        int i = 0;
        while(!que.isEmpty()) {
        	for(int j=0;j<k-1;j++) {
        		que.offer(que.poll());
        	}
        	sb.append(que.poll());
        	if (!que.isEmpty()) {
                sb.append(", ");
            }
        	i++;
        }
        
        sb.append(">");
        
        bw.write(sb.toString());
        
        bw.flush();
        bw.close();
    }
}
