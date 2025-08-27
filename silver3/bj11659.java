import java.io.*;
import java.util.*;

public class bj11659 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());	// 숫자 n개
        int m = Integer.parseInt(st.nextToken());	// 범위 m개
        
        int[] arr = new int[n];		// 숫자 저장할 배열
        String[] num = br.readLine().split(" ");	// 숫자 입력
        for(int k=0;k<n;k++) {
        	arr[k] = Integer.parseInt(num[k]);	// 배열에 숫자 넣기
        }
        
        // 누적 합 사용
        int[] prefix_sum = new int[n + 1];   // prefix_sum[0] = 0 (자바에서는 배열 생성시 자동으로 0으로 초기화)
        for (int i = 1; i <= n; i++) {
        	// prefix_sum[i] 인덱스에 arr[0]부터 i번째 값까지의 합을 넣는다.
            prefix_sum[i] = prefix_sum[i - 1] + arr[i - 1];
        }
        
        for(int k=0;k<m;k++) {
        	st = new StringTokenizer(br.readLine());	// StringToken 초기화
        	int i = Integer.parseInt(st.nextToken());	// i 값
        	int j = Integer.parseInt(st.nextToken());	// j 값
        	
        	
        	bw.write(prefix_sum[j] - prefix_sum[i-1] + "\n");	// 총합 출력
        }
        
        bw.flush();
        bw.close();
    }
}
