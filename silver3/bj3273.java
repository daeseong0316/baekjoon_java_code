import java.io.*;
import java.util.*;

public class bj3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());	// 수열의 크기 n
        
        int[] arr = new int[n];	
         StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) {
        	arr[i] = Integer.parseInt(st.nextToken());	// n개의 자연수
        }
        
        int m = Integer.parseInt(br.readLine());	// 원하는 x값
        
        int count = 0;	// 두 수의 합이 x가 되는 개수
        int left = 0, right = arr.length-1;	// 두 포인터 초기 값
        
        Arrays.sort(arr);	// 배열 정렬
        
        while(left < right) {	// left가 right보다 크면 반복을 멈춤
        	int sum = arr[left] + arr[right];	// 두 수의 합
        	if(sum == m) {	// 두 수의 합이 같으면 count 증가
        		count++;
        		left++;
        		right--;
        	}
        	else if(sum < m) {	// sum이 더 작으면 left 증가
        		left++;
        	}
        	else {	// sum이 더 크면 right 감소
        		right--;
        	}
        }
        
        bw.write(String.valueOf(count));	// 개수 출력
        
        br.close();
        bw.flush();
        bw.close();
    }
}
