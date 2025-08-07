import java.io.*;
import java.util.*;

public class bj1026 {
	static int n;	// n개의 수
	static int[] a, b;	// a배열, b배열
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        n = Integer.parseInt(br.readLine());
        
        a = new int[n];
        b = new int[n];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) {
        	a[i] = Integer.parseInt(st.nextToken());	// a배열 입력
        }
        
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) {
        	b[i] = Integer.parseInt(st.nextToken());	// b배열 입력
        }
        
        bw.write(String.valueOf(funtion(a, b)));	// 최솟값 출력
        
        bw.flush();
        bw.close();
    }
    public static int funtion(int[] a, int[] b) {	// 최솟값 구하는 함수
    	Arrays.sort(a);	// a배열을 오름차순으로 정렬
    	
    	Integer[] bCopy = new Integer[n];
    	for(int i=0;i<n;i++) {
    		bCopy[i] = b[i];	// b배열 복사하기
    	}
    	Arrays.sort(bCopy, Collections.reverseOrder());	// b복사 배열을 내림차순으로 정렬
    	
    	int s = 0;
    	
    	for(int i=0;i<n;i++) {
    		s += a[i] * bCopy[i];	// 식에 대입하기
    	}
    	
    	return s;	// 최솟값 반환
    }
}
