import java.io.*;
import java.util.*;

public class bj13241 {
	public static long GCD(long a, long b) {	// 유클리드 호제법
		while(b != 0) {	// c(나머지)가 0이 될 때까지 무한 반복
			long temp = b;
			b = a % b; 
			a = temp;
		}
		return a;	// 최대공약수 반환
	}
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Integer.parseInt(st.nextToken());
        long b = Integer.parseInt(st.nextToken());
        
        long c = GCD(a, b);
        
        // 최소공배수 구하기
        long result = 0;
        if(c == 1) {	// 서로소일 경우
        	result = a * b;
        }
        else {	
        	result = (a * b) / c; 
        }
        
        bw.write(String.valueOf(result));
        
        bw.flush();
        bw.close();
    }
}
