import java.io.*;
import java.util.*;

public class bj24416 {
	static int fibCount = 0;	// 재귀 횟수 
	static int fibonacciCount = 0;		// 동적 개수
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());	// n의 피보나치 수
        
        fib(n);	// 재귀
        fibonacci(n);	// 동적
        bw.write(fibCount + " " + fibonacciCount);	// 개수 출력
        
        bw.flush();
        bw.close();
    }
    public static int fib(int n) {	// 재귀호출
        if (n == 1 || n == 2) {		// n이 1 또는 2라면 횟수 증가 
        	fibCount++;
        	return 1;
        }	// 코드1
        else {
        	return (fib(n - 1) + fib(n - 2));
        }
    }
    public static int fibonacci(int n) {	// 동적 프로그래밍
    	int[] f = new int[n+1];
    	f[1] = 1;
    	f[2] = 1;
        for(int i=3;i<=n;i++) {	// 1,2는 이미 정해져 있으므로 3부터 시작
            f[i] = f[i - 1] + f[i - 2];  // 코드2
            fibonacciCount++;
        }
        return f[n];
    }
}
