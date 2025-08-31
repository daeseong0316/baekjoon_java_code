import java.io.*;
import java.util.*;

public class bj2576 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        LinkedList<Integer> list = new LinkedList<>();
        
        int count = 7; 
        for(int i=0;i<count;i++) {
        	int n = Integer.parseInt(br.readLine());
        	if((n % 2) == 1) {
        		list.add(n);
        	}
        }

        Collections.sort(list);
        
        int sum = 0;
        for(int i=0;i<list.size();i++) {
        	sum += list.get(i);
        }
        
        if(list.size() < 1) {
        	bw.write("-1");
        }
        else {
        	bw.write(sum + "\n" + list.get(0));
        }
        
        bw.flush();
        bw.close();
    }
}
