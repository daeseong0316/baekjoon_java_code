import java.io.*;
import java.util.*;

public class bj1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());	// 자연수 n
        
        int count = 0;	 // 한수의 개수를 저장 할 변수
        if(n < 100) {	// 1~99까지는 다 등차수열 적용 됨
        	count = n;
        }
        else {	// 자연수가 100 이상일 경우
        	count = 99;	// 1~99까지는 모두 등차수열임으로 99개 미리 저장 		
	        for(int i=100;i<=n;i++) {	// 100이상일 경우의 등차수열 적용 찾기 (1000은 등차수열이 안 됨)
	        	String s = String.valueOf(i);
	        	int a = s.charAt(0) - '0';	// 1의 자리 수
	               int b = s.charAt(1) - '0';	// 2의 자리 수
	               int c = s.charAt(2) - '0';	// 3의 자리 수
	               
	               if ((a - b) == (b - c)) {	// 등차수열 계산
	                   count++;		// 등차수열일 경우 한수 개수 추가
	               }
	        }
        }
        
        bw.write(String.valueOf(count));	// 출력
        
        bw.flush();
        bw.close();
    }
}
