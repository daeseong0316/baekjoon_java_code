import java.io.*;
import java.util.*;

public class bj2217 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());	// n 개의 로프
        
        int[] arr = new int[n];	// 로프를 담을 배열
        for(int i=0;i<n;i++) {
        	arr[i] = Integer.parseInt(br.readLine());	// 각각의 로프의 최대 중량
        }
        
        Arrays.sort(arr);	// 로프 정렬

        int result = 0;
        for(int i=0;i<n;i++) {
        	int sum = arr[i] * (n-i);	// arr[i]를 최소 로프로 사용할 때, 남은 로프 개수 = (n - i)
        	
        	if(result < sum) {
        		result = sum;	// 가장 큰 값
        	}
        }
        
        bw.write(String.valueOf(result));	// 출력
        
        bw.close();
    }
}
