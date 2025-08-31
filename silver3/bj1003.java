import java.io.*;
import java.util.*;

public class bj1003 {
	// num은 40보다 작은거나 같은 자연수이므로 배열의 공간을 41로 만들어준다.
	static int[] count0 = new int[41];	// 0이 몇번 나오는지
	static int[] count1 = new int[41];	// 1이 몇번 나오는지
	static boolean[] visited = new boolean[41];	// 이미 계산 榮쩝 여부
	
	public static void fibonacci(int n) {	// 피보나치 순열 함수
	    if (n == 0) {	// n이 0일 때
	    	count0[0] = 1;	// 
	    	count1[0] = 0;
	    	visited[0] = true;
	        return; 
	    } 
	    if (n == 1) {	// n이 1일 때
	    	count0[1] = 0;
	    	count1[1] = 1;
	    	visited[1] = true;
	        return;
	    }
	    if(!visited[n]) {	// 0과 1이 아닐 때
	    	// 피보나치 공식
	    	fibonacci(n - 1);	
            fibonacci(n - 2);
            count0[n] = count0[n - 1] + count0[n - 2];	// 0의 개수 
            count1[n] = count1[n - 1] + count1[n - 2];	// 1의 개수
            visited[n] = true;
	    }
	}
    public static void main(String[] args) throws IOException {
        
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        for(int i=0;i<n;i++) {
        	int num = Integer.parseInt(br.readLine());
        	
    		fibonacci(num);
        	
    		bw.write(count0[num] + " " + count1[num] + "\n");
        }
        
        bw.flush();
        bw.close();
    }
}
