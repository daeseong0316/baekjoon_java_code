import java.io.*;
import java.util.*;

public class bj15649 {
	static int[] arr;	// 현재 선택된 순열 저장
	static boolean[] visit;	// 숫자 사용 여부
	static StringBuilder sb = new StringBuilder();	// 문자열 출력 버퍼
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        
        arr = new int[m];
        visit = new boolean[n];
        dfs(n, m, 0);
        
        bw.write(sb.toString());	// 순열 출력
        
        br.close();
        bw.flush();
        bw.close();
    }
    public static void dfs(int n, int m, int depth) {
    	if(depth == m) {	// 순열의 길이가 m이 되면 출력
    		for(int val: arr) {
    			sb.append(val).append(" ");	// 현재 순열을 문자열에 저장
    		}
    		sb.append("\n");	// 엔터
    		return;
    	}
    	for(int i=0;i<n;i++) {	// 1부터 n까지 숫자를 차례대로 시도
    		if(!visit[i]) {	// 아직 사용하지 않은 숫자라면
    			visit[i] = true;	// 방문 처리
    			arr[depth] = i+1;	// 현재 위치에 숫자 저장 
    			dfs(n, m, depth+1);	// 다음 깊이 탐색
    			
    			visit[i] = false;	// 백트래킹 방문 해제
    		}
    	}
    }
}
