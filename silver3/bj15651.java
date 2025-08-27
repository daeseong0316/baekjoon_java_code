import java.io.*;
import java.util.*;

public class bj15651 {
	static int[] arr;              // 현재까지 선택된 수열(길이 M)
	static boolean[] visit;        // 숫자 사용 여부 (현재 코드에서는 사용하지 않음)
	static StringBuilder sb = new StringBuilder();  // 출력 결과를 한 번에 모아두는 버퍼
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 입력: N, M (1부터 N까지 자연수 중에서 중복 없이 M개 선택)
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);   // 최대 숫자 N
        int m = Integer.parseInt(str[1]);   // 수열 길이 M
        
        arr = new int[m];       // 길이가 M인 수열 저장용 배열
        visit = new boolean[n]; // 방문 체크 배열 (현재 코드에서는 사용 안 함)
        
        // 깊이 우선 탐색 시작
        // depth = 현재까지 선택한 원소 개수
        // start = 반복문 시작 숫자 (중복 방지용, 오름차순 유지)
        dfs(n, m, 0);
        
        // 출력
        bw.write(sb.toString());
        
        br.close();
        bw.flush();
        bw.close();
    }
    
    // dfs : 백트래킹으로 조합을 생성하는 함수
    public static void dfs(int n, int m, int depth) {
    	// 종료 조건: 현재 수열 길이(depth)가 M에 도달했을 때
    	if(depth == m) {
    		for(int val: arr) {
    			sb.append(val).append(" "); // 수열 원소를 출력 버퍼에 추가
    		}
    		sb.append("\n");  // 한 줄 출력 후 개행
    		return;           // 재귀 종료
    	}	
    	
    	// 현재 depth 위치에서 선택할 수 있는 숫자들을 차례로 시도
    	for(int i = 1; i <= n; i++) {
    		arr[depth] = i;                  // 현재 위치에 i 저장
    		dfs(n, m, depth+1);         // 다음 depth로 이동
    		// → 이렇게 하면 같은 수를 여러번 고르게 되고, 오름차순 조합이 만들어짐
    	}
    }
}
