import java.io.*;
import java.util.*;

public class bj2167 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        // 2차원 배열
        int n = Integer.parseInt(st.nextToken());	// n번째 열	
        int m = Integer.parseInt(st.nextToken());	// m번째 행
        
        int[][] arr = new int[n][m];	// n,m 사이즈를 가진 2차원 배열 생성
        for(int i=0;i<n;i++) {
        	st = new StringTokenizer(br.readLine());
        	for(int j=0;j<m;j++) {
        		arr[i][j] = Integer.parseInt(st.nextToken());	// 배열 안에 숫자 넣기
        	}
        }
        
        int k = Integer.parseInt(br.readLine());	// 값을 구할 부분의 개수
        for(int i=0;i<k;i++) {
        	st = new StringTokenizer(br.readLine());
        	// 위치 (i, j)
        	int num1 = Integer.parseInt(st.nextToken());	
        	int num2 = Integer.parseInt(st.nextToken());
        	// 위치 (x, y)
        	int num3 = Integer.parseInt(st.nextToken());
        	int num4 = Integer.parseInt(st.nextToken());
        	
        	int sum = 0;
        	for(int j=num1-1;j<=num3-1;j++) {
        		for(int o=num2-1;o<=num4-1;o++) {
        			sum += arr[j][o];
        		}
        	}
        	bw.write(sum + "\n");	// 출력
        }
        
        bw.flush();
        bw.close();
    }
}
