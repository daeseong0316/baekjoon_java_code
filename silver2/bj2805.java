import java.io.*;
import java.util.*;

public class bj2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);	// 나무의 수
        int m = Integer.parseInt(str[1]);	// 필요한 나무의 길이(매개변수 정의: 최대 값 )
        
        int max = 0;	// 제일 큰 나무 길이
        int[] arr = new int[n];	// 나무 길이를 담을 배열
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) {
        	arr[i] = Integer.parseInt(st.nextToken());
        	if(arr[i] > max) {	// 가장 큰 나무 찾기
        		max = arr[i];
        	}
        }
        
        int result = 0;	// 결과 변수
        
        // 이분 탐색
        int start = 0;
    	int end = max;
    	while(start <= end) {
    		int mid = (start + end) / 2;
    		
    		long total = TreeSum(arr, mid);	// 잘린 나무 길이의 합
    		
    		if(total >= m) {
    			result = mid;	
	    		start = mid+1;
	    	}
	    	else {
	    		end = mid-1;
	    	}
    	}
    	
        bw.write(String.valueOf(result));	// 출력
        
        bw.flush();
        bw.close();
    }
    public static long TreeSum(int[] tree, int h) {	// 잘린 나무 길이를 합하는 함수
    	long sum = 0;
    	
    	for(int i: tree) {
    		if(i > h) {
    			sum += i - h;
    		}
    	}
    	return sum;
    }
}
